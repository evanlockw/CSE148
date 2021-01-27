package p1_intro;

public class Dog {
	
	//instance variables
	private String name;
	private double weight;
	
	// methods
	// overloaded constructors
	public Dog(String newName, double newWeight) {
		name = newName;
		weight = newWeight;
	}
	
	public Dog(String newName) {
		name = newName;
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
	
	public String toString() {
		return "NAME: " + name + "\t" + "WEIGHT: " + weight;
	}
}
