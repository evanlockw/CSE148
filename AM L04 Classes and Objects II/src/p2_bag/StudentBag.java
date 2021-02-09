package p2_bag;

import p1_composition.Student;

// allow us to store a collection of Student objects
public class StudentBag {

	private Student[] students; // reference variable
	private int nElems;
	private int maxSize;

	public StudentBag(int maxSize) {
		students = new Student[maxSize];
		this.maxSize = maxSize;
	}

	public Student removeById(String id) {
		int i;
		for (i = 0; i < nElems; i++) {
			if (students[i].getId().equals(id)) {
				break;
			}
		}

		if (i == nElems) {
			return null;
		} else {
			Student temp = students[i];
			for (int j = i; j < nElems-1; j++) {
				students[j] = students[j + 1];
			}
			nElems--;
			return temp;
		}

	}

	public Student searchById(String id) {
		for (int i = 0; i < nElems; i++) {
			if (students[i].getId().equals(id)) {
				return students[i];
			}
		}
		return null;
	}

	public void insert(Student student) {
		if (nElems != maxSize) {
			students[nElems++] = student;
		} else {
			System.out.println("The bag is full");
		}
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(students[i]);
		}
	}

}
