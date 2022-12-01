/**
 * Aaliyah Trotter - atrotter1@dmacc.edu
 * CIS175 - Fall 2022
 * Oct 20, 2022
 */
public class Pricing {
	
	public void dogs(Clients weight, Clients days, Clients pay) {
		double charge = 15.99;
		double pricePerDay = 0;
		if(weight.getDogWeight() > 100) {
			pricePerDay = days.getDays() * 35.99 + charge;
		}else {
			pricePerDay = days.getDays() * 35.99;
		}
	}

}
