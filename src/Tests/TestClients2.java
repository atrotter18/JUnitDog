/**
 * 
 */
package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Clients;
import model.DogInfo;

/**
 * Aaliyah Trotter - atrotter1@dmacc.edu
 * CIS175 - Fall 2022
 * Dec 1, 2022
 */
public class TestClients2 {
	DogInfo bean = new DogInfo();
	Clients pit = new Clients("Chad");
	
	@Before
	public void setUp() throws Exception{
		
	}

	@Test
	public void testBill2() {
		pit.setDays(3);
		pit.setDogWeight(120.3);
		double pricePerDay = bean.dogs(pit,pit);
		assertEquals(123.96,pricePerDay,0);
		
	}
	@Test
	public void testDogIsAnAdult() {
		pit.setAge(1);
		assertTrue(bean.isAnAdult(pit));
	}
	@Test
	public void testDogIsNotAnAdult() {
		pit.setAge(6);
		assertFalse(bean.isAnAdult(pit));
	}

}
