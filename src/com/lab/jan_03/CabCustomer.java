package com.lab.jan_03;

public class CabCustomer 
{

	 private int custId; 
	 private String customerName;
	 private String pickupLocation;
	 private String dropLocation;
	 private int distance;
	 private String phone;
	
	 
	 public CabCustomer() {
		super();
		
	}


	public CabCustomer(int custId, String customerName, String pickupLocation, String dropLocation, int distance,
			String phone) {
		super();
		this.custId = custId;
		this.customerName = customerName;
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
		this.distance = distance;
		this.phone = phone;
	}


	public int getCustId() {
		return custId;
	}


	public void setCustId(int custId) {
		this.custId = custId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getPickupLocation() {
		return pickupLocation;
	}


	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}


	public String getDropLocation() {
		return dropLocation;
	}


	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}


	public int getDistance() {
		return distance;
	}


	public void setDistance(int distance) {
		this.distance = distance;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
	 
	 
	 
	 
}
/*
Three classes are given to you, 
CabCustomer
CabCustomerService
CabCustomerServiceTester


Define the following in the class CabCustomer 
private : custId int, customerName String, pickupLocation String,dropLocation String, distance int,phone String
          Generate Getter/Setter for the all fields.
          Implement the No Argument constructor.
          Implement/Generate the parameterized constructor in the order as defined above, i.e.,  custId,Name,Pickup,Drop,Distance,Phone

Define the following in the  class CabCustomerService and write logics in the following methods:
private : Generic ArrayList to represent list of CabCustomers.
public : addCabCustomer() : Add the customer object parameter to the ArrayList
			    isFirstCustomer(): Check whether the customer object parameter is already existing in arrayList. 
			    				
Note : If phone number of a customer matches with any of the phone numbers of the array list, then consider it as a existing customer, otherwise consider the customer as new customer. 
				 
       calculateBill() should calculate and return the customer bill based on following rules
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