package com.example.demo.controller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.entity.userDetails;
import com.example.demo.repository.UserRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class usercontroller {
	
	@Autowired
	private UserRepository repo;
	
	@GetMapping("/")
	public String home() {
		return "index";
		
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute userDetails u,HttpSession session) {
		repo.save(u);
		session.setAttribute("successMessage","form successfully submitted");
	    System.out.println(u);
		return "redirect:/";
		
	}


}


