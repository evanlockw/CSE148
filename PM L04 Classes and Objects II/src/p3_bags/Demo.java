package p3_bags;

import p2.Name;
import p2.Student;

public class Demo {

	public static void main(String[] args) {
		StudentBag theBag = new StudentBag(10);
		Student s1 = new Student(new Name("AF", "AL"), 1.0);
		Student s2 = new Student(new Name("BF", "BL"), 1.0);
		Student s3 = new Student(new Name("CF", "CL"), 1.0);
		Student s4 = new Student(new Name("DF", "DL"), 1.0);
		
		Student s5 = new Student(s1);
		Student s6 = new Student(s3);
		
		
		s1.setGpa(4.0);
		
		theBag.insert(s1); // shallow copy
		theBag.insert(s2);
		theBag.insert(s3);
		theBag.insert(s4);
		theBag.insert(s5);
		theBag.insert(s6);
		
		theBag.display();
		
		
//		System.out.println(theBag.removeById("2"));
		
//		theBag.display();
//		System.out.println(theBag.searchById("2"));
		
	}

}
