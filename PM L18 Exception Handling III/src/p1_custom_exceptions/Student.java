package p1_custom_exceptions;

public class Student {
	private String name;
	private double gpa;

	public Student(String name, double gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
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

	public void setGpa(double gpa)  {
		try {
			if(gpa < 0.0) {
				throw new InvalidGPAException("GPA entered is too small!");
			}
			if(gpa > 4.0) {
				throw new InvalidGPAException("GPA entered is too big!");
			}
		} catch (InvalidGPAException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}

}
