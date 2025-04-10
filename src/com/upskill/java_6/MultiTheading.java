package com.upskill.java_6;

public class MultiTheading {

	
		// Multithreading is a Java feature that allows concurrent execution of two or more parts of a program.
		// thread can be created by using two mechanism :
		// Extending the thread class
		// implementing the runnable interface 
	
	public static void main(String[] args) {
		
		
		int n = 4;
		for(int i = 0; i < n; i++) {
			MultiThreadingThread obj = new MultiThreadingThread();
			obj.start();
			
			Thread obj2 = new Thread(new MultiThreadingRunable());
			obj2.start();

	}

}
}