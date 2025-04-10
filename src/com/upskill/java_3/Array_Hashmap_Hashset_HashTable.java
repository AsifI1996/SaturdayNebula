package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Array store multiple data using index
		
		int age = 27;                                           // variable
		int[] ageNebula = new int[] {21, 24, 31, 28, 29};       //array

		
		//Array index [0] [1] [2] [3] [4]
		
		System.out.println("Student Age :" + ageNebula[2]);
		System.out.println("Total Student Age : " + ageNebula.length);
		
		
		String Name = "Asif";
		String[] nameNebula = new String[] {"Asif", "Majid", "Goutam", "Injamam"};
		System.out.println("Student Name :" + nameNebula[0]);
		System.out.println("Total Student Name :" + nameNebula. length);
		
		//Multi-Dimentional Array
		int [][] ageNebula2D = {{21,24,31,28,29},         //[0][0] [0][1] [0][2] [0][3] [0][4]
				               {22,26,32}};           //[1][0] [1][1] [1][2]
		System.out.println("Student Age 2D:" + ageNebula2D[1][2]);
		
		
		//Hashmap store multiple data using key-value pair, Implementation of Map interface
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Rajesh", 21);
		Student.put("Majid", 25);
		Student.put("Pascaleen", 23);
		Student.put("Sana", 24);
		Student.put("Injamam", 24);
		
		System.out.println("HashMap Student Age : " + Student.get("Sana"));
		
		HashMap<String, String> Capital = new HashMap<String, String>();
		
		Capital.put("Bangladesh","Dhaka");
		Capital.put("USA", "Washington DC");
		System.out.println("HashMap Country Name : "+ Capital.get("Bangladesh"));
		
		
		//Hashtable store multiple data using key-value pair, no duplicate,also is synchronized (only one thread can be modified)
		
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		
		Region.put("Bangladeh", "Asia");
		Region.put("USA", "North America");
		
		//HashSet store unordered collection containing unique value, implementation of set interface
		
		
		HashSet<String> car = new HashSet<String>();
		
		car.add("BMW");
		car.add("Audi");
		car.add("Tesla");
		car.add("Ford");
		
		System.out.println("Car : "  +car);
	}

}
