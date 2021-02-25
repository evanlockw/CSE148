package p1_gpa_calculation;

public class Demo {

	public static void main(String[] args) {
		
		Course c1 = new Course("CSE118", 3, "A");
		Course c2 = new Course("CSE148", 4, "A");
		Course c3 = new Course("CSE218", 3, "B");
		Course[] courses = {c1, c2, c3};
		
		Student s = new Student("John Doe", courses);
		System.out.println(s);
	}

}
