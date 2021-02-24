package p2_inheritance_2;

/*
 * When there is a clear "IS A" relationship between superclass and subclass objects
 */
public abstract class Person  { // A regular class is also known as a concrete class
	// state, fields
	private Name name;
	private String id;

	private static int idCounter = 0;

	// behavior
	public Person(String firstName, String lastName) {
		name = new Name(firstName, lastName);
		id = String.valueOf(idCounter++);
	}
	
	public abstract double FineOwed();  // forces subclasses to implement
	
	public abstract void display();

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", id=" + id + "]";
	}

}
