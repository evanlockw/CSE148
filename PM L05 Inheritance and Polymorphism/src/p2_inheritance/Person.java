package p2_inheritance;

public class Person {
	private Name name;
	private String id;

	private static int idCounter = 0;

	public Person(String firstName, String lastName) {
//		super();
		name = new Name(firstName, lastName);
		id = String.valueOf(idCounter++);
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	void setId(String id) { // default access, aka package access
		this.id = id;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", id=" + id + "]";
	}

}
