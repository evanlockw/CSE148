package p2_interfaces;

public class BlueDuck implements Duckable {

	@Override
	public void fly() {
		System.out.println("Fly...");
	}

	@Override
	public void swim() {
		System.out.println("Swim...");
	}

	@Override
	public void quack() {
		System.out.println("Quack...");
	}

	@Override
	public void walk() {
		System.out.println("BlueDuck walks...");
	}
}
