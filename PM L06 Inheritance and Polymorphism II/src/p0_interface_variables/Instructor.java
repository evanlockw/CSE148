package p0_interface_variables;

public class Instructor implements InstructorInterface {
	
	private String name;
	private String rank;
	
//	public Instructor(String name, InstructorInterface.PROF rank) {
//		super();
//		this.name = name;
//		this.rank = rank;
//	}

	@Override
	public String toString() {
		return "Instructor [name=" + name + ", rank=" + rank + "]";
	}
	
	

}
