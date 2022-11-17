package loop;

public class Loop_Exam01 {

	public static void main(String[] args) {
		/*
		 * 1부터 시작하여 10까지 총 10번 반복하는 반복문을 작성.
		 * 
		 * 출력 형식
		 * 	총 10번 반복중 n번 반복	(n이 1~1-까지 1씩 증가되어서 출력)
		 * 
		 */
		
		for(int i=1; i<11; i++) {
			System.out.println("총 10번 반복중 " +i+ "번 반복");
		}
		
		int i = 1;
		while(i < 11) {
			System.out.println("총 10번 반복중 " +i+ "번 반복");
			i++;
		}
	}
	
}