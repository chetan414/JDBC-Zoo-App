package com.ty.zoo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ty.zoo.dto.User;
import com.ty.zoo.util.ConnectionObject;

public class UserDao {
	
	public int saveUser(User user) {
		int result =0;
		String sql = "Insert into visitor values (?,?,?,?,?,?)";
		Connection connection = ConnectionObject.getConnection();
		try {
			PreparedStatement preparedstatement = connection.prepareStatement(sql);
			preparedstatement.setInt(1, user.getId());
			preparedstatement.setString(2, user.getName());
			preparedstatement.setString(3, user.getEmail());
			preparedstatement.setString(4, user.getPassword());
			preparedstatement.setString(5, user.getRole());
			preparedstatement.setString(6, user.getPhone());
			
			result=preparedstatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
