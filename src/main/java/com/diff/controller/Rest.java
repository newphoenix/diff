package com.diff.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.diff.dto.User;
import com.diff.service.UserService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("restcontroller")
@AllArgsConstructor
public class Rest {
	
	public UserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> getAllUsers(){
		return ResponseEntity.ok(userService.getAllUsers());
	}
	
	@GetMapping("restpage")
	public ModelAndView  getAllUsersRestPage(){
		
		List<User> users = userService.getAllUsers();
		ModelAndView mv = new ModelAndView("restUsers", Map.of("users",users));
		
		return mv;
	}

}
