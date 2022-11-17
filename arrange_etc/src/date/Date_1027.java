package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Date_1027 {
	
	public static void main(String[] args) throws ParseException {
		/*
		 * 날짜 관련 클래스
		 * 		- Date : 시스템으로 부터 현재 날짜, 시간 정보를 가져와서 사용할 수 있게 만들어진 클래스
		 * 
		 * 		- GregorianCalendar : Calendar 클래스를 상속하여 작성된 하위 클래스로 년, 월, 일
		 * 							  시, 분, 초를 다룰 수 있게 구성된 클래스
		 * 
		 * 		- SimpleDateFormat : 날짜 및 시간 정보를 정해진 형식에 맞추어 문자열로 만들어주거나
		 * 							 문자열로 만들어진 날짜 및 시간 정보를 Date 객체로 만들어주는 클래스
		 */
		
		/*
		 * Date
		 */
		Date date = new Date();
		System.out.println(date);
		
		// getTime() : 1970년 1월 1일 0시 0분 0초 부터 시작된 현재까지의 밀리초
		long ms = date.getTime();
		System.out.println(ms);
		
		String year = String.format("%tY", date);
		String month = String.format("%tm", date);
		String day = String.format("%td", date);
		String sDay = String.format("%tA", date);
		System.out.println(year +"년 "+ month +"월 "+ day +"일 "+ sDay +"\n");
		
		/*
		 * GregorianCalendar
		 * 		- 월은 인덱스 값. 즉 0부터 시작
		 */
		GregorianCalendar gc = new GregorianCalendar();
		gc = new GregorianCalendar(2022, 12, 1, 12, 30, 30);
		
//		// 10월의 마지막 날 구하는 방법
//		gc = new GregorianCalendar(2022, 11, 0);
//		int lastDate = gc.get(Calendar.DATE);
		
//		int lastDate = gc.getMaximum(Calendar.DAY_OF_MONTH);

//		add() : date 를 1씩 늘려라. 줄여라도 가능.
//		gc.add(Calendar.DATE, 1);
		
		System.out.println(gc.getTime());
		
		int gcYear = gc.get(Calendar.YEAR);
		int gcMonth = gc.get(Calendar.MONTH) + 1;
		int gcDate = gc.get(Calendar.DATE);
		int gcDay = gc.get(Calendar.DAY_OF_WEEK);
		sDay = "";
		
		switch(gcDay) {
		case Calendar.SUNDAY:
			sDay = "일요일"; break;
		case Calendar.MONDAY:
			sDay = "월요일"; break;
		case Calendar.TUESDAY:
			sDay = "화요일"; break;
		case Calendar.WEDNESDAY:
			sDay = "수요일"; break;
		case Calendar.THURSDAY:
			sDay = "목요일"; break;
		case Calendar.FRIDAY:
			sDay = "금요일"; break;
		case Calendar.SATURDAY:
			sDay = "토요일"; break;
		}
		
//		gc.get(Calendar.HOUR);
//		gc.get(Calendar.MINUTE);
//		gc.get(Calendar.SECOND);
//		gc.get(Calendar.MILLISECOND);
		
		System.out.println(gcYear +"년 "+ gcMonth +"월 "+ gcDate +"일 "+ sDay);
		
		/*
		 * SimpleDateFormat
		 */
		SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String fDate = df.format(new Date());
		System.out.println(fDate +"\n");

		String strDate = "2022년 10월 25일 12시 30분 30초";
		date = df.parse(strDate);
		System.out.println(date);
		
	}
	
}	