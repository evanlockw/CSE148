package p1_predicate;

import java.util.function.Predicate;

public class Demo {

	public static void main(String[] args) {
//		Predicate predicate = new Predicate<Student>() {
//
//			@Override
//			public boolean test(Student t) {
//
//				if (t.getName().startsWith("Z")) {
//					return true;
//				} else {
//					return false;
//				}
//			}
//
//		};
		

		Student s1 = new Student("Zack", 2.5, (t) -> {
			if (t.getName().startsWith("Z")) {
				return true;
			} else {
				return false;
			}
		});
		
		Student s2 = new Student("Jack", 2.5, (t) -> {
			if (t.getGpa() >= 3.5) {
				return true;
			} else {
				return false;
			}
		});
		
		System.out.println(s1.isOnDeansList());
		System.out.println(s2.isOnDeansList());
	}

}
