package control_loop;

import java.util.Scanner;

public class Control_Loop_Exam03 {

	public static void main(String[] args) {
		/* 
		 * 사용자 입력과 if, for를 활용하여 사용자로부터 정수값을 입력
		 * 받았을 때 1~45 사이의 값이 아니면 다시 입력을 받아
		 * 1~45 사이의 값이 저장될 수 있게 한다.
		 * (단, 3번의 입력 기회만 부여하고 3번의 기회를 넘기면 0 값이
		 * 저장되게 한다.)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {		
			System.out.print("1 ~ 45 사이의 정수 입력 : ");
			int inputNum = sc.nextInt();
			
			if(inputNum >= 1 && inputNum <= 45) {
				System.out.println(inputNum);
				break;
			} else {
				if(i == 2) {
					System.out.println("3번의 기회가 모두 끝났습니다.");
					break;
				}
				System.out.println("다시 입력해주세요. "+ (2-i) +"번의 기회가 남았습니다.\n");
			}
		}
	
	}
	
}