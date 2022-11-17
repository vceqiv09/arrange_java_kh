package scanner;

import java.util.Scanner;

public class ScannerExam01_BMI {

	public static void main(String[] agrs) {
		/*
		 * 사용자 입력을 활용하여 다음의 문제 풀어보세요.
		 * 
		 * 사용자 입력으로 키(m), 몸무게(kg)를 tall, weight 변수에
		 * 저장하여 BMI 지수를 구하고 출력하세요.
		 * 
		 * BMI 지수는 몸무게 / 키^2 로 구현합니다.
		 * 
		 * 출력 형식 : 당신의 BMI 지수 값은 23.52 입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double tall, weight, BMI;
		
		System.out.print("키(m) : ");
		tall = sc.nextDouble();
		System.out.print("몸무게(kg) : ");
		weight = sc.nextDouble();
		
		BMI = weight / (tall*tall);
		
		System.out.println("당신의 BMI 지수 값은 "+ BMI +" 입니다.");
				
	}
	
}