package p2_predicate;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		StudentBag theBag = new StudentBag(100);
		Student s1 = new Student("B", 2.5);
		Student s2 = new Student("C", 3.5);
		Student s3 = new Student("Z", 1.5);
		Student s4 = new Student("M", 3.8);

		theBag.insert(s1);
		theBag.insert(s2);
		theBag.insert(s3);
		theBag.insert(s4);

		Student[] matches = theBag.search((t) -> t.getName().startsWith("Z") || t.getGpa()>=3.5);

		System.out.println(Arrays.toString(matches));

	}

}
