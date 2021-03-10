package p7_interface_usage_3;

public class Demo {

	public static void main(String[] args) {
//		Moveable d1 = new Moveable() {
//
//			@Override
//			public void fly() {
//				System.out.println("flying...");
//			}
//			
//		};
		
		Moveable d1 = () -> {  // lambda expression, part of functional programming
			System.out.println("flying one way...");
		};
		
//		int i = x + y;
//		y = x^2 + 2x + 1; // math function
//		int y = 5;
//		setAge(y);
//		setAge(x^2 + 2x + 1) // With Java functional programming, you may pass a function as data to a method
		
		d1.fly();
		
		Moveable d2 = () -> {
			System.out.println("Fly the other way...");
		};
		
		d2.fly();
	}

}
