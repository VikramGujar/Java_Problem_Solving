package com.lab.dec_18;

@SuppressWarnings("serial")
class DoseBookedException extends RuntimeException
{

	public DoseBookedException(String errMessage) {
		super(errMessage);
		
	}
	
}
public class DoseBooking 
{

	private boolean booked;

	public DoseBooking(boolean booked) 
	{
		super();
		this.booked = booked;
	}
	
	 public void bookDose() throws DoseBookedException 
	 {
		 if(this.booked == true)
			 throw new DoseBookedException("You have already booked a dose!!!");
		 else
			 this.booked = true;
	 }
	 
	 public void isDoseBooked() 
	 {
		 if(this.booked == true)
			 System.out.println("Dose is booked!");
		 else
			 System.out.println("Dose is not booked");
	 }
	 
	 
}
