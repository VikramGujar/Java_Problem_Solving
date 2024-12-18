package com.lab.dec_18;

class NotEligibleException extends RuntimeException {

	public NotEligibleException(String message) {
		super(message);
		
	}
	
}

public class User {
	 private String name;
	 private VaccineEligibility eligibility; 
	 private DoseBooking doseBooking;
	
	 
	 public User(String name, VaccineEligibility eligibility, DoseBooking doseBooking) {
		super();
		this.name = name;
		this.eligibility = eligibility;
		this.doseBooking = doseBooking;
	}
	 
	 public boolean isEligible() {
		 return eligibility.isEligible();
	 }
	 
	 public boolean bookDose()throws NotEligibleException {
		if(isEligible()==true) 
			return true;
		else
			throw new NotEligibleException("You are not eligible for dose!");
		
	}
	 
	 public boolean isDoseBooked() {
		 if(bookDose()==true)
			 return true;
		 else
			 return false;
		 
	 }
}