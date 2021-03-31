package p6;

import java.util.Arrays;
import java.util.function.Predicate;

import p1.Animal;

public class AnimalBag implements Searchable {
	private Animal[] arr;
	private int nElems;

	public AnimalBag(int maxSize) {
		arr = new Animal[maxSize];
	}

	public Animal[] searchByName(String name) {
		Animal[] tempArr = new Animal[nElems];
		int count = 0;

		for (int i = 0; i < nElems; i++) {
			if (arr[i].getName().equals(name)) {
				tempArr[count++] = arr[i];
			}
		}

		return Arrays.copyOf(tempArr, count);
	}

	public Animal[] searchByWeight(double weight) {
		Animal[] tempArr = new Animal[nElems];
		int count = 0;

		for (int i = 0; i < nElems; i++) {
			if (arr[i].getWeight() == weight) {
				tempArr[count++] = arr[i];
			}
		}

		return Arrays.copyOf(tempArr, count);
	}

	public Animal[] removeByName(String name) {
		Animal[] tempArr = new Animal[nElems];
		int count = 0;

		for (int i = 0; i < nElems; i++) {
			if (arr[i].getName().equals(name)) {
				tempArr[count++] = arr[i];
				for (int j = i; j < nElems - 1; j++) {
					arr[j] = arr[j + 1];
				}
				i--;
				nElems--;
			}
		}
		
		return Arrays.copyOf(tempArr, count);
	}
	
	public Animal[] removeByWeight(double weight) {
		Animal[] tempArr = new Animal[nElems];
		int count = 0;

		for (int i = 0; i < nElems; i++) {
			if (arr[i].getWeight() == weight) {
				tempArr[count++] = arr[i];
				for (int j = i; j < nElems - 1; j++) {
					arr[j] = arr[j + 1];
				}
				i--;
				nElems--;
			}
		}
		
		return Arrays.copyOf(tempArr, count);
	}

	public void insert(Animal animal) {
		arr[nElems++] = animal;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

	@Override
	public Animal[] search(Predicate<Animal> predicate) {
		Animal[] tempArr = new Animal[nElems];
		int count = 0;
		
		for(int i = 0; i < nElems; i++) {
			if(predicate.test(arr[i])) {
				tempArr[count++] = arr[i];
			}
		}
		return Arrays.copyOf(tempArr, count);
	}
}
