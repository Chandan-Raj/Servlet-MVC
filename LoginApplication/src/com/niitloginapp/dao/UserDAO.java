package com.niitloginapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.niit.loginapp.connection.DBConnection;

public class UserDAO {
private Connection con;	
private PreparedStatement pStatement;
private ResultSet resultSet;
	//CRUD operation
	//Validations
	
	public boolean isValidUser(String userID,String password){
	try {
		con = DBConnection.getDBConnection();
	} catch (ClassNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	
		 String query ="select * from tuser where id=? and password=?";
				 
				 
		 try {
			 pStatement=con.prepareStatement(query);
			 
			 
		  userID=null;
		pStatement.setString(1,userID);
		  password=null;
		pStatement.setString(2,password);
		 
		 resultSet=pStatement.executeQuery();
		 if (resultSet.next()){
			 return true;
		 }
		 return true;
	}
		 catch(SQLException e){
		e.printStackTrace();
	}
		 finally 
		 {
			 try {
		 
				 con.close();
				 pStatement.close();
				 resultSet.close();
			 }
			 catch(SQLException e) {
				 e.printStackTrace();
			 }
		 }
		 return false;
	}
			 }