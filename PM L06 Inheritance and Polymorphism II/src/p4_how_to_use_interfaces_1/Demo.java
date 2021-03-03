package p4_how_to_use_interfaces_1;

public class Demo {

	public static void main(String[] args) {
		WoodenDuck wd1 = new WoodenDuck("WD1");
		wd1.display();
		
		Displayable wd2 = new WoodenDuck("WD2");
		wd2.display();
	}

}
