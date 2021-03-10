package p3;

import java.util.Arrays;
import java.util.function.Predicate;

public class StudentBag {
	private Student[] arr;
	private int nElems;
	
	public StudentBag(int maxSize) {
		arr = new Student[maxSize];
	}
	
	public void insert(Student student) {
		arr[nElems++] = student;
	}
	
	public Student[] search(Predicate<Student> predicate) {
		Student[] temp = new Student[nElems];
		int count = 0;
		
		for(int i = 0; i < nElems; i++) {
			if(predicate.test(arr[i])) {
				temp[count++] = arr[i];
			}
		}
		return Arrays.copyOf(temp, count);
		
	}
	
//	public Student[] searchByName(String name) {
//		Student[] temp = new Student[nElems];
//		int count = 0;
//		
//		for(int i = 0; i < nElems; i++) {
//			if(arr[i].getName().equals(name)) {
//				temp[count++] = arr[i];
//			}
//		}
//		return Arrays.copyOf(temp, count);
//	}
//	
//	public Student[] searchByGpa(double gpa) {
//		Student[] temp = new Student[nElems];
//		int count = 0;
//		
//		for(int i = 0; i < nElems; i++) {
//			if(arr[i].getGpa() == gpa) {
//				temp[count++] = arr[i];
//			}
//		}
//		return Arrays.copyOf(temp, count);
//	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
}
