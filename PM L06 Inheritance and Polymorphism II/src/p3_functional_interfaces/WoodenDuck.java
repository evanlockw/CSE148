package p3_functional_interfaces;

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
		System.out.println("WoodenDuck display..." + Math.PI);
	}

}
