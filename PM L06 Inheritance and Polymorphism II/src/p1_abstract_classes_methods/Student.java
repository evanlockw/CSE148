package p1_abstract_classes_methods;

public class Student extends Person {
	private double gpa;

	public Student(String firstName, String lastName, double gpa) {
		super(firstName, lastName); // superclass's constructor. it has to be the first statement
		this.gpa = gpa;
	}
	
	// deepcopy constructor
	public Student(Student s) {
		super(s.getName().getFirstName(), s.getName().getLastName());
		Person.decrementIdCounter();
		this.gpa = s.getGpa();
		this.setId(s.getId());
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	@Override
	public String getId() {
		return "S" + super.getId();
	}

	@Override
	public String toString() {
		return "Student [" + super.toString() + ", gpa=" + gpa + "]";
	}


	@Override
	public double payBills() {
		return 50.0;
	}
	
//	public abstract void getGpa();
	
}
