package p2_inheritance;

public class Student extends Person {
	private double gpa;

	public Student(String firstName, String lastName, double gpa) {
		super(firstName, lastName); // superclass's constructor. it has to be the first statement
		this.gpa = gpa;
	}
	
	// deepcopy constructor
	public Student(Student s) {
		super(s.getName().getFirstName(), s.getName().getLastName());
		this.gpa = s.getGpa();
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
	
	
}
