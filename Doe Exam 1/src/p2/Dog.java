package p2;

import p1.Animal;

public class Dog extends Animal {

	public Dog(String name, double weight) {
		super(name, weight);
	}

	@Override
	public void makeSound() {
		System.out.println("Woof, woof...");
	}

}
