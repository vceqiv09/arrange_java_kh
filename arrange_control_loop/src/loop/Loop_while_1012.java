package loop;

public class Loop_while_1012 {

	public static void main(String[] args) {
		// while문
		int i =0;
		while(i < 5) {
			System.out.println(i);
			i++;
		}
		
		// 무한 반복
		while(true) {
			System.out.println("무한 반복");
			break;
		}
		
		/*
		 * do-whlie문
		 * 		일단 1회 무조건 반복을 수행 후 조건식의 결과에 따라 참이면
		 * 		반복 진행, 거짓이면 반복 중단.
		 * 
		 * do{
		 * 		실행 코드;
		 * } whlie(조건식);
		 */
		do {
			System.out.println("조건식의 결과가 거짓이여도 일단 무조건 1회를 실행됨.");
		} while(false);
		
	}

}