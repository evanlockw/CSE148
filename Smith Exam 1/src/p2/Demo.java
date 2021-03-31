package p2;

import p1.Duck;

public class Demo {

	public static void main(String[] args) {
		Duck md1 = new MallardDuck("MD1", 3);
		Duck dd1 = new DivingDuck("DD1", 4);
		
		md1.display();
		dd1.display();
	}

}
