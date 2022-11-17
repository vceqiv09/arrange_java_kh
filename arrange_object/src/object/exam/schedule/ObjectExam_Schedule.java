package object.exam.schedule;

import object.exam.clock.Clock;

public class ObjectExam_Schedule {

	public static void main(String[] args) {
		/*
		 *  스케쥴 클래스
		 *  
		 *  멤버 변수 : 년, 월, 일, 종일유무, 시작시간, 종료시간
		 *  멤버 메서드: 종일로변경, 시간으로변경, 일자변경
		 *  
		 * 	위 표의 한글명을 영문명으로 변경하여 작성하세요.
		 * 
		 * - 스케쥴을 생성하기 위한 클래스로 년, 월, 일 정보를 받아 초기화 해야 한다.
		 * - 초기화 될 때 '종일구분'은 false 이어야 하며, '시작시간', '종료시간'은 기본 '09:00:00 ~ 10:00:00' 으로 설정 한다.
		 * - 종일로 변경 하게 되면 '시작시간'과 '종료시간'은 '00:00:00 ~ 23:59:59' 으로 설정 하고 '종일구분'은 true가 된다.
		 * - 시간으로 변경 하게 되면 변경된 시간으로 '시작시간'과 '종료시간'으로 설정하고 '종일구분'은 false가 되어야 한다.
		 * - 일자로 변경하게 되면  지정한 일자로 년, 월, 일 을 설정한다. 
		 */
		
		Schedule s = new Schedule(2022, 10, 18);
		System.out.println(s.getSchedule());
		
		s.changeFullDay();
		System.out.println(s.getSchedule());

		s.changeDay(2022, 10, 19);
		System.out.println(s.getSchedule());

		s.changeTime(new Clock(45, 70, 100), new Clock(16, 59, 59));
		System.out.println(s.getSchedule());
	}

}