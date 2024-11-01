package com.vikram.creadit_card;
import java.util.*;

public class CustomerELC {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter customer details");
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter creditPoints : ");
		int creditPoints = sc.nextInt();
		
		Customer cust = new Customer(name, creditPoints);
		
		CardType offeredCard = CardsOnOffer.getOfferedCard(cust);
		
		System.out.println(offeredCard);
		
		sc.close();
		
		
		
		
		

	}

}
