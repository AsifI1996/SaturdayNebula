package com.upskill.assignment_2;

public class problem2 {

	public static void main(String[] args) {
		
		
		
		
		// A school conducts a 100 mark exam for its student and grades them as follows:
		// Grade A : mark>=90
		//Grade B: Mark>=80-89
		// Grade C : Mark>=70-79
		// Grade D : Mark>=60-69 AND FAIL THEM WHO HAS <60
		// GRADE IT BY USING IF ELSE STATEMENT 
		
		int mark=80;
		
		if(mark>=90){
			System.out.println("your grade is A");}
		else if (mark>=80 && mark<=89) {
			System.out.println("your grade is B");}
		else if(mark>=70 && mark <=79) {
			System.out.println("your grade is C");}
		else if(mark>=60 && mark <=69) {
			System.out.println("your grade is D");}
		else if(mark<60) {
			System.out.println("you are fail");}
		else {
			System.out.println("Invalid grade");
			
		
		}
	}
}
		
			
			 
				
			
			
		
			

		

	


