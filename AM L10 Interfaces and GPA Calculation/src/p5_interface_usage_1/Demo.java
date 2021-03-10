package p5_interface_usage_1;

public class Demo {

	public static void main(String[] args) {
		Duck d1 = new Duck(); // default constructor, also no-arg constructor
		Duck d2 = new Duck(); 
		Moveable d3 = new Duck();
		d1.fly();
		d1.walk();
		d2.fly();
		d2.walk();
		d3.fly();
		d3.walk();
	}

}
