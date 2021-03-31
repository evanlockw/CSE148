package p2_costom_exceptions;

public class Demo2 {

	public static void main(String[] args) {
		Student s1 = new Student("A", 3.5);
		System.out.println(s1);
		s1.setGpaResponsible(14.5);
		System.out.println(s1);
	}

}
