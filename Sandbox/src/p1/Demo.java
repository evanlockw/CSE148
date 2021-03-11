package p1;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("Z", 2.5);
		Student s2 = new Student("A", 0.5);
		Student s3 = new Student("Z", 0.5);
		Student s4 = new Student("Q", 2.1);
		Student s5 = new Student("S", 3.7);
		Student s6 = new Student("K", 3.7);
		
		
		ArrayList<Student> list1 = new ArrayList<>();
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list1.add(s4);
		list1.add(s5);
		
		ArrayList<Student> list2 = new ArrayList<>();
		list2.add(s2);
		list2.add(s4);
		list2.add(s6);
		
//		System.out.println(list1.removeAll(list2));
		
//		list1.forEach((s) -> System.out.println(s));
		
		
		list1.removeIf((s) -> {
			return s.getName().equals("Z");
		});
		
		list1.forEach((s) -> System.out.println(s));
	}

}
