package p2;

public class Demo {

	public static void main(String[] args) {
		Name name1 = new Name("John", "Doe");
//		System.out.println(name1);
		
		Student s1 = new Student(name1, 2.5);
		System.out.println(s1.getName().getFirstName());
		System.out.println(s1.getName().getLastName());
		
		Name name2 = new Name("Jane", "Doe"); 
		Student s2 = new Student(name2, 3.0 );
		
	}

}
