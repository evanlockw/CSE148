package p2_inheritance;

import java.util.Arrays;

public class PersonBag {
	private Person[] arr;
	private int nElems;
	
	public PersonBag(int maxSize) {
		arr = new Person[maxSize];
	}
	
	public void insert(Person person) {
		arr[nElems++] = person;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
	
	public void displayStudents() {
		for(int i = 0; i < nElems; i++) {
			if(arr[i] instanceof Student) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public void displayInstructors() {
		for(int i = 0; i < nElems; i++) {
			if(arr[i] instanceof Instructor) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public Student[] searchStudents() {
		Student[] a = new Student[nElems];
		int count = 0;
		for(int i = 0; i < nElems; i++) {
			if(arr[i] instanceof Student) {
				a[count++] = (Student)arr[i];
			}
		}
		
		return Arrays.copyOf(a, count);
		
	}
	
	public Person removeById(String id) {
		int i;
		for(i = 0; i < nElems; i++) {
			if(arr[i].getId().equals(id)) {
				break;
			}
		}
		
		if(i == nElems) {
			return null;
		} else {
			Person temp  = arr[i];
			for(int j= i; j < nElems-1; j++) {
				arr[j] = arr[j+1];
			}
			nElems--;
			return temp;
		}
	}
	
	public Person searchById(String id) {
		for(int i = 0; i<nElems; i++) {
			if(arr[i].getId().equals(id) && arr[i] instanceof Student) {
				Student s = new Student((Student)arr[i]);
				s.setId(arr[i].getId());
				return s; // return a deep copy of the object found
			}
			
			if(arr[i].getId().equals(id) && arr[i] instanceof Instructor) {
				return new Instructor((Instructor)arr[i]); // return a shallow copy of the object found
			}
		}
		return null;
	}
}
