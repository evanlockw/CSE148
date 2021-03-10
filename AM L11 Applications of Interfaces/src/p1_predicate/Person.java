package p1_predicate;

public class Person {
	private String name;
	private int id;
	private static int idCounter = 0;
	
	public Person(String name) {
		this.name = name;
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
		return "Person [name=" + name + ", id=" + id + "]";
	}
	
	
}
