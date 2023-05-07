//Assignment 1 - Week3 Day1


package org.system;

public class DeskTop extends Computer{

	
	public void desktopSize() {
		
		System.out.println("desktopsize from Desktop class");
	}
	
	public static void main(String[] args) {
		
		DeskTop d=new DeskTop();
		d.desktopSize();
		Computer c=new Computer();
		c.ComputerMethod();
	}

}

/*
Assignment1
===========
     Package   :org.system
     Class     :Computer
     Methods   :computerModel()

     Class     :Desktop
     Methods   :desktopSize()

Description:
create above 2 class and call all your class methods into the Desktop using single inheritance.
*/