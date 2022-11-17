package casting;

public class CastingExam01 {

	public static void main(String[] args) {
		// 1. 문자열 변수 name에 자신의 이름 저장
		// 2. 정수 변수 age에 자신의 나이 저장
		// 3. 실수 변수 tall에 자신의 키 저장
		// 4. 변수에 저장된 모든 값을 .println() 메서드 사용하여 출력
		// 5. 변수에 저장된 값을 활용하여 다음 형식에 맞추어 출력
		//	   형식에 맞추어 출력할 때 print() / printf() / println() 중
		//	   자신이 사용하기 편한 메서드 하나를 선택하여 출력
		// 형식 : 저의 이름은 홍길동 입니다. 올해 30세이며, 내년에는 31세가 됩니다.
		// 6. 문자열 상수 MALE과 FEMALE을 생성하고 각각 "남성", "여성"로 초기화 하세요.
		// 7. 변수와 상수에 저장된 값을 활용하여 다음 형식에 맞추어 출력.
		// 형식 : 저의 키는 175.5로 대한민국 남성 표준 키보다 조금 큽니다.
		
		// 1
		String name = "윤영현";
		
		// 2
		int age = 22;
		
		// 3
		double tall = 169.3;
		
		// 4
		System.out.println("저의 이름은 "+ name +" 입니다. 올해 "+ age +"세이며, 내년에는 "+ (age+1) +"세가 됩니다." );
		
		
		// 6
		final String MALE = "남성";
		final String FEMALE = "여성";
		
		// 7
		System.out.printf("저의 키는 %.1f로 대한민국 %s 표준 키보다 조금 작습니다.", tall, MALE);

	}

}