package p1_intro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
//		int[] numbers = {2, 4, 5, 7, 8, 10};
//		for (int i = 0; i <= 6; i++) { // Runtime exception, unchecked exception
//			System.out.println(numbers[i]);
//		}
//		
		File file = new File("data/First Names.txt");
		Scanner scanner = null;

		try {
			scanner = new Scanner(file);
			System.out.println("No issues!");
		} catch (FileNotFoundException ee) {
			System.out.println("Red alert!");
//			ee.printStackTrace();
		} finally {
			System.out.println("Finally!!!!");
		}

//		while (scanner.hasNextLine()) {
//			System.out.println(scanner.nextLine());
//		}
		System.out.println("The End");
	}

}
