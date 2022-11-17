package exception;

public class TryCatch_1028 {
	
	public static void main(String[] args) {
		/*
		 * try-catch 문
		 */
		
		int arr[];
		
		try {
			arr = new int[-1];
			arr[0] = 10;
			arr[1] = 20;
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("무슨 에러인지는 모르겠지만 처리는 함");
		}
		
		System.out.println("정상 종료!!!");
		
	}
	
}	