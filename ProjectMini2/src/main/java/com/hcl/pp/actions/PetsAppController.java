package com.hcl.pp.actions;

import java.lang.ProcessBuilder.Redirect;
import java.util.Iterator;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hcl.pp.model.User;
import com.hcl.pp.service.PetService;
import com.hcl.pp.service.PetServiceImpl;
import com.hcl.pp.service.SecurityService;
import com.hcl.pp.service.SecurityServiceImpl;
import com.hcl.pp.service.UserService;
import com.hcl.pp.service.UserServiceImpl;

@Controller
public class PetsAppController {
	private ApplicationContext cont;

	@RequestMapping(value = "/home")
	public String view(Model model) {
		cont = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		User user = cont.getBean("info", User.class);
		model.addAttribute("bean", user);
		return "userregn";
	}

	@RequestMapping(value = "/loginpage")
	public String view2(Model model) {
		cont = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		User user = cont.getBean("info", User.class);
		model.addAttribute("bean", user);
		return "login";
	}

	@RequestMapping(value = "/user/authenticate", method = RequestMethod.POST)
	public String authenticateUser(@ModelAttribute("bean") User user,
			Model model) {
		System.out.println("user authenticate");
		cont = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		SecurityService securityService = cont.getBean("security",
				SecurityServiceImpl.class);
		boolean isExist = securityService.authenticateUser(user);
		System.out.println(isExist + "incontroller output");
		if (isExist) {
			return "redirect:/pets";
		} else
			model.addAttribute("msg",
					"Either Username or Password or both are invalid");
		return "login";
	}

	@RequestMapping("/pets")
	public String petHome(Model model) {
		System.out.println("pets");
		cont = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		PetService petService = cont
				.getBean("petservice", PetServiceImpl.class);
		List list = petService.getAllPets();
		for (Object object : list) {
			System.out.println(object);
		}
		if (!list.isEmpty()) {
			model.addAttribute("data", list);
		} else {
			model.addAttribute("msg", "Oops! Data not found");
		}
		return "pet_home";
	}

	@RequestMapping(value = "/user/add", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("bean") @Valid User user,
			BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "userregn";
		} else if (!(user.getConfirmPassword().equals(user.getUSER_PASSWD()))) {

			model.addAttribute("msg", "Passwords do not match");
			return "userregn";
		}
		cont = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		System.out.println("hii");
		UserService userService = cont
				.getBean("service", UserServiceImpl.class);
		boolean isExist = userService.addUser(user);
		if (isExist) {
			model.addAttribute("msg", "Record inserted successfully...");
			return "registered";
		} else {
			model.addAttribute("msg", "Username already existed");
			return "userregn";
		}
	}
}
