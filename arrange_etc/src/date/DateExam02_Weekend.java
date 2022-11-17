package date;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateExam02_Weekend {
	
	public static void main(String[] args) {
		/*
		 * 2. 2022년 10월 중 주말에 해당하는 날짜만 문자열 배열에 담아 출력하세요.
		 */
		
		// 문자열 배열에 담기
		String dayArr[] = new String[0];
		for(int i=1; i<=31; i++) {
			GregorianCalendar gc1 = new GregorianCalendar(2022, 9, i);
			int gcDay = gc1.get(Calendar.DAY_OF_WEEK);
			if(gcDay == Calendar.SATURDAY || gcDay == Calendar.SUNDAY) {
				dayArr = Arrays.copyOf(dayArr, dayArr.length+1);
				dayArr[dayArr.length-1] = String.valueOf(i);
			}
		}
		System.out.println("10월\n"+ Arrays.toString(dayArr) +"\n");
		
		
		// Date 배열에 담기
		GregorianCalendar gc2 = new GregorianCalendar(2022, 9, 1);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd EEEE");
		int lastDate = gc2.getMaximum(Calendar.DAY_OF_MONTH);
		
		Date[] dateArr = new Date[0];
		String result = "";
		for(int i=1; i<=lastDate; i++) {
			int day = gc2.get(Calendar.DAY_OF_WEEK);
			
			if(day == Calendar.SATURDAY || day == Calendar.SUNDAY) {
				dateArr = Arrays.copyOf(dateArr, dateArr.length+1);
				dateArr[dateArr.length-1] = gc2.getTime();
				result += df.format(dateArr[dateArr.length-1]) +"\n";
			}
			gc2.add(Calendar.DATE, 1);
		}
		System.out.println(result);

	}
	
}