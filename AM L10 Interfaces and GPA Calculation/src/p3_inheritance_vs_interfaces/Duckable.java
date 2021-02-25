package p3_inheritance_vs_interfaces;

public abstract class Duckable {
	private static final double WEIGHT = 0.0;
	
	abstract void swim();
	abstract void fly();
	abstract void quack();
	
	public void walk() {
		System.out.println("Walking...");
	}
	
	public static void eat() {
		System.out.println("Eat...");
	}
	
}
