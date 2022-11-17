package scanner;

import java.util.Scanner;

public class ScannerExam06_Calendar {

	public static void main(String[] agrs) {
		/*
//		 * 2. 년도와 1월 1일의 요일을 적으면 달력 완성
		 * 		보고 싶은 월 입력하면 그 달만 출력
		 * 
		 *  예시
		 * 		년도 : 2022
		 * 		1월 1일 요일 : 토
		 * 		보고 싶은 달 : 10
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도 : ");
		int year = sc.nextInt();	sc.nextLine();
		System.out.print("1월 1일 요일 : ");
		char JanDate = sc.nextLine().charAt(0);
		System.out.print("보고 싶은 달 : ");
		int month = sc.nextInt();

		System.out.println(month +"월");
		System.out.print("일\t월\t화\t수\t목\t금\t토\n");
		
		int tab = 0, nextLine = 0;
		
		// 시작 요일에 따른 들여쓰기와 개행 설정
		GetCalendar c = new GetCalendar(year, JanDate, month);
		switch(c.getFirstDate(month)) {
		case '일':
			tab = 0; nextLine = 0; break;
		case '월':
			tab = 1; nextLine = 6; break;
		case '화':
			tab = 2; nextLine = 5; break;
		case '수':
			tab = 3; nextLine = 4; break;
		case '목':
			tab = 4; nextLine = 3; break;
		case '금':
			tab = 5; nextLine = 2; break;
		case '토':
			tab = 6; nextLine = 1;break;
		}
		
		// 들여쓰기(tab)
		for(int i=0; i<tab; i++) {
			System.out.print("\t");
		}
		
		// 출력
		for(int i=1; i<=c.getLastDay(); i++) {
			System.out.print(i +"\t");
			if(i % 7 == nextLine) {
				System.out.println();
			}
		}
		
	}
	
}