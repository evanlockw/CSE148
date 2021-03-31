package p2;

import p1.Animal;

public class Cat extends Animal {

	public Cat(String name, double weight) {
		super(name, weight);
	}

	@Override
	public void makeSound() {
		System.out.println("Meow, meow...");
	}
	
	

}
