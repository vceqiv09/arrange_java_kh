package date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateExam03_DDAY_teach {

	public static void main(String[] args) {
		/*
		 * 자신의 생년월일을 입력하면 생일이 현재로 부터 몇 일 남았는지 알려주는
		 * D-DAY 정보를 출력하세요.
		 */
		
		String birthDay = "19901112";
		
		GregorianCalendar now = new GregorianCalendar();
		int nowYear = now.get(Calendar.YEAR);
		int nowMonth = now.get(Calendar.MONTH) + 1;
		int nowDate = now.get(Calendar.DATE);
		
		int year = Integer.parseInt(birthDay.substring(0, 4));
		int month = Integer.parseInt(birthDay.substring(4, 6));
		int date = Integer.parseInt(birthDay.substring(6));
		
		int birthMonthDate = month * 100 + date;
		int nowMonthDate = nowMonth * 100 + nowDate;
		
		GregorianCalendar nextBirthDay = new GregorianCalendar(nowYear, month - 1, date);
		
		if(nowMonthDate > birthMonthDate) {
			if(nowMonthDate == birthMonthDate) {
				System.out.println("D-DAY : 0");
				System.out.println("오늘이 생일이네요. 축하합니다.");
			} else {
				System.out.println("생일이 지났습니다.");
			}
			nextBirthDay.add(Calendar.YEAR, 1);
		} else {
			System.out.println("생일이 아직 지나지 않았습니다.");
		}
		System.out.printf("다음 생일은 -> %1$tY년 %1$tm월 %1$td일 입니다.\n", nextBirthDay.getTime());
		
		int dDay = 0;
		while(true) {
			now.add(Calendar.DATE, 1);
			dDay += 1;
			if(now.get(Calendar.YEAR) == nextBirthDay.get(Calendar.YEAR)
					&& now.get(Calendar.MONTH) == nextBirthDay.get(Calendar.MONTH)
					&& now.get(Calendar.DATE) == nextBirthDay.get(Calendar.DATE)) {
				break;
			}
		}
		
		System.out.println("D-DAY : " + dDay + "일 남았습니다.");
		
		
		/*
		 * 1. 현재 달의 남은 일수를 구한다.
		 *     gc.getActualMaximum(Calendar.DATE_OF_MONTH) - 현재일자
		 * 2. 다음 달부터 생일 전달 까지 모든 월의 일수를 누적하여 구한다.
		 *     gc.getActualMaximum(Calendar.DATE_OF_MONTH)
		 * 3. 생일 달의 일자를 구한다.
		 *     birthDate
		 */
		
	}

}
