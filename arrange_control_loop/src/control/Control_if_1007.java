package control;

import java.util.Scanner;

public class Control_if_1007 {

	public static void main(String[] args) {
		/*
		 * if 조건문
		 * if문
		 * if-else
		 * if-else if-else
		 * 중첩 if문
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int x1 = sc.nextInt();		
		
		if(x1 % 2 == 1) {
			System.out.println("x1은 홀수이다.");
		} else {
			System.out.println("x1은 짝수이다.");
		}

		if(x1 < 10) {
			System.out.println("x1은 10보다 작다.");
		} else if(x1 < 20) {
			System.out.println("x1은 10 이상 20 미만");
		} else if(x1 < 30) {
			System.out.println("x1은 20 이상 30 미만");
		} else if(x1 < 40) {
			System.out.println("x1은 30 이상 40 미만");
		} else {
			System.out.println("x1은 40이상");
		}
		
		if(x1 < 10) {
			if(x1 % 2 == 0) {
				System.out.println("x1은 10보다 작은 짝수");
			} else {
				System.out.println("x1은 10보다 작은 홀수");
			}
		} else {
			if(x1 % 2 == 0) {
				System.out.println("x1은 10보다 큰 짝수");
			} else {
				System.out.println("x1은 10보다 큰 홀수");
			}
		}
		
	}

}