package p1_predicate;

import java.util.function.Predicate;

public class Student {
	private String name;
	private double gpa;
	private Predicate predicate;

	public Student(String name, double gpa, Predicate <Student> predicate) {
		super();
		this.name = name;
		this.gpa = gpa;
		this.predicate = predicate;
	}
	
	public boolean isOnDeansList() {
		if(predicate.test(this)) {
			return true;
		} else {
			return false;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}

}
