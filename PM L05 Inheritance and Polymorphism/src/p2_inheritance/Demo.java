package p2_inheritance;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("SF1", "SL1", 3.0);
		Instructor i1 = new Instructor("IF1", "IL1", "Professor");
		System.out.println(s1);
		System.out.println(i1);
	}

}
