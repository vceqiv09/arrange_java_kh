package string;

import java.util.StringTokenizer;

public class StringTokenizer_1027 {
	
	public static void main(String[] args) {
		/*
		 * StringTokenizer
		 * 		문자열을 특정 구분 문자를 기준으로 분리하는 클래스
		 * 		이거 쓸 바에 split() 써라.
		 */
		String str = "A,B,C,D,E";
		
		StringTokenizer sToken = new StringTokenizer(str, ",");
		
		while(sToken.hasMoreTokens()) {
			System.out.print(sToken.nextToken() +" ");
		}
		
	}
	
}	