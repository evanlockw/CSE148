package p1_predicate;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		PersonBag theBag = new PersonBag(5);
		theBag.insert(new Person("M"));
		theBag.insert(new Person("A"));
		theBag.insert(new Person("Z"));
		theBag.insert(new Person("A"));
		
		Person[] result1 = theBag.search((p) -> {
			return p.getName().equals("A");
		});
		
		Person[] result2 = theBag.search((p) -> {
			return p.getId() == 0;
		});
		
		System.out.println(Arrays.toString(result1));
		System.out.println(Arrays.toString(result2));
	}

}
