package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Monisha");
		
	}
	public void studentID() {
		System.out.println("Sit19ec064");
	}
	public void studentDept() {
		System.out.println("ECE");
	}
	public static void main(String[] args) {
		Student details=new Student();
		details.collegeName();
		details.collegeCode();
		details.collegeRank();
		details.deptName();
		details.studentName();
		details.studentDept();
		details.studentID();
	}
}
