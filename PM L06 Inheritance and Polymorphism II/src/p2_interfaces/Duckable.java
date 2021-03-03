package p2_interfaces;

public interface Duckable {
	// variables are always public, static, and final
	double WEIGHT = 1.0;
	
	// always public and abstract
	void fly(); 
	void swim();
	void quack();
	
	public default void walk() {
		System.out.println("Walk...");
	}
	
	static void eat() {
		System.out.println("Eat...");
	}
	
}
