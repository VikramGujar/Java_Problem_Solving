package com.lab.jan_07;

public record Customer(Integer customerNumber,String customerName,Double customerBill) 
{}
/*

Program 2:
------------
Write a Program to perform sorting operation on Customer class using 
ArrayList by implementing Comparator interface 

Create a BLC class Customer
Instance variables:
customerNumber-private-Integer
customerName-private-String
customerBill-private-Double

Create a parameterized constructor to 
initialize the instance variable of Customer class.

Implement Comparator interface to 
write the logic to sort the Customer class based on the following 

a) Based on customer number
b) Based on customer name
c) Based on customer bill

Create an ELC class which contains main method, 
create ArrayList object to hold Customer data as well as sort the 
Customer data object based on the above criteria
*/