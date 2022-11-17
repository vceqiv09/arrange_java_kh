package loop;

public class Loop_Exam02 {

	public static void main(String[] args) {
		/*
		 * 총 15번 반복하는 반복문을 사용하고 3부터 시작하여 45까지
		 * 3의 배수에 해당하는 값만 출력하는 코드를 작성.
		 */
		
		System.out.println("1 ~ 45 중 3의 배수");	
		
		for(int i=1; i<=15; i++) {
			System.out.print(i*3 + " ");
		}
		
		System.out.println();
		
		int i = 1;
		while(i <= 15) {
			System.out.print(i*3 + " ");
			i++;
		}
		
	}
	
}