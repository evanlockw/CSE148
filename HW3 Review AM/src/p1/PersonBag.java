package p1;

import java.util.function.Predicate;

public class PersonBag {
	private Person[] personArr;
	private int nElems;
	
	public PersonBag(int maxSize) {
		personArr = new Person[maxSize];
	}
	
	public Person searchById(String id) {
		for(int i = 0; i < nElems; i++) {
			if(personArr[i].getId().equals(id)) {
				return personArr[i];
			}
		}
		return null;
	}
	
	public Person removeById(String id) {
		int i;
		for(i = 0; i < nElems; i++) {
			if(personArr[i].getId().equals(id)) {
				break;
			}
		}
		
		if(i == nElems) {
			return null;
		} else {
			Person temp = personArr[i];
			for(int j = i; j < nElems-1; j++) {
				personArr[j] = personArr[j+1];
			}
			nElems--;
			return temp;
		}
	}
	
	public void insert(Person person) {
		personArr[nElems++] = person;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(personArr[i]);
		}
		System.out.println();
	}
	
	public Person find(Predicate<Person> predicate) {
		for(int i = 0; i < nElems; i++) {
			if(predicate.test(personArr[i])) {
				return personArr[i];
			}
		} 
		return null;
	}
}
