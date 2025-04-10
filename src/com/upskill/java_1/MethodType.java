package com.upskill.java_1;

public class MethodType  {

	public static void main(String[] args) {
		
		
		MethodType obj = new MethodType();
		
		obj.annualIncomeVoid();
		weeklyIncomeStatic();
		System.out.println("My Monthly Income = " + obj.monthlyIncomeReturn());
		

	}
	
	
	
	public static int hourLyIncome = 55;
	
	public void annualIncomeVoid() {
		int calculateAnnualIncome = hourLyIncome * 2000;
				System.out.println("My Annual Income = " + calculateAnnualIncome);
				
	}
	public int monthlyIncomeReturn() {
		int calculateMonthlyIncome = hourLyIncome * 180;
		return calculateMonthlyIncome;
	}
	
	public static void weeklyIncomeStatic() {
		int calculateWeeklyIncome = hourLyIncome * 40;
		System.out.println("My Weekly Income = " + calculateWeeklyIncome);
	}
	
	
	

	
	
	
}
