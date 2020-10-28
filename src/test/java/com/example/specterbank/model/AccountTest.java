package com.example.specterbank.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {

	@Test
	void testGetAccountID() {
		Account acctest1 = new Account();
		acctest1.setAccountID(10001);
		int actualresult = acctest1.getAccountID();
		int expectedresult = 10001;
		assertEquals(expectedresult, actualresult);
		//fail("Not yet implemented");
	}

	/*@Test
	void testSetAccountID() {
		fail("Not yet implemented");
	}

	@Test
	void testGetIfsc() {
		fail("Not yet implemented");
	}

	@Test
	void testSetIfsc() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAccountType() {
		fail("Not yet implemented");
	}

	@Test
	void testSetAccountType() {
		fail("Not yet implemented");
	}

	@Test
	void testGetSavOrCur() {
		fail("Not yet implemented");
	}

	@Test
	void testSetSavOrCur() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAccountBalance() {
		fail("Not yet implemented");
	}

	@Test
	void testSetAccountBalance() {
		fail("Not yet implemented");
	}*/

}
