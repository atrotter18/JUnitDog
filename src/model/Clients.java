package model;
/**
 * Aaliyah Trotter - atrotter1@dmacc.edu
 *  CIS175- Fall 2022
 * Oct 20, 2022
 */
public class Clients {
	private String ownerName;
	private Double dogWeight;
	private int age;
	private int days;
	
	public Clients() {
		
	}
	
	public Clients(String on) {
		this.ownerName = on;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
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
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}



	
	
	

}
