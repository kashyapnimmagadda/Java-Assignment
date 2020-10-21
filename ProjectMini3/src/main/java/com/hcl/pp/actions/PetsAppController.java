package com.hcl.pp.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hcl.pp.model.Pet;
import com.hcl.pp.model.User;
import com.hcl.pp.service.PetService;
import com.hcl.pp.service.PetServiceImpl;
import com.hcl.pp.service.SecurityService;
import com.hcl.pp.service.SecurityServiceImpl;
import com.hcl.pp.service.UserService;
import com.hcl.pp.service.UserServiceImpl;

@Controller
public class PetsAppController {
	private static final Logger LOGGER = Logger
			.getLogger(PetsAppController.class);
	private ApplicationContext cont;

	@RequestMapping(value = "/home")
	public String home(Model model) {
		cont = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		User user = cont.getBean("info", User.class);
		model.addAttribute("bean", user);
		return "userregn";
	}

	@RequestMapping(value = "/loginpage")
	public String loginPage(Model model) {
		cont = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		User user = cont.getBean("info", User.class);
		model.addAttribute("bean", user);
		return "login";
	}

	@RequestMapping("/addpet")
	public String add(Model model) {
		cont = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Pet pet = cont.getBean("petinfo", Pet.class);
		model.addAttribute("bean", pet);
		return "pet_form";
	}

	// User Login Controller Method
	@RequestMapping(value = "/user/authenticate", method = RequestMethod.POST)
	public String authenticateUser(@ModelAttribute("bean") User user,
			HttpSession session, Model model) {
		LOGGER.info("Inside authenticate User Method in controller");
		cont = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		SecurityService securityService = cont.getBean("security",
				SecurityServiceImpl.class);
		boolean isExist = securityService.authenticateUser(user);
		System.out.println(isExist + "incontroller output");
		if (isExist) {
			session.setAttribute("user", user.getUSER_NAME());
			model.addAttribute("userdata", user);
			return "redirect:/pets";
		} else {
			LOGGER.error("Not a valid user");
			model.addAttribute("msg",
					"Either Username or Password or both are invalid");
			return "login";
		}
	}

	// Pet peers Home Page COntroller Method
	@RequestMapping("/pets")
	public String petHome(Model model) {
		LOGGER.info("Inside petHome method in controller");
		cont = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		PetService petService = cont
				.getBean("petservice", PetServiceImpl.class);
		List list = petService.getAllPets();
		if (!list.isEmpty()) {
			model.addAttribute("data", list);
		} else {
			LOGGER.error("No data found");
			model.addAttribute("msg", "Oops! Data not found");
		}
		return "pet_home";
	}

	// User Registration Controller Method
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
		LOGGER.info("Inside addUser method in controller");
		UserService userService = cont
				.getBean("service", UserServiceImpl.class);
		boolean isExist = userService.addUser(user);
		if (isExist) {
			return "registered";
		} else {
			model.addAttribute("msg",
					"User Name already in use. Please select a different User Name");
			return "userregn";
		}
	}

	// Buy pet Controller Method
	@RequestMapping("/pets/buyPet/{pet.ID}")
	public void buypet(@PathVariable Long id, Model model) {
		LOGGER.info("Inside buyPet method in controller");
	}

	// Add pet Controller Method
	@RequestMapping("/pet/addpet")
	public String addpet(@ModelAttribute("bean") @Valid Pet pet,
			BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "pet_form";
		}
		cont = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		PetService petService = cont
				.getBean("petservice", PetServiceImpl.class);
		petService.savePet(pet);
		return "redirect:/pets";
	}

	// User Logout Controller Method
	@RequestMapping("/user/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		return "redirect:/loginpage";
	}
}
