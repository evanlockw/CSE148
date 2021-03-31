package p1_unchecked_runtime_exceptions;

import java.util.InputMismatchException;

// source code
public class Demo {

	public static void main(String[] args)  {
		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		try {
			System.out.println(numbers[6]); // offensive
			/*
			 * The offending statement (line 8) will create 
			 * an object that records the cause of the problem.
			 * The object is of the type ArrayIndexOutOfBoundsException.
			 */
		} catch (IllegalArgumentException | InputMismatchException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
//		for (int i = 0; i <= numbers.length; i++) {
//			System.out.print(numbers[i] + " ");
//		}
//		System.out.println();
		
//		String name = null;
//		System.out.println(name.length());
		System.out.println("Finished!");
	}

}
