package p2_costom_exceptions;

public class Demo0 {

	public static void main(String[] args) throws IncorrectGPAException {
		Student s1 = new Student("A", 4.0);
		s1.setGpaIrresponsible(5.0);
	}

}
