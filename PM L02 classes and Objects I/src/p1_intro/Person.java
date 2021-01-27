package p1_intro;

public class Person {
	// instance variables holding values for a person
	// used to store data
	private String firstName;
	private int age;
	
	// methods: define behavior of an object
	// specify what actions the object can perform
	
	// constructor method: used to create an object with initial values
	public Person(String newFirstName, int newAge) {
		firstName = newFirstName;
		age = newAge;
	}
	
	public Person (String newFirstName) {
		firstName = newFirstName;
	}
	
	public Person() {
		
	}
	
	// When we have multiple methods with the same name but 
	// different parameters, we call them overloaded methods
	
	public void setFirstName(String newFirstName) { // setter, mutator
		firstName = newFirstName;
	}
	
	public String getFirstName() { // getter, accessor
		return firstName;
	}
	
	public void setAge(int newAge) { // setter, mutator
		age = newAge;
	}
	
	public int getAge() {  // getter, accessor
		return age;
	}
	
	// toString method
	public String toString() {
		return "First Name: " + firstName + "\t\t\t" + "Age: " + age; 
	}

}
