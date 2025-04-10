package com.upskill.java_6;

public class Exception_TryCatchFinale {

	
		/* Java Exceptions - use "try - catch - finally
		 * A Built-inExcemption - throws by java which explain certain error situations.
		 * 1. ArithmeticException - error has occurred in an arithmetic exception
		 * 2. ArrayindexOutOfBoundsException - an array has been accessed with an illegal index.
		 * 3
		 */
	
	
	
	
	
	
	public static void main(String[] args) {
		
		//Built-in-exception - ArrayIndexoutofboundException
		try {
		int[] ageNebula = new int[] {24, 25, 28, 30, 32};
		System.out.println(ageNebula[2]);
	} catch (Exception e) {
		e.printStackTrace();
	}
		// Specific Built-in-Excemptions - NumberFormatException
		
		try {
			int num = Integer.parseInt("Test");
			System.out.println(num);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		
		}
			// User-Defined Exceptions
		try {
			 throw new myException("Test");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
		
		System.out.println("Test Execution Complete ! ");

	}
	}
}


