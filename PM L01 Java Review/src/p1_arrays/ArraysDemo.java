package p1_arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		hello("John");
		String[] names = {"Adam", "Bill", "Cathy"};
		hello(names);
	}
	
	//overloaded methods
	public static void hello(String name) {
		System.out.println("Hello, " + name + "!");
	}

	public static void hello(String[] names) {
		System.out.print("Hello, ");
		int i;
		for(i = 0; i < names.length-1; i++) {
			System.out.print(names[i] + ", ");
		}
		System.out.println(names[i] + "!");
	}
	
}
