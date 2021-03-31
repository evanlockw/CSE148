package p6;

import java.util.Arrays;

import p1.Animal;
import p2.Cat;
import p2.Dog;

public class Demo {

	public static void main(String[] args) {
		Dog d1 = new Dog("D1", 10);
		Dog d2 = new Dog("D2", 5);
		Cat c1 = new Cat("C1", 5);
		Cat c2 = new Cat("C2", 2);
		
		AnimalBag theBag = new AnimalBag(10);
		theBag.insert(d1);
		theBag.insert(d2);
		theBag.insert(c1);
		theBag.insert(c2);
		
//		Animal[] matchesByName = theBag.search((a) -> {
//			return a.getName().equals("D1");
//		});
		
		Animal[] matchesByWeight = theBag.search((a) -> {
			return a.getWeight() == 2;
		});
		
//		System.out.println(Arrays.toString(matchesByName));
		System.out.println(Arrays.toString(matchesByWeight));
		
	}

}
