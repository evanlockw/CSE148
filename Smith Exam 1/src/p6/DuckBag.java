package p6;

import java.util.Arrays;
import java.util.function.Predicate;

import p1.Duck;

public class DuckBag implements Searchable {
	private Duck[] arr;
	private int nElems;
	
	public DuckBag(int maxSize) {
		arr = new Duck[maxSize];
	}
	
	public void insert(Duck duck) {
		arr[nElems++] = duck;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public Duck[] sortByAge() {
		Duck[] sortedArr = new Duck[nElems];
		for(int i = 0; i < nElems; i++) {
			sortedArr[i] = arr[i];
		}
		
		Arrays.sort(sortedArr);
		return sortedArr;
	}
	
	public Duck[] removeByAge(int age) {
		Duck[] tempArr = new Duck[nElems];
		int count = 0;
		
		for(int i = 0; i < nElems; i++) {
			if(arr[i].getAge() == age) {
				tempArr[count++] = arr[i];
				for(int j = i; j< nElems-1; j++) {
					arr[j] = arr[j+1];
				}
				i--;
				nElems--;
			}
			
		}
		return Arrays.copyOf(tempArr, count);
	}
	
	public Duck[] searchByName(String name) {
		Duck[] tempArr = new Duck[nElems];
		int count = 0;
		for(int i = 0; i < nElems; i++) {
			if(arr[i].getName().equals(name)) {
				tempArr[count++] = arr[i];
			}
		}
		return Arrays.copyOf(tempArr, count);
	}

	@Override
	public Duck[] search(Predicate<Duck> predicate) {
		Duck[] tempArr = new Duck[nElems];
		int count = 0;
		
		for(int i = 0; i < nElems; i++) {
			if(predicate.test(arr[i])) {
				tempArr[count++] = arr[i];
			}
		}
		return Arrays.copyOf(tempArr, count);
	}
}
