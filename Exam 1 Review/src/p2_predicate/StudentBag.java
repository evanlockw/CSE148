package p2_predicate;

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
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
	
	public Student[] search(Predicate<Student> predicate) {
		Student[] tempArr = new Student[nElems];
		int count = 0;
		for(int i = 0; i < nElems; i++) {
			if(!predicate.test(arr[i])) {
				tempArr[count++] = arr[i];
			}
		}
		return Arrays.copyOf(tempArr, count);
	}
}
