package com.upskill.java_5;

public class Interfaceimplementation implements Interface {

	@Override
	public void icar() {
		System.out.println("My Car Is Tesla");
		
	}

	@Override
	public void iWheel() {
		System.out.println("My car has 4 wheel");
		
	}
	
	

	@Override
	public int iDoor() {
		
		return 4;
	}
	
	


	@Override
	public String iSeatType() {
		return Leather;
		
		
	}

}
