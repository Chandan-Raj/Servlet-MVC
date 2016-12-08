package com.niit.loginapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niitloginapp.dao.UserDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

       
    /**
     * @see HttpServlet#HttpServlet()
     */
   
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("calling doPost method");
	}

	/**
	 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("calling doPost method");
		
		String userName=(String) request.getParameter("userName");
		String password=(String) request.getParameter("password");
		
		//create the instance of userDAO
		
		UserDAO userDAO=new UserDAO();
		
		
		//call validation method
		//declare one RequestDispatcher
		RequestDispatcher dispatcher;
		 if (userDAO.isValidUser(userName, password))
			 	 {
			 
			 
			dispatcher=request.getRequestDispatcher("Home.jsp");//just create instance 
			dispatcher.forward(request,response);//forward the request and response to home page
			 
		 }
else
{
	//if it is invalid credentials,else part will execute
	dispatcher=request.getRequestDispatcher("Login.jsp");
	
	//we have to get PrintWriterr object from response object
 PrintWriter writer= response.getWriter();
 writer.println("invalid credentials.please try again...");
	dispatcher.include(request,response);
	 
	
	
}
	}
}
		

		
		
			
	


