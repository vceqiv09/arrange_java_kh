package exception.custom;

public class Exception_Custom_1028 {
	
	public static void main(String[] args) throws UserException {
		/*
		 * 사용자 정의 예외 작성
		 */
		Member m = new Member();
		
		m.setName("홍길동");
		System.out.println(m.getName());
		
		m.setPassword("Aa1!");
		System.out.println(m.getPassword());
	}

}