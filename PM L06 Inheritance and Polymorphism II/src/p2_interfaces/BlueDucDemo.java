package p2_interfaces;

public class BlueDucDemo {

	public static void main(String[] args) {
		BlueDuck bd1 = new BlueDuck();
		bd1.fly();
		bd1.swim();
		bd1.quack();
		bd1.walk();
		Duckable.eat();
	}

}
