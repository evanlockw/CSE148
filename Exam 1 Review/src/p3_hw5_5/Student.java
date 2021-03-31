package p3_hw5_5;

public class Student implements GPACalculatorInterface {
	private Name name;
	private String id;
	private CoursesTakenBag coursesTakenBag;
	private double gpa;
	
	private static int idCounter = 0;
	
	
	public Student(String firstName, String lastName, CoursesTakenBag coursesTakenBag) {
		super();
		this.name = new Name(firstName, lastName);
		this.id = String.valueOf(idCounter++);
		this.coursesTakenBag = coursesTakenBag;
		this.gpa = calculateGpa();
	}




	@Override
	public double calculateGpa() {
		
		return coursesTakenBag.getGpa();
	}
	
	
	
}
