package p3_bags;

import p2.Name;
import p2.Student;

public class Demo {

	public static void main(String[] args) {
		StudentBag theBag = new StudentBag(5);
		Student s1 = new Student(new Name("AF", "AL"), 1.0);
		Student s2 = new Student(new Name("BF", "BL"), 1.0);
		
		theBag.insert(s1); // shallow copy
		theBag.insert(s2);
		
//		theBag.display();
		System.out.println(theBag.searchById("2"));
		
	}

}
