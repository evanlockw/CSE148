package p1_composition;

public class Demo {

	public static void main(String[] args) {
//		Name name = new Name("John", "Doe");
//		Student s1 = new Student(name, 3.5);
//		
//		System.out.println(s1.getName());
//		s1.getName().setFirstName("Jane");
//		System.out.println(s1.getName());

		Name name1 = new Name("John", "Doe");
		Student s1 = new Student(name1, 3.0);

		Name name2 = new Name("Jane", "Doe");
		Student s2 = new Student(name2, 4.0);
		
//		System.out.println(s1);
//		System.out.println(s2);
//		
		Student[] students = new Student[1000];
		students[0] = s1;
		students[1] = s2;
		System.out.println(students[0]);
		System.out.println(students[1]);
	

	}

}
