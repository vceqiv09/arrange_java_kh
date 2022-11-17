package scanner;

import java.util.Scanner;

public class ScannerExam04_Stock {

	public static void main(String[] agrs) {
		/*
		 * 사용자 입력을 활용하여 다음의 문제를 풀어보세요.
		 * 
		 * 현재 보유하고 있는 주식의 평단가 80000원, 보유 주식 수 10주,
		 * 현 주식 가격이 65000원일 때 10주를 더 구매했을 경우의 총 구매액,
		 * 총 보유 주식 수, 평단가, 수익률을 구하여 출력(수익률은 실수로)
		 * 
		 * 사용자 입력으로 현재 보유 주식의 평단가, 보유 주식 수, 현 주식 가격,
		 * 추가 구매 주식 수를 받아서 풀어보세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int avgPrice, holdStock, preStockPrice, addStock;
		
		System.out.print("평단가 : ");
		avgPrice = sc.nextInt();
		System.out.print("보유 주식 수 : ");
		holdStock = sc.nextInt();
		System.out.print("현 주식 가격 : ");
		preStockPrice = sc.nextInt();
		System.out.print("추가 구매 주식 수 : ");
		addStock = sc.nextInt();
		
		int sumPrice, totalStock;
		double rate;
		
		sumPrice = (avgPrice*holdStock) + (preStockPrice*addStock);
		totalStock = holdStock + addStock;
		
		avgPrice = sumPrice / totalStock;
		rate =((double)preStockPrice / avgPrice - 1) * 100;
		
		System.out.printf("총 구매액 : %d \n총 보유 주식 수 : %d \n평단가 : %d \n수익률 : %.2f",
						   sumPrice, totalStock, avgPrice, rate);
		
	}
	
}