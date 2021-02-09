package p3_bags;

import p2.Student;

public class StudentBag {
	private Student[] students; // reference variable
	private int nElems; // primitive variable
	
	public StudentBag() {
		students = new Student[100];
	}
	
	public void insert(Student student) {
		students[nElems++] = student;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(students[i]);
		}
	}
	
}
