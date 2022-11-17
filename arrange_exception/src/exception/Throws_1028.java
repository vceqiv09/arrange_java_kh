package exception;

public class Throws_1028 {

	/*
	 * throws
	 */

	public static void methodA() throws NegativeArraySizeException {
		methodB();
	}

	public static void methodB() throws NegativeArraySizeException {
		methodC();
	}

	public static void methodC() throws NegativeArraySizeException {
		int arr[] = new int[-1];
	}

	public static void main(String[] args) {
		try {
			methodA(); // 원래 정석적으로는 Demo.methodA 이지만 어차피 main 메서드가 Demo 클래스 안에 있기 때문에 생략 가능.
		} catch (NegativeArraySizeException e) {
			e.printStackTrace();
			System.out.println("methodB 에서 에러 처리함.");
		}

	}

}