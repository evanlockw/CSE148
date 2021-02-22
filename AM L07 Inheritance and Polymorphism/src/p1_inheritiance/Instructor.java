package p1_inheritiance;

public class Instructor {
	private Name name;
	private String rank;
	private String id;

	private static int idCounter = 0;

	public Instructor(String firstName, String lastName, String rank) {
		name = new Name(firstName, lastName);
		this.rank = rank;
		id = String.valueOf(idCounter++);
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Instructor [name=" + name + ", id=" + id + ", rank=" + rank + "]";
	}

}
