package com.lab.dec_19;

public class TicketBooking 
{
	private int availableTicket;
	
	public TicketBooking(int availableTicket) {
		super();
		this.availableTicket = availableTicket;
	}



	public synchronized void booking(int ticketToBook)
	{
		while(availableTicket < ticketToBook)
		{
			System.out.println("You are booking "+ticketToBook+" tikets");
			System.out.println("Available tickets are :"+availableTicket);
			System.err.println("Available tikets are low wait for cancelation...");
			
			try 
			{
				wait();
			} catch (InterruptedException e) 
			{				
				e.printStackTrace();
			}
		}
		System.out.println("Available tickets are :"+availableTicket);
		System.out.println("Booking "+ticketToBook+" tikets for you");
		System.out.println(ticketToBook+" tikets are booked Successfully!!!");
		availableTicket = availableTicket - ticketToBook;
		System.out.println("Now available tickets are :"+availableTicket);
		
	}
	
	public synchronized void cancelation(int ticketToCancel)
	{
		System.out.println(ticketToCancel+" tikets cancelled!!!");
		availableTicket = availableTicket + ticketToCancel;
		System.out.println("Now available tickets are :"+availableTicket);
		notify();
	}
	
}
