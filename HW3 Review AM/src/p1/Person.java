package p1;

public class Person {
	private Name name;
	private String id;
	
	private static int idCounter =  0;
	
	public Person(String firstName, String lastName) {
		name = new Name(firstName, lastName);
		id = String.valueOf(idCounter++);
	}
	
	public Person(Person person) {
		name = new Name(person.getName().getFirstName(), person.getName().getLastName());
		id = String.valueOf(idCounter++);
	}

	public Name getName() {
		return name;
	}
	
	public Name getNameDeep() {
		return new Name(name.getFirstName(), name.getLastName());
	}

	public void setName(Name name) {
		this.name = name;
	}
	
	public void setNameDeep(Name name) {
		this.name = new Name(name.getFirstName(), name.getLastName());
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", id=" + id + "]";
	}
	
	
	
}
