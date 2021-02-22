package p1_inheritiance;

public class Demo1 {

	public static void main(String[] args) {
		Student s1 = new Student("John", "Doe");
		System.out.println(s1);
		
		Instructor i1 = new Instructor("Jane", "Doe", "Professor");
		System.out.println(i1);
	}

}
