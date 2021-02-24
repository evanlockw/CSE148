package p2_inheritance;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("SF1", "SL1", 3.0);
		Instructor i1 = new Instructor("IF1", "IL1", "Professor");
		Person p1 = new Student("SF2", "SL2", 2.5);
		Person p2 = new Instructor("IF2", "IL2", "Associate Professor");
		Person p3 = new Person("PF1", "PL2");
		Student s2 = new Student("SF6", "SL6", 1.0);
		// we can use a variable of the super type to reference an object of a subclass type
		// This is called polymorphism
		
//		System.out.println(p1 instanceof Student);
//		System.out.println(p1 instanceof Instructor);
//		System.out.println(p1 instanceof Person);
//		System.out.println(i1 instanceof Person);
//		System.out.println(s1);
//		System.out.println(i1);
		
		PersonBag theBag = new PersonBag(100);
		theBag.insert(s1);
		theBag.insert(i1);
		theBag.insert(p1);
		theBag.insert(p2);
		theBag.insert(p3);
		theBag.insert(s2);
		
//		
//		Student[] a = theBag.searchStudents();
//		for(Student student : a) {
//			System.out.println(student);
//		}
		
		
//		Student student1 = new Student("A", "B", 1.0);
//		Student student2 = new Student("C", "D", 2.0);
//		student1 = student2; // shallow copy
//		System.out.println(student1 == student2);
		
		Student student1 = new Student("A", "B", 1.0);
		Student student2 = new Student(student1);
		System.out.println(student1.getName() ==  student2.getName());
	}

}
