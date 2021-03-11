package p1;

import java.util.ArrayList;

public class Demo2 {

	public static void main(String[] args) {
		Student s1 = new Student("A", 1.0);
		Student s2 = new Student("Z", 1.5);
		Student s3 = new Student("M", 0.0);
		Student s4 = new Student("Q", 2.1);
		Student s5 = new Student("A", 0.0);
		Student s6 = new Student("F", 2.5);
		
		StudentBag theBag = new StudentBag(100);
		theBag.add(s1);
		theBag.add(s2);
		theBag.add(s3);
		theBag.add(s4);
		theBag.add(s5);
		theBag.add(s6);
		
		ArrayList<Student> removed = theBag.remove((s) -> {
//			return s.getName().equals("A");
			return s.getGpa() == 0.0;
		});
		System.out.println(removed);
		System.out.println("-------------------------");
		theBag.display();
		
	}

}
