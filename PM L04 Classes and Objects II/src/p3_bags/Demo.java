package p3_bags;

import p2.Name;
import p2.Student;

public class Demo {

	public static void main(String[] args) {
		StudentBag theBag = new StudentBag();
		
		theBag.insert(new Student(new Name("AF", "AL"), 1.0));
		theBag.insert(new Student(new Name("BF","BL"), 2.0));
		theBag.insert(new Student(new Name("CF", "CL"), 1.0));
		theBag.insert(new Student(new Name("DF","DL"), 2.0));
		
		theBag.display();
		
	}

}
