package p3_hw5_5;

public class CoursesTakenBag {
	private CourseTaken[] coursesTaken;
	private int nElems;
	
	public CoursesTakenBag(int maxSize) {
		coursesTaken = new CourseTaken[maxSize];
	}
	
	public void insert(CourseTaken courseTaken) {
		coursesTaken[nElems++] = courseTaken;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(coursesTaken[i]);
		}
	}
	
	public double getGpa() {
		double totalPoints = 0;
		double totalCredits = 0;
		for(int i = 0; i < nElems; i++) {
			totalPoints +=  (coursesTaken[i].getGradePoint() * coursesTaken[i].getNumberOfCredits());
			totalCredits +=  coursesTaken[i].getNumberOfCredits();
		}
		
		return totalPoints / totalCredits;
	}
}
