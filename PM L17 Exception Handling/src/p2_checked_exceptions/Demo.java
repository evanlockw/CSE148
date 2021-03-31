package p2_checked_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args)    {
		File file = new File("p2_checked_exceptions/Data.txt");
	
		try {
			Scanner scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} //FileNotFoundException object created here
		
		System.out.println("The end at the end of the program");
	}

}
