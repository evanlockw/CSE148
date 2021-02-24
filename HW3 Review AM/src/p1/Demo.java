package p1;

public class Demo {

	private static final int NUMBER_OF_PERSONS = 2;
	private static final int NUMBER_OF_STUDENTS = 2;
	private static final int NUMBER_OF_INSTRUCTORS = 2;

	public static void main(String[] args) {
		PersonBag theBag = new PersonBag(1000);

		for (int i = 0; i < NUMBER_OF_PERSONS; i++) {
			Person p1 = new Person(Helper.getRandomFirstName(), Helper.getRandomLastName());
			theBag.insert(p1);
		}
		
		for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
			Person p1 = new Student(Helper.getRandomFirstName(), Helper.getRandomLastName());
			theBag.insert(p1);
		}
		
		for (int i = 0; i < NUMBER_OF_INSTRUCTORS; i++) {
			Person p1 = new Instructor(Helper.getRandomFirstName(), Helper.getRandomLastName(), Helper.getRandomRank());
			theBag.insert(p1);
		}
		

		theBag.display();

	}

}
