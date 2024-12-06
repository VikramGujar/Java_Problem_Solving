package com.lab.dec_06;

public class ClassNotFoundExpDemo {
	
	public ClassNotFoundExpDemo(String  className) {
		try {
			System.out.println(Class.forName(className));
			
		} catch (Exception e) {		
			System.out.println("Entered class not exist");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		ClassNotFoundExpDemo cnfd = new ClassNotFoundExpDemo("java.lang.String");

	}

}
