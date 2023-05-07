package org.student;

import org.department.Department;

public class Student extends Department {

	public void studenName() {
		
		System.out.println("student Name");
	}
	
public void studenDept() {
		
		System.out.println("student Dept");
	}

public void studenId() {
	
	System.out.println("student Id");
}	
	public static void main(String[] args) {
		Student stud=new Student();
		
		stud.studenId();
		stud.studenName();
		stud.studenDept();
		stud.deptName();
		stud.collegeCode();
		stud.collegeName();
		stud.collegeRank();
		stud.c
		
	}

}
