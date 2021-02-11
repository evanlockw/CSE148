package p1_course;

public class Instructor {
	private Name name;
	private String title;// Instructor, Assistant Professor, Associate Professor, Professor
	private double salary;
	private String id;

	private static int idCounter = 0;

	public Instructor(String firstName, String lastName, String title, double salary) {
		super();
		this.name = new Name(firstName, lastName); // composition
		this.title = title;
		this.salary = salary;
		this.id = String.valueOf(idCounter++);
	}
	
	public Instructor(Instructor instructor) {
		this.name = new Name(instructor.name.getFirstName(), instructor.name.getLastName());
		this.title = instructor.title;
		this.salary = instructor.salary;
		this.id = instructor.id;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Instructor [name=" + name + ", title=" + title + ", salary=" + salary + ", id=" + id + "]";
	}

}
