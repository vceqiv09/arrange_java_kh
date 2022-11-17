package exception.exam.school.exception;

public class NegativeNumberException extends RuntimeException {

	public NegativeNumberException() {
		super("음수를 사용할 수 없습니다.");
	}
	
	public NegativeNumberException(String message) {
		super(message);
	}
}