package control;

import java.util.Scanner;

public class Control_if_Exam04 {

	public static void main(String[] args) {
		/*
		 * 사용자 입력과 if 문을 활용하여 사용자로 부터 키(m)와
		 * 체중(kg) 값을 입력 받아 BMI 를 구하여 결과값을 출력할 때
		 * 25 이상의 결과인 경우 "비만입니다." 라는 메시지가 출력. 
		 */
		
		Scanner sc = new Scanner(System.in);

		double height, weight, BMI;
		
		System.out.print("키(m) : ");
		height = sc.nextDouble();
		System.out.print("몸무게(kg) : ");
		weight = sc.nextDouble();
		
		BMI = weight / (height*height);
		if(BMI >= 25) {
			System.out.println("비만입니다.");
		} else {
			System.out.printf("%.2f", BMI);
		}

	}

}