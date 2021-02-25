package p2_interface;

public class MallardDuck implements Swimable, Flyable, Quackable {

	@Override
	public void swim() {
		System.out.println("Swim...");
	}

	@Override
	public void fly() {
		System.out.println("Fly...");
	}

	@Override
	public void quack() {
		System.out.println("Quack...");
	}

}
