package com.tns.jpaJQPL.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JPAUtil {
	
	// Declaring the private class variables
	
	private static EntityManagerFactory factory;
	private static EntityManager entityManager;
	
	// Defining static block to create EntityManagerFactory
	static
	{
		factory = Persistence.createEntityManagerFactory("JPA-PU");
	}
	

	public static EntityManager getEntityManager() 
	{
		if(entityManager==null || !entityManager.isOpen()) 
		{
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}
	

}
