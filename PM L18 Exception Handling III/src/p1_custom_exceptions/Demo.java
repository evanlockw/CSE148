package p1_custom_exceptions;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("John", 3.5);
		s1.setGpa(-4.6);
		System.out.println(s1);
	}

}
