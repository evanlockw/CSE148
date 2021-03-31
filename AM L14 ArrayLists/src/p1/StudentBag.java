package p1;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentBag {
	private ArrayList<Student> list;

	public StudentBag(int maxSize) {
		list = new ArrayList<>(maxSize);
	}

	public void add(Student student) {
		list.add(student);
	}

	public void display() {
		list.forEach(s -> {
			System.out.println(s);
		});
	}
	
	public ArrayList<Student> search(Predicate<Student> predicate) {
		ArrayList<Student> studentsFound = new ArrayList<>(list.size());
		list.forEach(s -> {
			if(predicate.test(s)) {
				studentsFound.add(s);
			}
		});
		studentsFound.trimToSize();
		return studentsFound;
	}
	
	public ArrayList<Student> remove(Predicate<Student> predicate) {
		ArrayList<Student> studentsRemoved = new ArrayList<>(list.size());
		list.forEach(s -> {
			if(predicate.test(s)) {
				studentsRemoved.add(s);
			}
		});
		list.removeAll(studentsRemoved);
		studentsRemoved.trimToSize();
		return studentsRemoved;
	}
	
	public int myIndexOf(Student s) {
		return list.indexOf(s);
	}

//	public ArrayList<Student> searchByName(String name) {
//		ArrayList<Student> studentsFound = new ArrayList<>(list.size());
//
//		list.forEach(s -> {
//			if (s.getName().equals(name)) {
//				studentsFound.add(s);
//			}
//		});
//		studentsFound.trimToSize();
//		return studentsFound;
//
//	}
//	
//	public ArrayList<Student> searchByGpa(double gpa) {
//		ArrayList<Student> studentsFound = new ArrayList<>(list.size());
//
//		list.forEach(s -> {
//			if (s.getGpa() == gpa) {
//				studentsFound.add(s);
//			}
//		});
//		studentsFound.trimToSize();
//		return studentsFound;
//
//	}

}
