package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam01_Today {
	
	public static void main(String[] args) {
		/*
		 * 1. 현재 날짜를 구하고 다음 형식에 맞추어 출력하세요.
		 * 		1. 2022/01/01
		 * 		2. 2022년 01월 01일
		 * 		3. 12시 30분 30초
		 * 		4. 12:30:30
		 */

		// 1. 
		SimpleDateFormat df1 = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat df2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat df3 = new SimpleDateFormat("HH시 mm분 ss초");
		SimpleDateFormat df4 = new SimpleDateFormat("HH:mm:ss");
		
		System.out.println(df1.format(new Date()));
		System.out.println(df2.format(new Date()));
		System.out.println(df3.format(new Date()));
		System.out.println(df4.format(new Date()));
		System.out.println();
		
	}
	
}