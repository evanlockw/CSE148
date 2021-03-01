package p1_abstract_classes_methods;

public class Instructor extends Person {
	private String rank;

	public Instructor(String firstName, String lastName, String rank) {
		super(firstName, lastName);
		this.rank = rank;
	}
	// deepcopy constructor
	public Instructor(Instructor i) {
		super(i.getName().getFirstName(), i.getName().getLastName());
		Person.decrementIdCounter();
		this.rank = i.getRank();
		this.setId(i.getId());
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Instructor [" + super.toString() + ", rank=" + rank + "]";
	}
	@Override
	public double payBills() {
		return 100.0;
	}
	
	
}
