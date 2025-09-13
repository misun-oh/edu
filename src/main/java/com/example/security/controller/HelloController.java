package com.example.security.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.security.form.LoginForm;

@Controller
public class HelloController {
	@GetMapping("/")
	private String index(Model model) {
		model.addAttribute("list", Arrays.asList(new String[]{"사과", "배","바나나"}));
		return "index";
	}
	
	@GetMapping("/login")
	public String showLogin(LoginForm form) {
		return "login";
	}
	
	@GetMapping("/secured/user")
	private void suser(Model model) {
		model.addAttribute("list", Arrays.asList(new String[]{"사과", "배","바나나"}));
	}
	
	@GetMapping("/secured/admin")
	private void sadmin(Model model) {
		model.addAttribute("list", Arrays.asList(new String[]{"사과", "배","바나나"}));
	}
	
	@GetMapping("/test/user")
	private void tuser(Model model) {
		model.addAttribute("list", Arrays.asList(new String[]{"사과", "배","바나나"}));
	}
	
	@GetMapping("/test/admin")
	private void tadmin(Model model) {
		model.addAttribute("list", Arrays.asList(new String[]{"사과", "배","바나나"}));
	}
	
}
