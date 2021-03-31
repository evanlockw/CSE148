package p1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("Enter an integer: ");
				int number = scanner.nextInt(); 
				System.out.println("The number entered is: " + number);
				break;
			} catch (Exception e) {
				scanner.nextLine();
				System.out.println("Make sure you enter an integer!");
			}
		}

		System.out.println("Good job!");
	}

}
