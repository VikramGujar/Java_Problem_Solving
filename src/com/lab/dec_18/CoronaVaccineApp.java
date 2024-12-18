package com.lab.dec_18;

public class CoronaVaccineApp {

	public static void main(String[] args) {
		
		
		VaccineEligibility v = new VaccineEligibility(2,true);
		DoseBooking d = new DoseBooking(false);
		User u1 = new User("Vikram", v, d);
		
		Thread t = new Thread()
		{
			@Override
			public void run() {
				System.out.println("is user eligible for "+u1.isEligible());
				System.out.println("Booking the dose :"+u1.bookDose());
				System.out.println("is dose dose booked :"+u1.isDoseBooked());
			}
		};
		t.start();

	}

}
