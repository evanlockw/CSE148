package p2;

import java.util.Arrays;
import java.util.Comparator;

public class Demo {

	public static void main(String[] args) {
		Student[] students = { new Student("M", 1.0), new Student("A", 4.0), new Student("Z", 2.5) };
		for (Student s : students) {
			System.out.println(s);
		}
		System.out.println("----------------------");
		Arrays.sort(students);
		for (Student s : students) {
			System.out.println(s);
		}

		System.out.println("----------------------");

		// use overloaded Arrays.sort() method with a Comparator object to specify new
		// order
//		Arrays.sort(students, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//
//		});

		// create a private inner class that implements Comparator
//		Arrays.sort(students, new Demo().new MyComparator());
//		
//		for (Student s : students) {
//			System.out.println(s);
//		}
//
//	}
//	
//	private class MyComparator implements Comparator<Student> {
//
//		@Override
//		public int compare(Student o1, Student o2) {
//			return -o1.getName().compareTo(o2.getName());
//		}

		Arrays.sort(students, (Student s1, Student s2) -> {
			return s1.getName().compareTo(s2.getName());
		});

		for (Student s : students) {
			System.out.println(s);
		}
		
		Arrays.sort(students, (Student s1, Student s2) -> {
			return Double.compare(s1.getGpa(), s2.getGpa());
		});
		
		/*
		 * A method in java produces different results depending on the objects you use it with
		 * A function, like a function in math, will always produce the same results.
		 *  y = x + 1;
		 *  
		 *  z = x + y; ==== z = x + x + 1
		 */

		for (Student s : students) {
			System.out.println(s);
		}
	}
	
	public void sort(Object[] arr, Comparator<Object> comparator) {
		
	}

}
