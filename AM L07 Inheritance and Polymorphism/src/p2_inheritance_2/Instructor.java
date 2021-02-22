package p2_inheritance_2;

// a subclass (the Instructor class in this case) automatically inherits every member that is NOT private from the superclass
public class Instructor extends Person {
	private String rank;

	public Instructor(String firstName, String lastName, String rank) {
		super(firstName, lastName); // superclass constructor must come first in subclass constructor
		this.rank = rank;
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
	
	
	

}
