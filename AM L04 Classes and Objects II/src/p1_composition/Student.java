package p1_composition;

public class Student {
	// instance variables, fields: holding data for objects
	private Name name; // package (default) access
	private double gpa;
	private String id;
	
	// static variable, class variable
	private static int counter = 0;

	public Student(Name name, double gpa) { // local variables
		super();
		this.name = name;
		this.gpa = gpa;
		id = String.valueOf(counter++);
	}
	

	public String getId() {
		return id;
	}

// to make the id number immutable
//	public void setId(int id) {
//		this.id = id;
//	}


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

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Student.counter = counter;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", ID=" + id + ", gpa=" + gpa + "]";
	}

}
