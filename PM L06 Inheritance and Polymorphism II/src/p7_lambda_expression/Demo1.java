package p7_lambda_expression;

public class Demo1 {

	public static void main(String[] args) {
		Calculator add = (x, y) -> {
			return x + y;
		};
		
		Calculator subtract = (x, y) -> {
			return x - y;
		};
		
		Calculator multiply = (x, y) -> {
			return x * y;
		};
		
		Calculator divide = (x, y) -> {
			return x / y;
		};
		
		System.out.println("3 + 5 = " + add.calculate(3, 5));
		add.greetings();
		System.out.println("3 - 5 = " + subtract.calculate(3, 5));
		subtract.greetings();
		System.out.println("3 * 5 = " + multiply.calculate(3, 5));
		multiply.greetings();
		System.out.println("3 / 5 = " + divide.calculate(3, 5));
		divide.greetings();
	}

}
