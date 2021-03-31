import java.util.Arrays;

import p1.Duck;
import p2.DivingDuck;
import p2.MallardDuck;
import p4.DuckBag;

public class Demo {

	public static void main(String[] args) {
		Duck d1 = new MallardDuck("MD1", 1);
		Duck d2 = new MallardDuck("MD2", 2);
		Duck d3 = new MallardDuck("MD3", 2);
		Duck d4 = new DivingDuck("DD1", 10);
		Duck d5 = new DivingDuck("DD2", 2);
		Duck d6 = new DivingDuck("DD3", 3);
		
		DuckBag theBag = new DuckBag(10);
		
		theBag.insert(d1);
		theBag.insert(d2);
		theBag.insert(d3);
		theBag.insert(d4);
		theBag.insert(d5);
		theBag.insert(d6);
		
		Duck[] sortedDucks = theBag.sortByAge();
		System.out.println(Arrays.toString(sortedDucks));
		System.out.println("The bag content:");
		theBag.display();
		
//		Duck[] ducksFound =theBag.removeByAge(2);
//		System.out.println("Ducks removed: ");
//		System.out.println(Arrays.toString(ducksFound));
//		System.out.println("---------------------");
//		System.out.println("After removal, the bag still has: ");
//		theBag.display();
		
	}

}
