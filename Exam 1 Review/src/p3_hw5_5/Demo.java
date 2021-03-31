package p3_hw5_5;

public class Demo {

	public static void main(String[] args) {
		CoursesTakenBag bag1 = new CoursesTakenBag(40);
		
		CourseTaken ct1 = new CourseTaken("CSE110", "College Seminar for CS", 1, "A");
		CourseTaken ct2 = new CourseTaken("CSE118", "Intro to Java", 3, "B+");
		CourseTaken ct3 = new CourseTaken("MAT141", "Calc I", 4, "A");
		CourseTaken ct4 = new CourseTaken("PHY101", "Physics 1", 4, "B");
		
		bag1.insert(ct4);
		bag1.insert(ct1);
		bag1.insert(ct3);
		bag1.insert(ct2);
		
		Student s1 = new Student("John", "Doe", bag1);
		System.out.println(s1.calculateGpa());
	}

}
