package p2;

public class StudentBagHelper {

	public static StudentBag fillTheBag(int extraSize, int numberOfStudents) {
		StudentBag theBag = new StudentBag(extraSize + numberOfStudents);
		for (int i = 0; i < numberOfStudents; i++) {
			theBag.insert(StudentHelper.getRandomStudent());
		}
		return theBag;
	}
}
