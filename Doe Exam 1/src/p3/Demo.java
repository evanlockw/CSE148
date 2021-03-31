package p3;

public class Demo {

	public static void main(String[] args) {
		Dog d1 = new Dog("D1", 10);
		Dog d2 = new Dog(d1);
		Dog d3 = d1;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d1 == d3);
	}

}
