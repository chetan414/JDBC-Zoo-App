package com.ty.zoo.controller;

import com.ty.zoo.dto.Visitor;
import com.ty.zoo.service.VisitorService;

public class TestVisitor {
	public static void main(String[] args) {
		
		VisitorService service = new VisitorService();
		Visitor visitor = new Visitor();
		visitor.setId(2);
		visitor.setName("Chetan");
		visitor.setEmail("chetan@gmail.com");
		visitor.setGender("male");
		visitor.setPhone("9535459554");
		visitor.setAge(26);
		
		int res = service.saveVisitor(visitor);
		if(res > 0) {
			System.out.println("Data is inserted successfully");
		}
		else
			System.out.println("Something went wrong data cannot be inserted");
	}
}
