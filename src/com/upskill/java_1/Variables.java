package com.upskill.java_1;

public class Variables {

	public static void main(String[] args) {
	ny("Chuck");
	nj("Cory");
	ct("Murphy");
	Variables obj = new Variables();
	
	System.out.println(president);
	System.out.println(obj.vicePresident);
	
	
	

	}
	
	
	public static String president = "Trump";
	
	public String vicePresident = "Vance";

	
	public static String country = "USA";
	
	public static String region = "North America";
	
	public static void ny(String senator) {
		String city = "Queens";
		String county = "Nassau";
		
		System.out.println(city);
		System.out.println(county);
		System.out.println(country);
		System.out.println(region);
		
		System.out.println(senator);
		
	}
	
	public static void nj(String senator) {
		String city = "Bloomfield";
		String county = "Essex";
		
		System.out.println(city);
		System.out.println(county);
		System.out.println(country);
		System.out.println(region);
		
		System.out.println(senator);
		
		
		
	}
	
	public static void ct(String senator) {
		String city = "Hartford";
		String county = "Fairfield";
		
		System.out.println(senator);
		
		System.out.println(city);
		System.out.println(county);
		System.out.println(country);
		System.out.println(region);
	}
}
	
