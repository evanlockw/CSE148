package p2;

public class Demo {

	public static void main(String[] args) {
		StudentBag theBag = StudentBagHelper.fillTheBag(1000, 5);
		theBag.insert(StudentHelper.getRandomStudent());
		theBag.insert(StudentHelper.getRandomStudent());
		theBag.display();
		
	}

}
