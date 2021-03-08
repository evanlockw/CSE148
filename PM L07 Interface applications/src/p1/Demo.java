package p1;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		Student[] students = {new Student("M", 1.0), new Student("A", 4.0), new Student("Z", 2.5)};
		for(Student s : students) {
			System.out.println(s);
		}
		System.out.println("----------------------");
		Arrays.sort(students);
		for(Student s : students) {
			System.out.println(s);
		}
	}

}
