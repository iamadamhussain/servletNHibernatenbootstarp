package com.adam.app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.adam.app.bean.User;
import com.adam.app.service.UserService;

public class UserController extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//create javabean n set value
		System.out.println("------step1---controller-----------------");
		
		User u=new User();
		u.setFirstname(req.getParameter("firstname"));
		u.setLastname(req.getParameter("lastname"));
		u.setEmail(req.getParameter("email"));
		u.setPassword(req.getParameter("password"));

		
	UserService service=new UserService();
	User retureduser=	service.saveUser(u);
	System.out.println("------step7--- success-----------------");

	
	RequestDispatcher dispatcher=null;
	
	
	dispatcher=req.getRequestDispatcher("success.jsp");
	
	dispatcher.forward(req, resp);

		
		
		
	}
}
