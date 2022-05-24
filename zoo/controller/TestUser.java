package com.ty.zoo.controller;

import com.ty.zoo.dto.User;
import com.ty.zoo.service.UserService;

public class TestUser {
	
	public static void main(String[] args) {
		
		User user = new User();
		UserService service = new UserService();
		user.setId(1);
		user.setName("Bunny");
		user.setEmail("bunny@gmail.com");
		user.setPassword("Bunny1234");
		user.setPhone("1234567890");
		user.setRole("Admin");
		int res = service.saveUser(user);
		if(res > 0) {
			System.out.println("Data is inserted successfully");
		}
		else
			System.out.println("Something went wrong");
	}
}
