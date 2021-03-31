package p2;

import p1.Duck;

public class DivingDuck extends Duck {

	public DivingDuck(String n, int a) {
		super(n, a);
	}

	@Override
	public void display() {
		System.out.println("Diving Duck...");
	}

}
