package control;

import java.util.Scanner;

public class Control_if_Exam01 {

	public static void main(String[] args) {
		/*
		 * 사용자 입력과 if 문을 활용하여 사용자로 부터 정수값을 
		 * 입력 받았을 때 1 ~ 45사이의 값만 출력하게 하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int inputNum = sc.nextInt();
		
		if(inputNum >=1 && inputNum <= 45) {
			System.out.println(inputNum);
		} else {
			System.out.println("1 ~ 45 사이의 값이 아닙니다.");
		}

	}

}