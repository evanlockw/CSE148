package p4;

import java.util.ArrayList;

public class Demo2 {

	public static void main(String[] args) {
		Student s1 = new Student("A", 1.0);
		Student s2 = new Student("B", 2.0);
		
		ArrayList<Student> list1 = new ArrayList<>();
		
		ArrayList<Student> list2 = (ArrayList<Student>) list1.clone();
		
		System.out.println(list1 == list2);
	}

}
