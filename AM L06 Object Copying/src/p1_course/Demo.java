package p1_course;

public class Demo {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor("John", "Doe", "Professor", 100000.99);
		
		Textbook textbook1 = new Textbook("Java", "1234567890", 99.99);
		Textbook textbook2 = new Textbook("Data Structures in Java", "9876543210", 199.99);
		
		//shallow copy: copy the memory address of an object
		Course c1 = new Course("CSE148", "Object-Oriented Programming", 4, new Instructor(instructor1), textbook1);
		Course c2 = new Course("CSE218", "Data Structures", 3, new Instructor(instructor1), textbook2);
		
		CourseBag courseBag = new CourseBag(1000);
		courseBag.insert(c1);
		courseBag.insert(c2);
		
		instructor1.getName().setLastName("Smith");
		
		c1.getInstructor().getName().setLastName("Chen");
		
		System.out.println(courseBag.searchByCourseNumber("CSE218").getInstructor().getName().getLastName());
	
//		Name n1 = new Name("John", "Doe");
//		Name n2 = n1;
//		n2.setLastName("Smith");
//		System.out.println(n1.getLastName());
//		
		// deep copy
//		Name n1 = new Name("John", "Doe");
//		Name n2 = new Name(n1.getFirstName(), n1.getLastName());
//		
//		n2.setLastName("Smith");
//		System.out.println(n2.getLastName());
//		System.out.println(n1.getLastName());
		
	
		
	}

}
