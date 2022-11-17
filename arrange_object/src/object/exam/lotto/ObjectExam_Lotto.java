package object.exam.lotto;

import java.util.Arrays;

public class ObjectExam_Lotto {

	public static void main(String[] args) {
		/*
		 * 로또(Lotto) 클래스를 만들어 본다.
		 * 로또 클래스는 다음의 속성 및 기능을 가진다.
		 * 		속성 : 회차, 로또번호(배열), 보너스
		 * 		기능 : 번호생성, 번호확인
		 * 
		 * - 회차는 한 번 정해지면 변경할 수 없어야 한다.
		 * - 로또 번호는 1 ~ 46 사이의 번호 6개 + 보너스 번호가 생성되어야 한다.
		 * - 로또 번호는 "번호생성" 기능을 통해서만 생성되어야 한다.
		 * - 모든 번호는 중복이 있어선 안 된다.
		 * - "번호확인" 기능을 통해 확인할 수 있는 번호는 보너스까지이며, 문자열로 반환.
		 * 
		 */
		
		Lotto lotto = new Lotto(10);
		
		// 회차 출력
		System.out.println(lotto.getRound() +" 회차");
		
		// 로또 번호 생성
		lotto.createLotto();
		
		// 로또 번호 확인
		System.out.println(lotto.getArr());
		
	}

}