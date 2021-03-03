package p4_how_to_use_interfaces_1;

public class WoodenDuck implements Displayable {
	private String name;
	
	public WoodenDuck(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void display() {
		System.out.println("WoodenDuck displays..." + Math.PI);
	}


	@Override
	public void fly() {
		System.out.println("WoodenDuck flys....");
	}

}
