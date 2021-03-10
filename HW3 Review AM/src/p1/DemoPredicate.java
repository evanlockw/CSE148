package p1;

public class DemoPredicate {

	public static void main(String[] args) {
		PersonBag theBag = new PersonBag(5);
		theBag.insert(new Person("A", "A"));
		theBag.insert(new Person("D", "D"));
		theBag.insert(new Person("B", "B"));
		theBag.insert(new Person("C", "C"));

		System.out.println(theBag.find(p -> {
			return p.getName().getLastName().equals("A");
		}));
		
		System.out.println(theBag.find(p -> 
			p.getName().getLastName().equals("B")
		));
	}

}
