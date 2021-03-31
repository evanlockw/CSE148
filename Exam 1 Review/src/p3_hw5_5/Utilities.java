package p3_hw5_5;

public class Utilities {

	public static double convertLetterGrade(String letterGrade) {
		if (letterGrade.equals("A"))
			return 4.0;
		else if (letterGrade.equals("B+"))
			return 3.5;
		else if (letterGrade.equals("B"))
			return 3.0;
		else if (letterGrade.equals("C+"))
			return 2.5;
		else if (letterGrade.equals("C"))
			return 2.0;
		else if (letterGrade.equals("D+"))
			return 1.5;
		else if (letterGrade.equals("D"))
			return 1.0;
		else if (letterGrade.equals("F"))
			return 0.0;
		else {
			return 0.0;
		}
	}

}
