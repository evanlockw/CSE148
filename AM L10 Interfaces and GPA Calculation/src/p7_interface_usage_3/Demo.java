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
		
		d1.fly();
		
		Moveable d2 = () -> {
			System.out.println("Fly the other way...");
		};
		
		d2.fly();
	}

}
