package object.exam.clock;

public class ObjectExam_Clock {

	public static void main(String[] args) {
		/*
		 * 시계 클래스
		 * 
		 * 멤버 변수 : 시, 분, 초
		 * 멤버 메서드 : 시간출력, 1초전, 1초후, 1분전, 1분 후, 1시간 전, 1시간 후
		 * 
		 * 위 표의 한글명을 영문명으로 변경하여 작성하세요.
		 * 
		 * - 시계 클래스가 생성될 때 시, 분, 초 정보를 받아 초기화 되어야 한다.
		 * - 시간을 출력 할 때 '12:30:30' 형식으로 출력 되어야 한다.
		 * - 시간은 전/후로 이동할 수 있다. 12시 30분 30초에서 1시간 전으로 이동하면 11시 30분 30초가 된다.
		 * - 시, 분, 초에 대한 직접 변경은 불허한다.
		 */
		
		Clock clock = new Clock(0, 0, 0);
		
		System.out.println(clock.getTime());
		
		clock.beforeOneHour();
		System.out.println(clock.getTime());
		
	}

}