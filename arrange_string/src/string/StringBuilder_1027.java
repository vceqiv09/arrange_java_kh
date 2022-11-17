package string;

public class StringBuilder_1027 {
	
	public static void main(String[] args) {
		/*
		 * 	StringBuilder / StringBuffer
		 */
		StringBuilder sb = new StringBuilder(128);
		
		// append() : 기존 문자열에 매개변수로 받은 문자열을 추가 해주는 것
		// 기존 객체에 문자열이 들어갈 수 있게 이미 충분한 공간을 만들어둔다?
		sb.append("문자열");
		System.out.println(sb.toString());
		
		sb.append(" append 로 문자열을 추가합니다.");
		System.out.println(sb.toString());
		
		// capacity() : 길이랑은 다른 크기 구하는?
		int capacity = sb.capacity();
		System.out.println(capacity);
		
		// length() : 길이 구하는
		int length = sb.length();
		System.out.println(length);
		
		// delete(start, end) : start 이상 end 미만 삭제하기
		sb.delete(0, 4);
		System.out.println(sb.toString());
		
		// insert() : append 는 무조건 뒤에 추가하지만, insert()는 원하는 자리에 넣을 수 있다.
		sb.insert(9, "문자열");
		System.out.println(sb.toString());
		
		// reverse() : 앞 뒤 바꾸는, 뒤집는
		sb.reverse();
		System.out.println(sb.toString());
		
		//setLength() : 길이 늘려주는?
		sb.setLength(30);
		System.out.println(sb.toString());
		
		// trimToSize() : 너무 큰 크기 줄여주는?
		sb.trimToSize();
		capacity = sb.capacity();
		System.out.println(capacity);
		
		// indexOf(), replace(), charAt(), compareTo(), substring() 
		// -> String 클래스에 있는 메서드랑 똑같다.
		
	}
	
}	