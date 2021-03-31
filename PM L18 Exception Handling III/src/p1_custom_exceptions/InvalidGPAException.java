package p1_custom_exceptions;

public class InvalidGPAException extends Exception {
	
	public InvalidGPAException(String message) {
		super(message);
	}
}
