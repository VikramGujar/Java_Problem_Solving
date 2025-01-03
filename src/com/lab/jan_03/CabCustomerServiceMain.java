package com.lab.jan_03;

public class CabCustomerServiceMain 
{

	public static void main(String[] args) 
	{
		CabCustomer cbc1 = new CabCustomer(111, "Vijay", "Ameerpet", "Begampet", 3, "98745 32728");
		CabCustomer cbc2 = new CabCustomer(111, "Harun", "Ameerpet", "Aurangabad", 578, "81745 32428");

		CabCustomerService cbcs = new CabCustomerService();
		cbcs.addCabCustomer(cbc1);
		cbcs.addCabCustomer(cbc2);
		cbcs.printBill(cbc1);
		cbcs.printBill(cbc2);
		
		System.out.println();
		CabCustomer cbc3 = new CabCustomer(111, "Harun", "Ameerpet", "Aurangabad", 10, "81745 32428");
		cbcs.addCabCustomer(cbc3);
		cbcs.printBill(cbc3);
		
	}

}
/*

Note : If phone number of a customer matches with any of the phone 
numbers of the array list, then consider it as a existing customer, 
otherwise consider the customer as new customer. 

calculateBill() should calculate and return the customer 
bill based on following rules
1) if the customer is new return 0;
2) if the customer's travel distance is below or equal    
to 4 kms then return 80 (Rs).
3) if the customer travel distance is above 4 kms calculate bill 80 + 6 per each km.
Ex: Any distance for new customer return 0;
distance 4 return 80
distance 6 return 80 + 6 * 6;
printBill() which should return the bill of the customer object parameter in the following format:

output : JOHN Please pay your bill of Rs.0.0
SMITH Please pay your bill of Rs.180.0

Note : 
Assume one customer books only one cab at a time.
No charge for customer booking the cab for the first time.
Customer's phone number is key to test a new customer or old customer.
Distance should be treated as kilometers 				 

A CabCustomerServiceTester is given with main() where you can create various objects and test them.
*/