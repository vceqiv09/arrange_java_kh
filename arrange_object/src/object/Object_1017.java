package object;

public class Object_1017 {

	public static void main(String[] args) {
		
		// 객체
		
		// 인스턴스화 : new 연산자를 사용하여 클래스를 인스턴스로 만드는 것
		Object ob = new Object();
		
		// 멤버 변수의 값 변경
		ob.name = "홍길동";
		ob.age = 22;
		
		// 멤버 변수에 저장된 값 출력
		System.out.println(ob.name);
		
		// 멤버 메서드 사용(메서드 호출)
		ob.pay();
		

		// 생성자
		Object ob1 = new Object("홍길동");
		Object ob2 = new Object("박종화", 22);
		
		
		// 접근제한자
		
	}

}