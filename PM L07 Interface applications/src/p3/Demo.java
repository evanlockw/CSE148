package p3;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("Z", 2.5);
		Student s2 = new Student("A", 0.5);
		Student s3 = new Student("Z", 0.5);
		Student s4 = new Student("Q", 2.1);
		Student s5 = new Student("S", 3.7);
		
		StudentBag theBag = new StudentBag(10);
		theBag.insert(s1);
		theBag.insert(s2);
		theBag.insert(s3);
		theBag.insert(s4);
		theBag.insert(s5);
		
//		System.out.println(Arrays.toString(theBag.searchByGpa(0.5)));
//		System.out.println(Arrays.toString(theBag.searchByName("Z")));
		
		System.out.println(Arrays.toString(theBag.search((s) -> {
			return s.getName().equals("A");
		})));
		
		System.out.println(Arrays.toString(theBag.search((s) -> {
			return s.getGpa() == 0.0;
		})));
	}

}
