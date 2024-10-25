package com.vikram.ticket;

public class MainTicket {

	public static void main(String[] args) {
		
		Ticket tc = new Ticket("Concert", 101, 50.0);
		VIPTicket vt = new VIPTicket("VIP Concert", 201, 100.0, "Backstage Access");
		StudentTicket st = new StudentTicket("Student Event", 301, 30.0, true);
	
        System.out.println("Regular Ticket:");
		System.out.println("Event :"+tc.getEventName()+"\n Seat :"+tc.getSeatNumber()+"\n Price :"+tc.getPrice());
		
		System.out.println("\n VIP Ticket:");
		System.out.println("Event :"+vt.getEventName()+"\n Seat :"+vt.getSeatNumber()+"\n Price :"+vt.getPrice()+"\n Special Access :"+vt.getSpecialAccess());
		
		System.out.println("\n Student Ticket:");
		System.out.println("Event :"+st.getEventName()+"\n Seat :"+st.getSeatNumber()+"\n Price :"+st.getPrice()+"\n Student Discount:"+st.isStudentDiscount());
	}

}