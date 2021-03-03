package p3_functional_interfaces;

public class Demo {

	public static void main(String[] args) {
		WoodenDuck wd1 = new WoodenDuck("WD1");
		wd1.display();
		
		Displayable wd2 = new WoodenDuck("WD2");
		wd2.display();
	}

}
