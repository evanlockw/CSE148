package p2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DemoChecked {

	public static void main(String[] args) {
		File file = new File("data.txt");
		try {
			Scanner scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("The file cannot be found!");
			System.out.println(e.getMessage());
		}
		
		System.out.println("end");
		
	}

}
