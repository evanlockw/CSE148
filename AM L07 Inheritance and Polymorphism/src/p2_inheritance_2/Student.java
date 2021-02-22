package p2_inheritance_2;

public class Student extends Person {
	private double gpa;

	public Student(String firstName, String lastName) {
		super(firstName, lastName);
		this.gpa = 0.0;
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
