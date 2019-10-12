package com.adam.app.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.adam.app.bean.User;
import com.adam.app.dao.UserDao;

public class UserService {
	UserDao dao = new UserDao();

	public User saveUser(User user)

	{
		
		System.out.println("------step2---service-----------------");


		User user2 = dao.saveUser(user);
		
		System.out.println("------step6---return to contoller-----------------");

		return user2;
	}
}
