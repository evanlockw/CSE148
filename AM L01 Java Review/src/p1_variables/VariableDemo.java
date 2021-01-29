package p1_variables;

public class VariableDemo {

	public static void main(String[] args) {
		int number = 5;  // 4 bytes
//		short number3 = 15; // 2 bytes
//		int number = 5;//10101010101010101011110000101110011000011
//		long number2 = 10; // 8 bytes
//		number = 10;
		double n = 23.67; // 8 bytes
		boolean b = true;  // 1 byte
		float f = 3.4f;   // 4 bytes
		char c = 'A';  //2 bytes
		
		// primitive variables
		
		// reference variables
		String name = "Joe"; // 8 bytes == the size of a memory address
		Integer integer1 = 6;
		// reference variables
		System.out.println(number);
		
		double taxRate = 0.08625;
		final double TAX_RATE = 0.0825;
		
	}

}
