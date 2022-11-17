package scanner;

import java.util.Scanner;

public class ScannerExam02_Hour {

	public static void main(String[] args) {
		/*
		 * 사용자 입력을 활용하여 다음의 문제를 풀어보세요.
		 * 
		 * 사용자 입력으로 시, 분, 초를 hour, minute, second 변수에
		 * 저장하고 초로 환산된 결과를 출력하세요.
		 * 
		 * ex)
		 * 		시 : 0
		 * 		분 : 10
		 * 		초 : 20
		 * 		총 620초 입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int hour, minute, second, total;
		
		System.out.print("시 : ");
		hour = sc.nextInt();
		System.out.print("분 : ");
		minute = sc.nextInt();
		System.out.print("초 : ");
		second = sc.nextInt();
		
		total = (hour*3600) + (minute*60) + second;
		
		System.out.print("총 : "+ total);

	}

}