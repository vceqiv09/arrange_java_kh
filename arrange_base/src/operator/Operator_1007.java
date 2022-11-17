package operator;

public class Operator_1007 {

	public static void main(String[] args) {
		// 산술연산
		
		int x1 = 3, y1 = 2;
		double x2 = 3.0;
		
		System.out.println("나머지 연산 결과 -> " + (x1%y1));		
		System.out.println("나머지 연산 결과 -> " + (x2%y1));
		System.out.println("!= 연산 결과 -> " + (x1 != x2));
		
		
		boolean b1 = true, b2 = false;
		System.out.println("논리 연산 true && true 결과 -> " + (b1 && b1));
		System.out.println("논리 연산 true && false 결과 -> " + (b1 && b2));
		
		System.out.println("논리 연산 true || false -> " + (b1 || b2));
		System.out.println("논리 연산 false || false -> " + (b2 || b2));
		
		
		int z1 = 10, z2 = 10;
		System.out.println("전위 증감 연산 ++z1 결과 -> " + (++z1));
		System.out.println("전위 증감 연산 z2++ 결과 -> " + (z2++));
		System.out.println("전위/후위 최종 결과 -> " + z1 + "/" + z2);
		
		int x = 1, y = 0;
		y = x > 3 ? 5 : 10;
		System.out.println(y);
		
	}

}