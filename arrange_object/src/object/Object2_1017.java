package object;

public class Object2_1017 {

	public static void main(String[] args) {
		
		// 캡슐화
		
		Object2 cs = new Object2("홍길동", 22, "010-1234-5678");
		
		System.out.println("이름 : "+ cs.getName());
		System.out.println("나이 : "+ cs.getAge() +"대");
		System.out.println("연락처 : "+ cs.getPhone());
		
	}

}