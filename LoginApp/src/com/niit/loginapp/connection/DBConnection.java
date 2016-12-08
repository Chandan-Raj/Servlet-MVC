package com.niit.loginapp.connection;
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
	
	private static String userName="sa";
	private static String password="sa";
	private static String url="jdbc:h2:tcp://localhost/~/test";
	private static String driver="org.h2.Driver";	

	private static Connection connection=null;
	private DBConnection()
	{
	}
	
	
	
	
	
	public static Connection getDBConnection() throws ClassNotFoundException,SQLException {
	
		Class.forName(driver);
	connection=DriverManager.getConnection(url,userName, password);
	return connection;
	}
	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		if(getDBConnection()==null){
			System.out.println("could not established the connection");
		}
			else
			{
			System.out.println("connection successfully established");	
			}
		}
	
		
	}
	
	

