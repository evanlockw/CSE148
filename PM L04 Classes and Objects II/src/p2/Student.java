package p2;

public class Student {
	private Name name;
	private double gpa;
	private String id;
	
	private static int idCounter = 0;
	
	public Student(Name name, double gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
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

//	public void setId(int id) {
//		this.id = id;
//	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + ", ID=" + id + "]";
	}

	
}
