package string.exam.phone;

import java.util.Scanner;

public class StringExam_Phone {
	
	public static void main(String[] args) {
		/*
		 * 사용자 입력으로 전화번호를 입력 받고 입력 받은 전화번호의
		 * 일부 내용을 숨겨서 출력하기 위한 기능을 구현하세요.
		 * 
		 * 	1. 전화번호 형식은 반드시 010으로 시작하는 문자열이어야 합니다.
		 *  2. - 으로 구분된 전화번호 형식이 입력되어야 합니다.
		 *  3. 전화번호의 2번째 3번째 번호는 반드시 4자리여야 합니다.
		 *  4. 사용자가 입력한 전화번호는 출력할 때 일부 내용이 숨김 처리되어야 합니다.
		 *  	입력 : 010-1234-5678
		 *  	출력 : 010-1234-****
		 */

		Scanner sc = new Scanner(System.in);
		String phoneArr[];
		while(true) {
			System.out.print("전화번호 입력 : ");
			String phone = sc.nextLine();
			phoneArr = phone.split("-");
			
			if((!phone.startsWith("010")) || (phoneArr[1].length() != 4)
					|| (phoneArr[2].length() != 4)) {
				System.out.println("다시 입력해주세요.\n");
			} else {
				break;
			}
		}
		String phoneNumber = "";
		phoneNumber = String.join("-", phoneArr[0],
				phoneArr[1], phoneArr[2]);
		phoneNumber = phoneNumber.replace(phoneArr[2], "****");
		
		System.out.println(phoneNumber);
		
	}
	
}