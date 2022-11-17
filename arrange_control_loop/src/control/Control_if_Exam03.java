package control;

import java.util.Scanner;

public class Control_if_Exam03 {

	public static void main(String[] args) {
		/*
		 * 사용자 입력과 if 문을 활용하여 사용자로 부터 
		 * 정수값 2개를 입력 받았을 때 정수값 0이 있는 경우 나누기 계산에서
		 * 0으로 나누었을 때 발생하는 오류가 나지 않게 처리하세요.
		 */
		
		Scanner sc = new Scanner(System.in);

		int firstNum, secondNum;
		
		System.out.print("첫번째 정수 입력 : ");
		firstNum = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		secondNum = sc.nextInt();
		
		if(firstNum == 0 || secondNum == 0) {
			System.out.println("입력한 두 정수 중 0이 있어 나눌 수 없습니다.");
		} else {
			System.out.println(firstNum / secondNum);
		}

	}

}