package p3;

import p1.Duck;

public class MallardDuck extends Duck {

	public MallardDuck(String name, int age) {
		super(name, age);
	}

//	public MallardDuck(MallardDuck mallardDuck) {
//		super(mallardDuck.getName(), mallardDuck.getAge());
//	}

	public MallardDuck(MallardDuck mallardDuck) {
		super();
		setName(mallardDuck.getName());
		setAge(mallardDuck.getAge());
	}
	
	public void setMallardDuck(MallardDuck mallardDuck) {
		setName(mallardDuck.getName());
		setAge(mallardDuck.getAge());
	}

	@Override
	public void display() {
		System.out.println("Mallard Duck...");
	}

}
