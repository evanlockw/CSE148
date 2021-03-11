package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Student> list1 = new ArrayList<>();
		
		Student s1 = new Student("A", 1.0);
		Student s2 = new Student("Z", 1.5);
		Student s3 = new Student("M", 0.0);
		Student s4 = new Student("Q", 2.1);
		Student s5 = new Student("B", 0.0);
		Student s6 = new Student("F", 2.5);
		
		Student s7 = new Student("K", 3.7);
		Student s8 = new Student("L", 3.7);
		
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list1.add(s4);
		list1.add(s5);
		list1.add(s6);
		
		System.out.println(list1.indexOf(s7));
		
//		ArrayList<Student> list2 = new ArrayList<>();
//		list2.add(s7);
//		list2.add(s8);
		
//		list1.add(0, s7);
		
//		for(Student s : list1) {
//			System.out.println(s);
//		}
		
		
//		list1.addAll(list2);
//		list1.removeAll(list2);
//		
//		list1.forEach((s) -> {
//			System.out.println(s);
//		});
//		
//		list1.sort(new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
////				return o1.getName().compareTo(o2.getName());
//				return Double.compare(o1.getGpa(), o2.getGpa());
//			}
//
//		});
		
//		list1.sort((o1, o2) -> {
//			return o1.getName().compareTo(o2.getName());
//		});
		
//		Collections.sort(list1, (o1, o2) -> {
//			return o1.getName().compareTo(o2.getName());
//		});
		
//		list1.removeIf(new Predicate<Student>() {
//
//			@Override
//			public boolean test(Student t) {
//				return t.getGpa() == 0.0 || t.getName().equals("A");
//			}
//			
//		});
		
//		list1.removeIf((s) -> {
//			return s.getGpa() == 0.0;
//		});
		
		
//		list1.forEach((s) -> System.out.println(s));
		
		// anonymous class
//		list1.forEach(new Consumer<Student>() {
//
//			@Override
//			public void accept(Student t) {
//				System.out.println(t);
//			}
//		
//		});
		
		// lambda expression
//		list1.forEach((s) -> {
//			System.out.println(s);
//		});
		
//		System.out.println(list1.contains(s4));
	}

}
