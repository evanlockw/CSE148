package p3_bags;

import java.util.Arrays;

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

	public Student[] searchByLastName(String lastName) {
		Student[] temp = new Student[nElems];
		int counter = 0;
		for (int i = 0; i < nElems; i++) {
			if (students[i].getName().getLastName().equals(lastName)) {
				temp[counter++] = students[i];
			}
		}

		return Arrays.copyOf(temp, counter);

	}

	public Student[] searchByGPACutOffLine(double gpa) {
		Student[] temp = new Student[nElems];
		int counter = 0;
		for (int i = 0; i < nElems; i++) {
			if (students[i].getGpa() >= gpa) {
				temp[counter++] = students[i];
			}
		}

		return Arrays.copyOf(temp, counter);
	}

	public boolean isFull() {
		return nElems == maxSize;
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
			for (int j = i; j < nElems; j++) {
				students[j] = students[j + 1];
			}
			nElems--;
			return temp;
		}
	}

	public void insert(Student student) {
		if (isFull()) {
			System.out.println("The bag is full! Cannot insert.");
		} else {
			students[nElems++] = student;
		}
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(students[i]);
		}
	}

}
