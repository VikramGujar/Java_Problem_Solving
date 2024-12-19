package com.lab.dec_18;

public class CoronaVaccineApp {

	public static void main(String[] args) {
		
		
		VaccineEligibility v = new VaccineEligibility(21,true);
		DoseBooking d = new DoseBooking(false);
		
		VaccineEligibility v1 = new VaccineEligibility(21,false);
		DoseBooking d1 = new DoseBooking(false);
		
		User u1 = new User("Vikram", v, d);
		User u2 = new User("Harun", v1, d1);
		
		Thread t1 = new Thread()
		{
			@Override
			public void run() 
			{
				u1.isEligible();
				u1.bookDose();
				u1.isDoseBooked();
			}
		};
		Thread t2 = new Thread()
		{
			@Override
			public void run() 
			{
				u2.isEligible();
				u2.bookDose();
				u2.isDoseBooked();
			}
		};
		t1.start();
		t2.start();

	}

}
