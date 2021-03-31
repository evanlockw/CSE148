package p1;

public abstract class Duck implements Comparable<Duck> {
	private String name;
	private int age;

	public Duck(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Duck() {
		
	}

	public abstract void display();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Duck [name=" + name + ", age=" + age + "]";
	}

	public int compareTo(Duck duck) {
		return this.age - duck.age;
	}
}
