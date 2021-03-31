package p2;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentBag {
	private ArrayList<Student> list;
	
	public StudentBag(int maxSize) {
		list = new ArrayList<Student>(maxSize);
	}
	
	public void insert(Student student) {
		list.add(student);
	}
	
	public void display() {
		System.out.println(list);
	}
	
	public boolean search(Student student) {
		return list.contains(student);
	}
	
	public ArrayList<Student> search(Predicate<Student> predicate) {
		ArrayList<Student> newList = new ArrayList<>();
		list.forEach(s -> {
			if(predicate.test(s)) {
				newList.add(s);
			}
		});
		
		newList.trimToSize();
		return newList;
	}
	
	

	public Student[] search2Array(Predicate<Student> predicate) {
		ArrayList<Student> newList = new ArrayList<>();
		list.forEach(s -> {
			if(predicate.test(s)) {
				newList.add(s);
			}
		});
		
		newList.trimToSize();
		return (Student[])(newList.toArray(new Student[newList.size()]));
	}
	
}
