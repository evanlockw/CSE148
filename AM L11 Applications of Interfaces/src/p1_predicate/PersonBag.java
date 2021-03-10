package p1_predicate;

import java.util.Arrays;
import java.util.function.Predicate;

public class PersonBag {
	private Person[] arr;
	private int nElems;
	
	public PersonBag(int maxSize) {
		arr = new Person[maxSize];
		nElems = 0;
	}
	
	public void insert(Person person) {
		arr[nElems++] = person;
	}
	
	public Person searchById(int id) {
		for(int i  =0; i < nElems; i++) {
			if(arr[i].getId() == id) {
				return arr[i];
			}
		}
		return null;
	}
	
	public Person[] search(Predicate<Person> predicate) { // pass a functional interface as data
		Person[] tempArr = new Person[nElems];
		int count = 0;
		for(int i = 0; i < nElems; i++) {
			if(predicate.test(arr[i])) {
				tempArr[count++] = arr[i];
			}
		}
		
		return Arrays.copyOf(tempArr, count);
	}
	
	public Person[] searchByName(String name) {
		Person[] tempArr = new Person[nElems];
		int count = 0;
		for(int i = 0; i < nElems; i++) {
			if(arr[i].getName().equals(name)) {
				tempArr[count++] = arr[i];
			}
		}
		
		return Arrays.copyOf(tempArr, count);
	}
	
	
	
}
