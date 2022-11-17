package wrapper;

public class Wrapper_1027 {
	
	public static void main(String[] args) {
		/*
		 * Wrapper 클래스
		 * 	- 문자열을 기본 자료형으로 변환해주는 클래스
		 * 	- 기본 자료형을 클래스로 만들어서 클래스 처럼 다루어서 
		 *    사용할 수 있게 도와주는 클래스
		 * 
		 * Wrapper 종류
		 * 		Boolean, Byte, Character, Short, Integer, Long, Float, Double
		 * 
		 * 		클래스이기 때문에 대문자로 시작해야 한다. (대소문자 구분)
		 */
		
		// 문자열을 기본 자료형으로 변환
		boolean bool1 = Boolean.parseBoolean("true");
		byte bt1 = Byte.parseByte("100");	// byte로 변환할 수 있는 형식이어야 한다. 범위가 넘어가거나 정수값이 아닐 경우 에러가 난다.
		char ch1 = "가".charAt(0);			// 애는 좀 특이 charAt() 서야한다.
		short sh1 = Short.parseShort("100");
		int it1 = Integer.parseInt("100");
		long lg1 = Long.parseLong("100");
		float ft1 = Float.parseFloat("100");
		double db1 = Double.parseDouble("100");
		
		// 기본 자료형을 Wrapper 객체로 변환
		Boolean bool2 = Boolean.valueOf(bool1);
		byte bt2 = Byte.valueOf(bt1);
		char ch2 = Character.valueOf(ch1);
		short sh2 = Short.valueOf(sh1);
		int it2 =  Integer.valueOf(it1);
		long lg2 = Long.valueOf(lg1);
		float ft2 = Float.valueOf(ft1);
		double db2 = Double.valueOf(db1);
		
	}
	
}	