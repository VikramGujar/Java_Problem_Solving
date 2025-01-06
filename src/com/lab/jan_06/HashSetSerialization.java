package com.lab.jan_06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;

public class HashSetSerialization {
	public static void serializeHashSet(HashSet<String> set, String filename) throws IOException {
		var fos = new FileOutputStream(filename);
		var oos = new ObjectOutputStream(fos);
		try(fos; oos){
			oos.writeObject(set);
			System.out.println("Hash Set uploaded successfull..");
		}
		catch(Exception e) {
			System.err.println(e + e.getMessage());
		}
	}

	public static HashSet<String> deserializeHashSet(String filename) throws IOException, ClassNotFoundException {
		var fis = new FileInputStream(filename);
		var ois = new ObjectInputStream(fis);
		HashSet<String> result = new HashSet<String>();
		try(fis; ois){
			result = (HashSet<String>)ois.readObject();
		}
		catch (Exception e) {
			System.err.println(e + e.getMessage());
		}
		return result;
	}

	public static void main(String[] args) {
		HashSet<String> obj = new HashSet<>();
		obj.add("Apple");
		obj.add("Banana");
		obj.add("Mango");

		String filePath = "C:\\Users\\vikra\\OneDrive\\Desktop\\new\\hashset.txt";
		try {
			serializeHashSet(obj, filePath);
		} catch (IOException e) {
			System.err.println(e+ e.getMessage());
		}
		
		try {
			HashSet<String> set = deserializeHashSet(filePath);
			if(set.isEmpty()) {
				System.out.println("The deserialized HashSet is empty");
			}else {
				System.out.println("Deserialized HashSet: " + set);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
/*
 * 
 * Que 2 : Saving and Restoring Favorite Fruits Using Serialization
 * ================================================================
 * 
 * -> You are tasked with developing a feature in a Java application that allows
 * users to save and restore their collection of favorite fruits. This feature
 * will involve serializing a HashSet of fruits to a file and then deserializing
 * it to verify that the data has been correctly saved and loaded.
 * 
 * 
 * Create Class: HashSetSerialization ----------------------------------
 * 
 * Method: -> public static void serializeHashSet(HashSet<String> set, String
 * filename) -> public static HashSet<String> deserializeHashSet(String
 * filename) -> main method
 * 
 * -> In main methods -> Create a HashSet and add some String elements ->
 * Specify a file to store the serialized HashSet like, String filename =
 * "hashset.ser"; -> Serialize the HashSet by calling
 * serializeHashSet(hashsetobj, filename)s -> Deserialize the HashSet by calling
 * deserializeHashSet(String filename) -> Make sure serializeHashSet() method
 * and deserializeHashSet() method will handle possible Exception using try
 * catch. -> Display the deserialized HashSet as result.
 * 
 * Conditions : ------------ -> if HashSet object is empty then print
 * "The deserialized HashSet is empty"
 * 
 * 
 * TEST CASE 1 : ------------- sample input : HashSet<String> obj=new
 * HashSet<>(); if obj.isEmpty()==true then, sample output : The deserialized
 * HashSet is empty
 * 
 * TEST CASE 1 : ------------- sample input : HashSet<String> obj=new
 * HashSet<>(); obj.add("Apple"); obj.add("Banana"); obj.add("Mango")....so on;
 * perform serialization and deseialization and print deserialization object
 * like below sample output : Deserialized HashSet: [Apple, Banana, Mango]
 */