package com.lab.dec_19;

public class TicketBookingSystem {

	public static void main(String[] args) {
		
		TicketBooking tb = new TicketBooking(5);
		
		Thread book = new Thread(
				()->
				{
					int[] bookArray = {6,3,5};
					for(int i=0; i<bookArray.length;i++)
					{
						tb.booking(bookArray[i]);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
						
					}
				},"BookingThread");
		book.start();
		
		Thread cancel = new Thread(
				()->
				{
					int[] cancelArray = {2,5,3};
					for(int i=0; i<cancelArray.length;i++)
					{
						tb.cancelation(cancelArray[i]);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
					}					
				},"CancellingThread");
		cancel.start();

	}

}
