package com.lab.dec_06;

public class ClassCastExceptionDemo {

	public static void main(String[] args) {
		
		handleClassCastException();

	}
	
	public static void handleClassCastException() {
		
		Object[] mixArray = {"Hello",123,"Java"};
		
		try {
			
			for(int i =0; i<mixArray.length;i++){
				
				String name = (String) mixArray[i] ; 
				System.out.println(name);
				
			}
			
			
		} catch (Exception e) {
			
			System.err.println("You are trying to covert Integer to String ");
			System.out.println(e);
		}
	}

}
