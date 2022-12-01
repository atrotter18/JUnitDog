package model;

/**
 * Aaliyah Trotter - atrotter1@dmacc.edu
 * CIS175 - Fall 2022
 * Oct 20, 2022
 */
public class DogInfo {
	double pricePerDay = 0;
	
	public double dogs(Clients weight, Clients days) {
		double charge = 15.99;
		if(weight.getDogWeight() > 100) {
			return pricePerDay = Math.round(days.getDays() * 35.99 + charge * 100.0)/100.0;
			
		}else {
			return pricePerDay = Math.round(days.getDays() * 35.99 * 100.0)/100.0;
		}
	}
	
	public boolean isAnAdult(Clients age) {
		if(age.getAge() > 1) {
			return true;
			
		}else {
			return false;
		}
	}

}
