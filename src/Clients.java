/**
 * Aaliyah Trotter - atrotter1@dmacc.edu
 *  CIS175- Fall 2022
 * Oct 20, 2022
 */
public class Clients {
	private String ownerName;
	private String breed;
	private Double dogWeight;
	private int days;
	
	public Clients() {
		
	}
	
	public Clients(String on, String br) {
		this.ownerName = on;
		this.breed = br;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Double getDogWeight() {
		return dogWeight;
	}

	public void setDogWeight(Double dogWeight) {
		this.dogWeight = dogWeight;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
	

	
	
	

}
