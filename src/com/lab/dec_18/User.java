package com.lab.dec_18;

@SuppressWarnings("serial")
class NotEligibleException extends RuntimeException {

	public NotEligibleException(String message) 
	{
		super(message);
		
	}
	
}

public class User 
{
	 private String name;
	 private VaccineEligibility eligibility; 
	 private DoseBooking doseBooking;
	
	 
	 public User(String name, VaccineEligibility eligibility, DoseBooking doseBooking) 
	 {
		super();
		this.name = name;
		this.eligibility = eligibility;
		this.doseBooking = doseBooking;
	}
	 
	 public void isEligible() 
	 {
		 if(eligibility.isEligible()==true)
		 {
			 System.out.println(name+" is eligible for dose");
		 }else
			 System.out.println(name+" is not eligible for dose");
	 }
	 
	 public void bookDose()throws NotEligibleException {
		if(eligibility.isEligible()==true) 
		{
			System.out.println("dose is booked for "+name);
			
		}
		else
			throw new NotEligibleException("You are not eligible for the vaccine");
		
	}
	 
	 public void isDoseBooked() 
	 {
		 if(doseBooking.isDoseBooked()==true) 
			 System.out.println("Dose is already booked for "+name);			 
		 else
			 System.out.println("Dose is not booked for "+name);		 
		 		 
	 }
}