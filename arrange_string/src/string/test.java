package string;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// 문자열에서 사용자가 지정한 문자열이 몇개 있는지 출력하시오.
		String str1 = new String("indexOf() 메서드 사용 예제로 이 메서드는 특정 문자열의 위치를 알려주는 메서드 입니다.");
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 문자 : ");
		String word = sc.nextLine();
		
		int count = 0;
		int index = 0;
		for(int i=0; i<str1.length(); i++) {
			index = str1.indexOf(word, index);
			if(index != -1) {
				index++;	count++;
			} else
				break;
		}
		System.out.println("str1 문자열에서 "+ word +" 단어는 "+ count +"개 있습니다.");

	}

}