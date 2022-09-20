package com.diff.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.diff.dto.User;

@Repository
public class UserRepository {
	
	private static final List<User> USER_DB = List.of(
			User.builder().name("John").surname("Smith").build(),
			User.builder().name("Amanda").surname("Keys").build(),
			User.builder().name("Richard").surname("Stone").build()); 
	
	public List<User> getAllUsers(){
		return USER_DB;
	}
	
}
