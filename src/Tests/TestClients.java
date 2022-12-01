package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Clients;
import model.DogInfo;

/**
 * Aaliyah Trotter - atrotter1@dmacc.edu
 * CIS175 - Fall 2022
 * Nov 30, 2022
 */
public class TestClients {
	DogInfo pr = new DogInfo();
	Clients dog = new Clients("Jane");


	@Before
	public void setUp() throws Exception{
		
	}
	
	@Test
	public void testBill() {
		dog.setDays(5);
		dog.setDogWeight(45.60);
		double pricePerDay = pr.dogs(dog, dog);
		assertEquals(179.95,pricePerDay,0);
	}
	
	@Test
	public void testDogIsAnAdult() {
		dog.setAge(1);
		assertTrue(pr.isAnAdult(dog));
	}
	@Test
	public void testDogIsNotAnAdult() {
		dog.setAge(5);
		assertFalse(pr.isAnAdult(dog));
	}
	

}
