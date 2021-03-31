package p2;

import p1.Duck;

public class MallardDuck extends Duck {

	public MallardDuck(String name, int age) {
		super(name, age);
	}

	@Override
	public void display() {
		System.out.println("Mallard Duck...");
	}
	
	

}
