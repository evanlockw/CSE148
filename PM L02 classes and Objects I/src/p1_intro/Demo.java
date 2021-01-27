package p1_intro;

public class Demo {

	public static void main(String[] args) {

		Person person1 = new Person("John", 32);
		System.out.println(person1);
//		person1.setFirstName("John");
//		person1.setAge(32);
//		
//		String firstName = person1.getFirstName();
//		int age = person1.getAge();
//		
//		System.out.println(firstName + ": " + age);
		
		Person person2 = new Person("Jane", 42);
		System.out.println(person2);
//		person2.setFirstName("Jane");
//		person2.setAge(42);
//		
//		firstName = person2.getFirstName();
//		age = person2.getAge();
		
//		System.out.println(firstName + ": " + age);
		
		
		Person person3 = new Person("Joey", 55);
		System.out.println(person3);
//		firstName = person3.getFirstName();
//		age = person3.getAge();
//		System.out.println(firstName + ": " + age);
//		
		Person person4 = new Person("Suzie");
		System.out.println(person4);
//		firstName = person4.getFirstName();
//		age = person4.getAge();
//		System.out.println(firstName + ": " + age);
		
		Person person5 = new Person();
		System.out.println(person5);
//		firstName = person5.getFirstName();
//		age = person5.getAge();
//		System.out.println(firstName + ": " + age);
		
	}

}
