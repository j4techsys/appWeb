package br.com.j4techsys.acordao.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
	
	private static final SessionFactory SessionFactory;
	public static final String HIBERNATE_SESSION = "hibernate_session";
	
	static{
		try {
			System.out.println("Tentando configurar a SF");
			
			Configuration configuration = new Configuration().configure();
			
			StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder();
			standardServiceRegistryBuilder.applySettings(configuration.getProperties());
			StandardServiceRegistry standardServiceRegistry = standardServiceRegistryBuilder.build();
			
			SessionFactory = configuration.buildSessionFactory(standardServiceRegistry);
			
			System.out.println("Session factory criada corretamente");
		} catch (Exception ex) {
			System.out.println("Ocorreu um erro ao iniciar a SF. " +ex);
			throw new ExceptionInInitializerError(ex);
		}
		
	}
	public static SessionFactory getSessionfactory() {
		return SessionFactory;
	}
	
	
}
