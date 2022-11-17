package scanner;

import java.util.Scanner;

public class ScannerExam05_Leap {

	public static void main(String[] agrs) {
		/*
		 * 1. 년도 값을 입력 받아 해당 년도가 윤년인지 아닌지 구하세요.
		 * 	  윤년의 규칙은 다음과 같습니다.
		 * 		- 윤년은 4의 배수이면 윤년입니다.
		 * 		- 4의 배수이면서 100의 배수이면 윤년이 아닙니다.
		 * 		- 4, 100, 400의 배수에 해당하면 윤년입니다.
		 * 
		 * 	  예시
		 * 		년도 : 2022
		 * 		윤년이 아닙니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("년도를 입력하세요 : ");
			if(sc.hasNextInt()) {
				int year = sc.nextInt();
				if(year == 0) {
					System.out.println("프로그램을 종료합니다.");
					break;
				} else if((year%4 == 0) && (year%100 != 0) || year%400 == 0) {
					System.out.println(year +"년은 윤년 입니다.\n");
				} else {
					System.out.println(year +"년은 윤년이 아닙니다.\n");
				}
			} else {
				System.out.println("숫자를 입력해주세요.\n");
				sc.nextLine();
			}
		}
		
	}
	
}