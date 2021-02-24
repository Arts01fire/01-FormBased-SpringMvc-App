package com.yogesh.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	
	
	@GetMapping("/loadform")
	public String loadUserForm() {
		return "index";
	}

	@PostMapping("/saveUser")
	public String handleSubmitBtn(HttpServletRequest req, Model model) {

		
		String uid = req.getParameter("uid");
		String uname = req.getParameter("uname");
		String uphn = req.getParameter("uphn");

		System.out.println("User ID :: " + uid);
		System.out.println("Username :: " + uname);
		System.out.println("Phone No :: " + uphn);

		model.addAttribute("msg", "User saved successfully..!!");

		return "success";
	}

}
