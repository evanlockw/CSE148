package p3_bags;

import p2.Student;

public class StudentBag {
	private Student[] students; // reference variable
	private int nElems; // primitive variable
	private int maxSize;

	public StudentBag(int maxSize) {
		students = new Student[maxSize];
		this.maxSize = maxSize;
	}

	public Student searchById(String id) {
		for (int i = 0; i < nElems; i++) {
			if (students[i].getId().equals(id)) {
				return students[i];
			}
		}
		return null;

	}

	public Student removeById(String id) {
		
	}
	
	public void insert(Student student) {
		students[nElems++] = student;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(students[i]);
		}
	}

}
