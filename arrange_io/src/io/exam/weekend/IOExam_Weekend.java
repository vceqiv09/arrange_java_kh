package io.exam.weekend;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class IOExam_Weekend extends FileIO{
	
	public static void main(String[] args) {
		/*
		 * weekend.txt 파일에 작성된 년월 정보를 읽고 해당 년월의
		 * 주말정보만을 weekend.result 파일에 출력하게 한다.
		 * 
		 * 1. weekend.txt 에서 202201과 같은 년월 정보를 읽기
		 * 2. 직접 입력한 후 weekend에 저장. 그 후에 다시 가져와서 주말 정보만 weekend.result에 저장
		 */
		
		File f1 = new File("D:\\Java\\file\\weekend.txt"); 
		File f2 = new File("D:\\Java\\file\\weekend.result.txt");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("년과 월을 입력(YYYYMM) : ");
		
		String inputDate = sc.nextLine();
		saveData(f1, inputDate);
		sc.close();
		
		String date = getYearMonth(f1);
		
		if(!(date.length() == 0)) {
			System.out.println("파일의 데이터를 성공적으로 가져왔습니다.");
		} else {
			System.out.println("파일에 데이터가 없습니다. 확인해주세요.");
			System.exit(0);
		}
		
		int year = Integer.parseInt(date.substring(0, 4));
		int month = Integer.parseInt(date.substring(4));
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd EEEE");
		GregorianCalendar gc = new GregorianCalendar(year, month-1, 1);
		int lastDay = gc.getMaximum(Calendar.DAY_OF_MONTH);

		StringBuilder sb = new StringBuilder(128);
		for(int i=1; i<=lastDay; i++) {
			switch(gc.get(Calendar.DAY_OF_WEEK)) {
			case Calendar.SATURDAY:
			case Calendar.SUNDAY:
				sb.append(df.format(gc.getTime()) +"\n");
			}
			gc.add(Calendar.DATE, 1);
		}
		
		saveData(f2, sb.toString());
		System.out.println("파일에 데이터를 성공적으로 입력했습니다.");
	}

}