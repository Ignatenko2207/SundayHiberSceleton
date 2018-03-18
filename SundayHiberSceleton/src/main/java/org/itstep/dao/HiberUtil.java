package org.itstep.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

class HiberUtil {

	private static SessionFactory sessionFactory = createSessionFactory();

	private static SessionFactory createSessionFactory() {
		Configuration configuration = new Configuration().configure();
		return configuration.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
