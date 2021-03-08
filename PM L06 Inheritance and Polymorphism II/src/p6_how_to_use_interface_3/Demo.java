package p6_how_to_use_interface_3;

public class Demo {

	public static void main(String[] args) {
//		Displayable duck1 = new Displayable() {
//
//			@Override
//			public void display() {
//				System.out.println("Duck1 displays...");
//			}
//			
//		};
//		duck1.display();
		
		Displayable duck1 = () -> { // lambda expression, illusion of functional programming
			System.out.println("Duck1 displays...");
		};
		
		Displayable duck2 = () -> { // lambda expression
			System.out.println("Duck2 displays differently...");
		};
		
		duck1.display();
		duck2.display();
	}

}
