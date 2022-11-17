package control_loop;

import java.util.Scanner;

public class Control_Loop_Exam06 {

	public static void main(String[] args) {
		/*
		 * 사용자 입력으로 월, 시작 요일, 마지막 일자 정보를 입력 받아
		 * 다음 예시와 같이 출력.
		 * 예시
		 * 		월 : 10
		 * 		시작 요일 : 토
		 * 		마지막 일자 : 31
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int month, lastDay, enter = 0, tab = 0;
		char firstDate;
		
		System.out.print("월 : ");
		month = sc.nextInt();		sc.nextLine();
		
		System.out.print("시작 요일 : ");
		firstDate = sc.nextLine().charAt(0);
		
		System.out.print("마지막 일자 : ");
		lastDay = sc.nextInt();

		System.out.println("일\t월\t화\t수\t목\t금\t토");
		switch(firstDate) {
		case '일':
			enter = 0;	tab = 0;
			break;
		case '월':
			enter = 6;	tab = 1;
			break;
		case '화':
			enter = 5;	tab = 2;
			break;
		case '수':
			enter = 4;	tab = 3;
			break;
		case '목':
			enter = 3;	tab = 4;
			break;
		case '금':
			enter = 2;	tab = 5;
			break;
		case '토':
			enter = 1;	tab = 6;
			break;
		}
		
		for(int i=0; i<tab; i++) {
			System.out.print("\t");
		}
		for(int day=1; day<=lastDay; day++) {
			System.out.print(day +"\t");
			if(day%7 == enter) {
				System.out.println();
			}
		}
	
	}
	
}