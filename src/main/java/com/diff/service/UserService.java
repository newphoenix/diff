package com.diff.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.diff.dto.User;
import com.diff.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {
	
	private UserRepository userRepository;
	
	public List<User> getAllUsers(){
		return userRepository.getAllUsers();
	}

}
