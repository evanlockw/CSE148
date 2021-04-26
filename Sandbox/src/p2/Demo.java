package p2;

import java.util.Scanner;

public class Demo {
	private static final int MIN_PASSWORD_LENGTH = 6;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a password: ");
		String password = scanner.nextLine();
		boolean isRightLength = isRightLength(password);
		boolean hasMinOneCapital = hasMinimumOneCapital(password);
		boolean hasMinOneLowercase = hasMinimumOneLowercase(password);
		boolean hasMinOneDigit = hasMinOneDigit(password);

		if (isRightLength && hasMinOneCapital && hasMinOneLowercase && hasMinOneDigit) {
			System.out.println("Correct password entered!");
		} else {
			System.out.println("Incorrect password entered!");
		}

	}
	
	public static boolean hasMinOneDigit(String password) {

		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	

	public static boolean hasMinimumOneLowercase(String password) {

		for (int i = 0; i < password.length(); i++) {
			if (Character.isLowerCase(password.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	public static boolean hasMinimumOneCapital(String password) {

		for (int i = 0; i < password.length(); i++) {
			if (Character.isUpperCase(password.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	private static boolean isRightLength(String password) {
		if (password.length() >= MIN_PASSWORD_LENGTH) {
			return true;
		} else {
			return false;
		}
	}
}
