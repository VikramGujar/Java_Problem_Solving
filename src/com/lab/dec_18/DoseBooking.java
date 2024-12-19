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
			 throw new DoseBookedException("Dose already booked");
		 else
			 this.booked = true;
	 }
	 
	 public boolean isDoseBooked() 
	 {
		 if(this.booked == true)
			 return true;
		 else
			 return false;
	 }
	 
	 
}
