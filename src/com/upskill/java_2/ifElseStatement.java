package com.upskill.java_2;

public class ifElseStatement {

	public static void main(String[] args) {
		
		
		int age = 101;
		
		if (age<=13) {
			System.out.println("you are children");
		
		}else if (age>13 && age <18) {
			System.out.println("you are teenager");
			
		}else if (age>=62) {
			if(age>=100) {
				System.out.println("you are champion");
				
		   }else {
			System.out.println("you are a senior");
		   }
		} else {
			System.out.println("you are an adult");
		}

	}

}
