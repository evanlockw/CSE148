package p3_example1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.println("Enter an integer: ");
				int number = scanner.nextInt();// 
				
				System.out.println("The number entered is: " + number);
				break;
			} catch (Exception e) {
				scanner.nextLine();
				System.out.println("Wrong input.\n");
			} 
		}
		
		System.out.println("The end!");
		
	}

}
