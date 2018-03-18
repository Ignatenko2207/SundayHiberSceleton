package org.itstep.dao;

import org.hibernate.Session;
import org.itstep.model.Account;

public class AccountDAO {

	public static void save(Account account) {
		Session session = HiberUtil.getSessionFactory().openSession();
		
		session.getTransaction().begin();
		
		session.saveOrUpdate(account);
		
		session.getTransaction().commit();
		
		session.close();
	}
	
	public static Account get(String login) {
		Session session = HiberUtil.getSessionFactory().openSession();
		
		session.getTransaction().begin();
		
		Account account = session.get(Account.class, login);
		
		session.getTransaction().commit();
		
		session.close();
	
		return account;
	}
	
	public static void delete(Account account) {
		Session session = HiberUtil.getSessionFactory().openSession();
		
		session.getTransaction().begin();
		
		session.delete(account);
		
		session.getTransaction().commit();
		
		session.close();
	}
}
