package com.ty.zoo.service;

import static com.ty.zoo.util.AppConstants.SECRET_KEY;

import com.ty.zoo.dao.UserDao;
import com.ty.zoo.dto.User;
import com.ty.zoo.util.AES;

public class UserService {
	
	
	UserDao dao = new UserDao();
	
	public int saveUser(User user) {
		String encPassword = AES.encrypt(user.getPassword(), SECRET_KEY);
		user.setPhone(encPassword);
		return dao.saveUser(user);
	}
}
