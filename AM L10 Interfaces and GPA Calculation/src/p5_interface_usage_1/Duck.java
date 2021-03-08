package p5_interface_usage_1;

public class Duck implements Moveable{

	@Override
	public void fly() {
		System.out.println("fly one way...");
	}

	@Override
	public void walk() {
		System.out.println("Walk one way...");
	}

}
