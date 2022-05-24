package com.ty.zoo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ty.zoo.dto.Visitor;
import com.ty.zoo.util.ConnectionObject;

public class VisitorDao {
	
	
	public int saveVisitor(Visitor visitor) {
		int result =0;
		String sql = "Insert into visitor values (?,?,?,?,?,?)";
		Connection connection = ConnectionObject.getConnection();
		try {
			PreparedStatement preparedstatement = connection.prepareStatement(sql);
			preparedstatement.setInt(1, visitor.getId());
			preparedstatement.setString(2, visitor.getName());
			preparedstatement.setString(3, visitor.getEmail());
			preparedstatement.setString(4, visitor.getPhone());
			preparedstatement.setString(5, visitor.getGender());
			preparedstatement.setInt(6, visitor.getAge());
			
			result=preparedstatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public Visitor getVisitorById(int id) {
		Visitor visitor = new Visitor();
		return visitor;
	}
}
