package control;

import java.util.Scanner;

public class Control_if_Exam02 {

	public static void main(String[] args) {
		/*
		 * 사용자 입력과 if 문을 활용하여 사용자로 부터 정수값을 
		 * 입력 받았을 때 5의 배수 값만 출력하세 하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int inputNum = sc.nextInt();
		
		if(inputNum % 5 == 0) {
			System.out.println(inputNum);
		} else {
			System.out.println("5의 배수가 아닙니다.");
		}

	}

}