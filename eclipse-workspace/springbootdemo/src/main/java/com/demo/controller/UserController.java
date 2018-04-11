package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.bean.TH_USER;
import com.demo.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/test")
	public String test(Model model) {
		List<TH_USER> allUsers = userService.getAllUsers();
		model.addAttribute("users",allUsers);
		return "test";
	}
}
