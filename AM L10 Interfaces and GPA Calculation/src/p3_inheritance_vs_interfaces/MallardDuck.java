package p3_inheritance_vs_interfaces;

public class MallardDuck extends Duckable {

	@Override
	void swim() {
		System.out.println("Swim...");
	}

	@Override
	void fly() {
		System.out.println("Fly...");
	}

	@Override
	void quack() {
		System.out.println("Quack...");
	}

}
