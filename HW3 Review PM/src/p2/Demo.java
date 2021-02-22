package p2;

public class Demo {

	public static void main(String[] args) {
		StudentBag theBag = StudentBagHelper.fillTheBag(1000, 2);
		theBag.insert(StudentHelper.getRandomStudent());
		theBag.display();
		
	}

}
