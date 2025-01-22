package com.lab.jan_21;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HospitalFinder 
{

	public static void main(String[] args) 
	{
		HospitalService hs = new HospitalService();
		
		hs.addHospital("AAI", "Tejas",Arrays.asList("Feaver","Cardivo"), "9864728383", "Dubai");
		hs.addHospital("Teja", "Nike",Arrays.asList("Feaver","Cardivo"), "8864728383", "Delli");
		hs.addHospital("Sai", "Bolt",Arrays.asList("Feaver","Cardivo"), "7864728383", "Chennai");
		hs.addHospital("Sumodu", "Harry",Arrays.asList("Feaver","Cardivo"), "6864728383", "Mumbai");
		hs.addHospital("Udai", "Scott",Arrays.asList("Feaver","Cardivo"), "5864728383", "Pune");
		
		HashMap<Integer, String> hpList = new HashMap<Integer, String>();
		hpList = (HashMap<Integer, String>) hs.getHospitals();
		
		System.out.println(hpList);
		

	}

}
