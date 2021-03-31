package p1;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		
		scanner.nextLine(); // consume the enter character left after integer got captured.
		
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		
		System.out.println(name + ", your age is " + age);
		
	}

}
