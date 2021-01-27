package p1_intro;

public class DogDemo {

	public static void main(String[] args) {
		Dog d1 = new Dog("Doggie", 10.5);
		Dog d2 = new Dog("Doggie2");
		System.out.println(d1);
		System.out.println(d2);
		d2.setWeight(100);
		System.out.println(d2);
		d1.setName("Doggie3");
		System.out.println(d1);
		System.out.println(d1.getName());
		System.out.println(d1.getName() + ", " + d2.getName());
		System.out.println((d1.getWeight() + d2.getWeight())/2);
		
		if(d1.getWeight() > d2.getWeight()) {
			System.out.println(d1.getName() + " is heavier!");
		} else if (d1.getWeight() == d2.getWeight()){
			System.out.println("Both dogs weigh the same");
		} else {
			System.out.println(d2.getName() + " is heavier!");
		}
		
		System.out.printf("%-10s%10s%n", "NAME", "WEIGHT");
		System.out.printf("%20s%n", "--------------------");
		System.out.printf("%-10s%10.1f%n", d1.getName(), d1.getWeight());
		System.out.printf("%-10s%10.1f%n", d2.getName(), d2.getWeight());
	}

}
