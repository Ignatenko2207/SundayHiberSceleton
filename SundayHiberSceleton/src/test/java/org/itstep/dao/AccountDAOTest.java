package org.itstep.dao;

import static org.junit.Assert.*;

import org.itstep.model.Account;
import org.junit.Test;

public class AccountDAOTest {

	@Test
	public void testSave() {
		Account acc = new Account("my_login", "123456", "Alex", "Ignatenko");
		AccountDAO.save(acc);
		
		Account accFromDB = AccountDAO.get("my_login");
		
		assertNotNull(accFromDB);
		
		assertEquals("Alex", accFromDB.getFirsName());
		assertEquals("Ignatenko", accFromDB.getSecondName());
	}

}
