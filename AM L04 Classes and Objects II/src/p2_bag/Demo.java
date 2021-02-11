package p2_bag;

import p1_composition.Name;
import p1_composition.Student;

public class Demo {

	public static void main(String[] args) {
		StudentBag theBag = new StudentBag(4);
		Name name1 = new Name("John", "Doe");
		Student s1 = new Student(name1, 2.5);
		
		Name name2 = new Name("Jane", "Doe");
		Student s2 = new Student(name2, 3.5);
		
		Name name3 = new Name("A", "A");
		Student s3 = new Student(name3, 2.5);
		
		Name name4 = new Name("B", "B");
		Student s4 = new Student(name4, 3.5);
		
		theBag.insert(s1);
		theBag.insert(s2);
		theBag.insert(s3);
		theBag.insert(s4);
		
		theBag.display();
		
		System.out.println("\nNow search a student: ");
		System.out.println(theBag.searchById("2"));
		
		System.out.println("\nNow remove a student: ");
		System.out.println(theBag.removeById("0"));
		
		System.out.println("\nNow display the bag: ");
		theBag.display();
	
	}

}
