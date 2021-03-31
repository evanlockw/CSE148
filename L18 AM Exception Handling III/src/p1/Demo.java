package p1;

import java.util.InputMismatchException;

public class Demo {

	public static void main(String[] args) {
		String[] letters = {"A", "B", "C"};
		System.out.println(letters[0]);
		System.out.println(letters[1]);
		System.out.println(letters[2]);
		try {
			System.out.println(letters[3]);
			System.out.println("Hi");
		} catch (InputMismatchException ex) {
			System.out.println(ex.getMessage());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		/* offending line, created an object (blackbox)
		 * of IndexOutOfBoundsException type
		 */
		
		System.out.println("End");
	}

}
