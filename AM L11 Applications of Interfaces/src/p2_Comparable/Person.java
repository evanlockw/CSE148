package p2_Comparable;

public class Person implements Comparable<Person>{
	private String name;
	private int id;
	private double gpa;
	private static int idCounter = 0;
	
	public Person(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
		id = idCounter++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", GPA= " + gpa + "]";
	}

	@Override
	public int compareTo(Person o) {
//		return name.compareTo(o.name);
//		return id - o.id;
		return Double.compare(gpa, o.gpa);
	}
	
	
}
