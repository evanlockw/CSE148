package p2_inheritance_2;

public class Demo1 {

	public static void main(String[] args) {
//		Person p1 = new Person("PersonAFirstName", "PersonALastName");
////		System.out.println(p1);
//		
//		Person p2 = new Person("PersonBFirstName", "PersonBLastName");
////		System.out.println(p2);
//		
//		Student s1 = new Student("StudentAFirst", "StudentALast");
////		System.out.println(s1);
//		
//		s1.getName().setFirstName("StudentANewFirst");
////		System.out.println(s1);
//		
//		Student s2 = new Student("StudentBFirst", "StudentBLast");
////		System.out.println(s2);
//		
//		Instructor i1 = new Instructor("InstructorAFirst", "InstructorALast", "Professor");
////		System.out.println(i1);
//		
//		Instructor i2 = new Instructor("InstructorBFirst", "InstructorBLast", "Associate Professor");
////		System.out.println(i2);
//		
////		System.out.println(p1 instanceof Student);
//		
//		System.out.println(i1 instanceof Person);
		
		Student s1 = new Student("StudentFirstName1", "StudentLastName1");
		Name name = s1.getName();
		System.out.println(s1.FineOwed());
		s1.display();
		Instructor i1 = new Instructor("InstructorAFirst", "InstructorALast", "Professor");
		System.out.println(i1.FineOwed());
		i1.display();
	}

}
