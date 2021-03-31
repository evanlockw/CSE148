package p2_costom_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
	private String name;
	private double gpa;

	public Student(String name, double gpa) {
		super();
		this.name = name;
		setGpaResponsible(gpa);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpaResponsible(double gpa) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				if (gpa > 4.0) {
					throw new IncorrectGPAException("GPA entered is greater than 4.0");
				}
				if (gpa < 0.0) {
					throw new IncorrectGPAException("GPA entered is less than 0.0");
				}
				break;
			} catch (IncorrectGPAException e) {
				System.out.println(e.getMessage());
//				e.printStackTrace();
				System.out.println("Enter a GPA between 0.0 and 4.0: ");
				while (true) {
					try {
						gpa = scanner.nextDouble();
						break;
					} catch (InputMismatchException e1) {
						scanner.nextLine();
						System.out.println("Input mismatch! Re-enter a GPA: ");
					} 
				}
			} 
		}
		this.gpa = gpa;
	}
	
	public void setGpaIrresponsible(double gpa) throws IncorrectGPAException {
		
				if (gpa > 4.0 || gpa < 0.0) {
					throw new IncorrectGPAException("Wrong GPA value entered");
				}
			
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}

}
