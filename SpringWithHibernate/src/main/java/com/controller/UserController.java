package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.UserDao;
import com.model.User;

@Controller
public class UserController {
	@Autowired
	private UserDao userDao;
	@GetMapping(value="/reader")
	public String readUser(@RequestParam("userName") String username, @RequestParam("password") String password,Model model) {
		User user = new User();
		user.setUserName(username);
		user.setPassword(password);
		model.addAttribute("temp",user);
		boolean isexist = userDao.readUserByNameandId(user);
		if(isexist) {
			return "welcome";
		}
		else {
			return "nouser";
		}
		
	}
}
