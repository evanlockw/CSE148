package p2_Comparable;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		Person[] arr = {new Person("Mike", 3.0), new Person("Bob", 1.5), new Person("Zack", 4.0)};
		
//		int[] numbers = { 4, 1, 8, 3, 5, 2};
//		Arrays.sort(numbers);
//		System.out.println(Arrays.toString(numbers));
//		
//		String[] letters = { "Mike", "Alan", "Zack", "Xavia", "Nolan", "Chris"};
//		Arrays.sort(letters);
//		System.out.println(Arrays.toString(letters));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
