package com.lab.jan_01;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

record Employee(Integer employeeId, String employeeName) implements Serializable 
{	
}


public class ArrayListSerialization 
{	
	public static void main(String[] args) throws IOException 
	{
		ArrayList<Employee> listOfEmployees = new ArrayList<>();
		listOfEmployees.add(new Employee(111, "A"));
		listOfEmployees.add(new Employee(222, "B"));
		listOfEmployees.add(new Employee(333, "C"));
		listOfEmployees.add(new Employee(444, "D"));
		listOfEmployees.add(new Employee(555, "E"));
		
		String filePath = "C:\\Users\\vikra\\OneDrive\\Desktop\\Lap-Programs\\Java_Problem_solving\\src\\com\\lab\\jan_01";
		//Serialization
		var fos = new FileOutputStream(filePath);
		var oos = new ObjectOutputStream(fos);
		
		try(fos; oos)
		{
			oos.writeObject(listOfEmployees);
			System.out.println("Object data stored successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//De-Serialization
		
		var fin = new FileInputStream(filePath);
		var ois = new ObjectInputStream(fin);
		
		try(fin; ois)
		{
			
			ArrayList<Employee> empList = (ArrayList<Employee>) ois.readObject();
			empList.forEach(System.out::println);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}