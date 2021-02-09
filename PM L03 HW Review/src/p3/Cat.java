package p3;

public class Cat {
	private String name;
	private double weight;
	
	public Cat(String newName) {
		name = newName;
		weight = 15.0;
	}
	
	public Cat() {
		weight = 15.0;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setWeight(double newWeight) {
		weight = newWeight;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void feed(double foodWeight) {
		weight = weight + foodWeight/10;
	}
}
