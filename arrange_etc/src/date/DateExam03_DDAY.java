package date;

import java.util.Date;
import java.util.Scanner;

public class DateExam03_DDAY {
	
	public static void main(String[] args) {
		/*
		 * 3. 자신의 생년월일을 입력하면 생일이 현재로부터 몇 일 남았는지 알려주는 
		 * 	  D-DAY 정보를 출력하세요.
		 */

		// 3.
		Scanner sc = new Scanner(System.in);
		Date date = new Date();
		int lastDayForMonth[] = {
				31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
		};
		
		System.out.print("생일을 입력하시오(MM/DD) : ");
		String birthday = sc.nextLine();
		String birthArr[] = birthday.split("/");
		
		String month = String.format("%tm", date);
		String day = String.format("%td", date);
		String today = String.format("%tm/%td", date, date);
		
		int birthdayMonth = Integer.parseInt(birthArr[0]);
		int birthdayDay = Integer.parseInt(birthArr[1]);
		int todayMonth = Integer.parseInt(month);
		int todayDay = Integer.parseInt(day);
		int dDay = 0;
		
		System.out.println("오늘 "+ todayMonth +"/"+ todayDay);
		System.out.println("생일 "+ birthdayMonth +"/"+ birthdayDay);
		
		if((todayMonth > birthdayMonth) || ((todayMonth == birthdayMonth) &&
				(todayDay > birthdayDay))) {
			dDay += lastDayForMonth[todayMonth-1] - todayDay;
			dDay += birthdayDay;
			
			// 1월부터 남은 달
			for(int i=1; i<birthdayMonth; i++) {
				dDay += lastDayForMonth[i-1];
			}
			// 오늘 부터 남은 달 11, 12
			for(int i=todayMonth+1; i<=12; i++) {
				dDay += lastDayForMonth[i-1];
			}
			System.out.println("생일이 지났습니다.");
			System.out.println("내년 생일 까지는 "+ dDay +"일 남았습니다.");
		} else if (birthday.equals(today)) {
			System.out.println("생일 축하합니다!!!");
		} else {
			dDay += lastDayForMonth[todayMonth-1] - todayDay;
			dDay += birthdayDay;
			for(int i=todayMonth+1; i<birthdayMonth; i++) {
				dDay += lastDayForMonth[i-1];
			}
			System.out.println("생일까지 "+ dDay +"일 남았습니다.");
		}
		
		System.out.println(dDay);
		
	}
	
}