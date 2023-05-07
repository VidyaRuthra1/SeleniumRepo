package org.system;


public class Computer {

	public void ComputerMethod() {
		System.out.println("Computer Method from Computer class");
	}
	
	public static void main(String[] args) {
		Computer c=new Computer();
		c.ComputerMethod();
		
	}

}
