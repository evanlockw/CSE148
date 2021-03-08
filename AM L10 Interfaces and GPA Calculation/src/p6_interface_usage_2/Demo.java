package p6_interface_usage_2;

public class Demo {

	public static void main(String[] args) {
		Moveable d1 = new Moveable() {

			@Override
			public void fly() {
				System.out.println("Duck flying...");
			}

			@Override
			public void walk() {
				System.out.println("Duck walking...");
			}
			
		};
		
		Moveable d2 = new Moveable() {

			@Override
			public void fly() {
				System.out.println("No fly...");
			}

			@Override
			public void walk() {
				System.out.println("Dog walking...");
			}
			
		};
		
		d1.fly();
		d1.walk();
		
		d2.fly();
		d2.walk();
		
	}

}
