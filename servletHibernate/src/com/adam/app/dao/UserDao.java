package com.adam.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.adam.app.bean.User;

public class UserDao {
	
	public User saveUser(User user)
	
	{
		
		System.out.println("------step3---Dao-----------------");

		Configuration configuration=new Configuration();
		configuration.configure();
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(user);
		System.out.println("------step4---Saving-----------------");

		transaction.commit();
		session.close();
		System.out.println("------step5---return to service-----------------");

		
		return user;
	}

}
