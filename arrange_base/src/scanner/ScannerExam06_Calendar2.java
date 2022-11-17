package scanner;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ScannerExam06_Calendar2 {

	public static void main(String[] agrs) {
		/*
//		 * 2. 년도와 1월 1일의 요일을 적으면 달력 완성
		 * 		보고 싶은 월 입력하면 그 달만 출력
		 * 
		 *  예시
		 * 		년도 : 2022
		 * 		보고 싶은 달 : 10
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도 : ");
		int year = sc.nextInt();
		System.out.print("보고 싶은 달 : ");
		int month = sc.nextInt();

		System.out.println("\n"+ month +"월");
		System.out.print("일\t월\t화\t수\t목\t금\t토\n");
		
		GregorianCalendar gc = new GregorianCalendar(year, (month-1), 1);
		int lastDay = gc.getActualMaximum(Calendar.DAY_OF_MONTH);
		int firstDate = gc.get(Calendar.DAY_OF_WEEK);
		
		GetCalendar2 cal = new GetCalendar2();
		cal.setFirstDate(firstDate, lastDay);
		cal.getTabNewLine();
		cal.print();
		
	}

}