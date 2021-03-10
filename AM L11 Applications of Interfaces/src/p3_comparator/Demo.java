package p3_comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Demo {

	public static void main(String[] args) {
		Person[] arr = {new Person("Mike", 3.0), new Person("Bob", 1.5), new Person("Zack", 4.0)};
		
//		Comparator<Person> myComparator = new Comparator<Person>() {
//
//			@Override
//			public int compare(Person o1, Person o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//			
//		};
		
//		Arrays.sort(arr, myComparator);
		
		Arrays.sort(arr, (p1, p2) -> {
			return Double.compare(p1.getGpa(), p2.getGpa());
		});
		
		System.out.println(Arrays.toString(arr));
	}

}
