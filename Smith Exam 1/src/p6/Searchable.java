package p6;

import java.util.function.Predicate;

import p1.Duck;

public interface Searchable {
	Duck[] search(Predicate<Duck> predicate);
}
