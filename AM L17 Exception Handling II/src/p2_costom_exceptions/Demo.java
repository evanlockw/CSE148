package p2_costom_exceptions;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student s1 = new Student("A", 3.5);
		double newGpa = 4.5;
		while (true) {
			try {
				s1.setGpaIrresponsible(newGpa);
				System.out.println(s1);
				break;
			} catch (IncorrectGPAException e) {
				System.out.println(e.getMessage());
				System.out.println("Enter a correct GPA value: ");
				newGpa = scanner.nextDouble();
				scanner.nextLine();
			} 
		}
		System.out.println("Good job!");
	}

}
