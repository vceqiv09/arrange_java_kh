package control_loop;

public class Control_Loop_Exam04 {

	public static void main(String[] args) {
		/*
		 * 1 부터 시작하여 31까지 출력하기 위한 출력 구문을 만든다.
		 * 단, 달력 처럼 1 줄에 7개의 값이 출력되어야 한다.
		 * (반드시 중첩 for문을 사용할 필요는 없음)
		 */
		
		for(int i=1; i<=31; i++) {
			System.out.print(i +"\t");
			if(i%7 == 0)
				System.out.println();
		}
	
	}
	
}