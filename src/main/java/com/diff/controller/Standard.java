package com.diff.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.diff.dto.User;
import com.diff.service.UserService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("controller")
@AllArgsConstructor
public class Standard {
	
	public UserService userService;
	
	@GetMapping
	public @ResponseBody ResponseEntity<List<User>> getAllUsers(){
		return ResponseEntity.ok(userService.getAllUsers());
	}
	
	@GetMapping("page")
	public String getUsersPage(Model model){
		
		List<User> users = userService.getAllUsers();
		model.addAttribute("users", users);
		
		return "users";
	}

}
