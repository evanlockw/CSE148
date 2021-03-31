package p3;

public class Demo {

	public static void main(String[] args) {
		MallardDuck md1 = new MallardDuck("MD1", 3);
		MallardDuck md2 = new MallardDuck(md1); // deep copy
		
		MallardDuck md3 = md1; // shallow copy
		
//		System.out.println(md1);
//		System.out.println(md2);
		
		MallardDuck md4 = new MallardDuck("MD4", 5);
		md4.setMallardDuck(md1);
		
		System.out.println(md4);
	}

}
