package p1_introduction;

public class MallardDuck implements Duckable {

	@Override
	public void swim() {
		System.out.println("MallardDuck swims...");
	}

	@Override
	public void quack() {
		System.out.println("MallardDuck quacks...");
	}

	@Override
	public void fly() {
		System.out.println("MallardDuck flys...");
	}

}
