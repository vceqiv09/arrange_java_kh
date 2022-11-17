package control_loop;

import java.util.Scanner;

public class Control_Loop_Exam01 {

	public static void main(String[] args) {
		/*
		 * 사용자 입력을 활용하여 사용자가 입력한 정수값 만큼
		 * 반복을 수행하는 반복문 작성.
		 * (사용자 입력값이 0이하인 경우 1이상의 값을 입력하세요 라는
		 * 메시지 출력 후 종료)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int loopNum;
		System.out.print("반복 횟수 : ");
		loopNum = sc.nextInt();
	
		if(loopNum > 0) {
			for(int i=0; i<loopNum; i++) {
				System.out.println((i+1) +"번째 반복");
			}
		} else {
			System.out.println("1이상의 값을 입력하세요.");
		}
	
	}
	
}