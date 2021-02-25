package p2_inheritance_2;

public class Student extends Person implements StudentInterface {
	private double gpa;
	
	private final double PARKING_FEES = 50;

	public Student(String firstName, String lastName) {
		super(firstName, lastName);
		this.gpa = 0.0;
	}
	
	@Override
	public Name getName() {
		return new Name("John", "Doe");
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [" + super.toString() + ", gpa=" + gpa + "]";
	}

	@Override
	public double FineOwed() {
		return PARKING_FEES;
	}

	@Override
	public void display() {
		System.out.println(toString());
	}

	@Override
	public double calculateGPA() {
		return 0;
	}
	
	

}
