package p2;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		StudentBag theBag = new StudentBag(100);
		
		Student s1 = new Student("A", 4.0);
		Student s2 = new Student("C", 2.0);
		Student s3 = new Student("B", 2.5);
		
		
		
		
		Student s4 = new Student("A", 4.0);
//		
//		System.out.println(s1.equals(s4));
		
		
//		String ss1 = new String("John Doe");
//		String ss2 = new String("John Doe");
		
//		System.out.println(ss1.equals(ss2));
		
		theBag.insert(s1);
		theBag.insert(s2);
		theBag.insert(s3);
		
		/* theBag.display(); */
		
//		System.out.println(theBag.search(s4));
		
//		ArrayList<Student> matchesFound = theBag.search( s -> {
//			return s.getGpa()< 3.0;
//		});
		Student[] matchesFound = theBag.search2Array( s -> {
			return s.getGpa()< 3.0;
		});
		
		System.out.println(Arrays.toString(matchesFound));
		
	}

}
