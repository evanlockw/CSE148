package p1_composition;

public class Demo {

	public static void main(String[] args) {
		Name name = new Name("John", "Doe");
		Student s1 = new Student(name, 3.5);
		
		System.out.println(s1.getName());
		s1.getName().setFirstName("Jane");
		System.out.println(s1.getName());
		
		
	}

}
