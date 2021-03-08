package p7_lambda_expression;

public interface Calculator {
	double calculate(double n1, double n2);
	
	default void greetings() {
		System.out.println("Hi");
	}
//	double compute(double n1, double n2);
}
