package p2;

public class StudentBag {
	private Student[] studentArr;
	private int nElems;
	
	public StudentBag(int maxSize) {
		studentArr = new Student[maxSize];
	}
	
	public void insert(Student student) {
		studentArr[nElems++] = student;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(studentArr[i]);
		}
		System.out.println();
	}
	
	
}
