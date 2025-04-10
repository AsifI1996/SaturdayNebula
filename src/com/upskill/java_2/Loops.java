package com.upskill.java_2;

public class Loops {

	public static void main(String[] args) {
		// practiceForLoop();
		//practiceForWhileLoop
		//practiceForDoWhileLoop
		//practiceForInfinteLoop
		practiceNestedForLoop();
	}
	public static void practiceForLoop() {
		int i;
		for(i=1; i<=10; i++) {
			System.out.println("For Loops number = " + i);
		}
	

	}
	public static void practiceWhileLoop() {
		int i = 1;
		while(i<=10) {
			System.out.println("while Loops numer = " + i);
			i++;
		}
	}
  
	public static void practiceDoWhileLoop(){
		int i = 1;
		do {
			System.out.println("Do While Loops number = " + i);
			i++;
		} while (i<=10);
		}
		
public static void practiceNestedForLoop() {
	int i ;
	int j ;
	for(i=1; i<=10; i++) {
		for(j=1; j<=10; j++){
			int multipicationTable = i * j;
			System.out.print(multipicationTable + " ");
		}
		System.out.println(" ");
	}
		}
	
}
		
		
	
	
	

