package p3;

import p1.Animal;

public class Dog extends Animal {

	public Dog(String name, double weight) {
		super(name, weight);
	}
	
	public Dog(Dog dog) {
		super(dog.getName(), dog.getWeight());
	}

	@Override
	public void makeSound() {
		System.out.println("Woof, woof...");
	}

}
