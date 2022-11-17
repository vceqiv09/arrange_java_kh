package string.exam.phone;

import java.util.Scanner;

public class StringExam_Phone_teach {
	
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
		
		while(true) {
			System.out.print("전화번호 입력 : ");
			String input = sc.nextLine();
			
			if(input.contains("exit")) {
				break;
			}
			
			Phone phone = Phone.valueOf(input);
			
			if(phone.isInvalid()) {
				switch(phone.reason()) {
				case Phone.PREFIX_ERROR:
					System.out.println("전화번호는 010 으로 시작해야 합니다.");
					break;
				case Phone.DELIMITER_ERROR:
					System.out.println("전화번호는 - 구분자만 사용해야 합니다.");
					break;
				case Phone.FORMATTING_ERROR:
					System.out.println("전화번호 형식이 잘못 되었습니다.");
					break;
				case Phone.NUMBER_ERROR:
					System.out.println("전화번호에 숫자가 아닌 문자가 있습니다.");
					break;
				case Phone.LENGTH_ERROR:
					System.out.println("전화번호의 길이를 다시 확인하세요.");
					break;
					
				}
				continue;
			} else {
				System.out.println("전화번호 출력 : "+ phone.getNumber(true));
				break;
			}
		}
		
	}
	
}