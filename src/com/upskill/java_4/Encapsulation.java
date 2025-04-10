package com.upskill.java_4;

public class Encapsulation {
	
	
	
	private String name = "upskill";         // write & read
	private int ssn = 512547;
	private String username = "raselalam";
	
	
	
	
	// setter method - name                  //set the data ,wrtie
	public void setName(String value) {
		name = value;
	
		
	}
	public void setssn(int value) {
		ssn=value;
	}
	
	// Getter method - name                 // get the data , read
	public String getName() {
		return name;
	}
	public String getUsername() {
		return username;
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("Mahfuz");
		System.out.println(obj.getName());
		obj.setssn(123456);
		System.out.println(obj.getUsername());
		
		
		

	}

}
