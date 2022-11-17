package casting;

public class Casting_1006 {

	public static void main(String[] args) {
		// 형변환
		
		byte bt1;
		short st1 = 500;
		
		bt1 = (byte)st1;
		System.out.println(bt1);
		
		int i1 = 10 + (int)10.5;
		System.out.println(i1);

		System.out.printf("%s / %d", "ABCD", 1234);
	}

}