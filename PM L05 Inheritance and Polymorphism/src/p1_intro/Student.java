package p1_intro;

public class Student {
	private Name name;
	private double gpa;
	private String id;
	
	private static int idCounter = 0;
	
	public Student(String firstName, String lastName) {
		name = new Name(firstName, lastName);
		gpa = 0.0;
		id = String.valueOf(idCounter++);
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", gpa=" + gpa + "]";
	}

	
}
