package p1_course;

public class CourseBag {
	private Course[] courseArr;
	private int nElems;
	
	public CourseBag(int maxSize) {
		courseArr = new Course[maxSize];
	}
	
	public void insert(Course course) {
		courseArr[nElems++] = course;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(courseArr[i]);
		}
		System.out.println();
	}
	
	public Course searchByCourseNumber(String courseNumber) {
		for(int i = 0; i < nElems; i++) {
			if(courseArr[i].getNumber().equals(courseNumber)) {
				return courseArr[i];
			}
		}
		return null;
	}
	
	public Course removeByCourseNumber(String courseNumber) {
		int i;
		for(i = 0; i < nElems; i++) {
			if(courseArr[i].getNumber().equals(courseNumber)) {
				break;
			}
		}
		
		if (i == nElems) {
			return null;
		} else {
			Course temp = courseArr[i];
			for(int j = i; j < nElems-1; j++) {
				courseArr[j] = courseArr[j+1];
			}
			nElems--;
			return temp;
		}
		
		
	}
}
