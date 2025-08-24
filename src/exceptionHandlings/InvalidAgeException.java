package exceptionHandlings;

public class InvalidAgeException extends RuntimeException{
	public InvalidAgeException() {
		super("Invalid age...Please visit this website once your age is 18...");
	}
}
