package scanner;

import java.util.Scanner;

public class ScannerExam03_Account {

	public static void main(String[] args) {
		/*
		 * 사용자 입력을 활용하여 다음의 문제를 풀어보세요.
		 * 
		 * 카카오의 더치페이 기능을 모방하여 다음의 출력 결과가 나오도록
		 * 
		 * 출력 형식
		 * 	총 비용 50000원을 5명이 더치페이 하여 10000원 씩
		 *  다음의 계좌로 입금해 주세요.
		 *  입금 계좌 번호 : 1234-56-789-123456789
		 *  나머지 금액 0원은 제가 부담합니다.
		 *  
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int totalCost, person, perCost, reCost;
		String account;
		
		System.out.print("총 비용 : ");
		totalCost = sc.nextInt();
		System.out.print("몇 명? : ");
		person = sc.nextInt();			sc.nextLine();
		System.out.print("계좌 : ");
		account = sc.nextLine();
		
		perCost = totalCost / person;
		reCost = totalCost % person;
		
		System.out.printf("총 비용 %d원을 %d명이 더치페이 하여 %d원 씩\n", totalCost, person, perCost);
		System.out.println("다음 계좌로 넣어주세요. "+ account);
		System.out.println("나머지 금액 "+ reCost +"은 제가 부담합니다.");

	}

}