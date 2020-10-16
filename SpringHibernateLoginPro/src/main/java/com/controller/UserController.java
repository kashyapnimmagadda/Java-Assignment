package com.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.User;
import com.service.UserService;
import com.service.UserServiceImpl;

@Controller
public class UserController {
	private ApplicationContext cont;

	@Autowired
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/home")
	public String view() {
		return "home";
	}

	@RequestMapping("/register")
	public String view2(Model model) {
		cont = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		User user = cont.getBean("info", User.class);
		model.addAttribute("bean", user);
		return "register";
	}

	@RequestMapping("/store")
	public String view3( @ModelAttribute("bean") @Valid User user, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()){
			return "register";
		}
		cont = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserService userService = cont
				.getBean("service", UserServiceImpl.class);
		userService.addUser(user);
		model.addAttribute("msg", "Record inserted successfully...");
		return "register";
	}

}