package scanner;

import java.util.Scanner;

public class Scanner_1007 {

	public static void main(String[] args) {
		// 사용자 입력을 받을 때 사용하는 클래스 -> Scanner
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수값을 입력하세요 : ");
		int x1 = sc.nextInt();	
		System.out.println("사용자 입력으로 정수값 " +x1+ " 받음");
		
		System.out.print("실수값을 입력하세요 : ");
		double y1 = sc.nextDouble();
		System.out.println("사용자 입력으로 실수값 " +y1+ " 받음");
		
		System.out.print("실수값을 입력하세요 : ");
		double y2 = sc.nextDouble();
		System.out.println("사용자 입력으로 실수값 " +y2+ " 받음");
		
		
		sc.nextLine();
		System.out.print("문자열 입력 : ");
		String str1 = sc.nextLine();
		System.out.println("사용자 입력으로 문자열 '" +str1+ "' 받음");
		
	}

}
