package p1_review;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("A", 1.0);
		Student s2 = s1; // shallow copy: copy the address of the object from one ref variable to another
		s1.setName("B");
		s2.setName("B");
		
		
		Student s3 = new Student(s1.getName(), s1.getGpa()); // deep copy: copy the data to create a new object
		s3.setName("C");
		
		
		
		
//		Student s1;
//		s1 = new Student("Joe", 3.0);
//		
//		Student s2 = s1;
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		
//		s1.setName("Joey");
//		System.out.println(s1);
//		System.out.println(s2);
//		
//		s1 = null;
//		System.out.println(s1);
//		System.out.println(s2);
//		
////		s2 = null;
////		
////		// garbage collector
//		
//		int x = 5;
//		x = 6;
	}

}
