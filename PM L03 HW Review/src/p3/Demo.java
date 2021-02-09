package p3;

public class Demo {

	public static void main(String[] args) {
		Cat cat1 = new Cat("A");
		for(int i = 0; i < 5; i++) {
			cat1.feed(5.0 + (Math.random() * 11));
		}
		System.out.println(cat1.getName() +"'s weight is: " + cat1.getWeight());
	}

}
