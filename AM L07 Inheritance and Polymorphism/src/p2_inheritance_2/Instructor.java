package p2_inheritance_2;

// a subclass (the Instructor class in this case) automatically inherits every member that is NOT private from the superclass
public class Instructor extends Person implements InstructorInterface {
	private String rank;
	private final double PARKING_FEES = 100;
	
	public Instructor(String firstName, String lastName, String r) {
		super(firstName, lastName); // superclass constructor must come first in subclass constructor
		this.rank = r;
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
	public double FineOwed() {
		return PARKING_FEES;
	}

	@Override
	public void display() {
		System.out.println(toString());
	}
	
	
	

}
