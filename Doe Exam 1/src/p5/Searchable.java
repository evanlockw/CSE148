package p5;

import java.util.function.Predicate;

import p1.Animal;

public interface Searchable {
	Animal[] search(Predicate<Animal> predicate);
}
