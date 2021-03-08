package p5_how_to_use_interface_2;

public class Demo {

	public static void main(String[] args) {
		Displayable wd1 = new Displayable() {

			@Override
			public void display() {
				System.out.println("WoodenDuck1 displays wd1 way...");
			}

			@Override
			public void fly() {
				System.out.println("WoodenDuck1 flys wd1 way...");
			}
			
		};
		
		Displayable wd2 = new Displayable() {

			@Override
			public void display() {
				System.out.println("WoodenDuck2 displays wd2 way...");
			}

			@Override
			public void fly() {
				System.out.println("WoodenDuckw flys wd2 way...");

			}
			
		};
		
		wd1.display();
		wd1.fly();
		
		wd2.display();
		wd2.fly();
	}

}
