package object.exam.menu;

public class ObjectExam_Menu {

	public static void main(String[] args) {
		/*
		 *  메뉴판 클래스
		 *  
		 *  멤버 변수 : 메뉴명(배열), 메뉴가격(배열)
		 *  멤버 메서드: 전체메뉴, 메뉴추가, 메뉴수정, 메뉴삭제, 메뉴찾기
		 *  
		 * 	위 표의 한글명을 영문명으로 변경하여 작성하세요.
		 * 
		 * - 음식점의 메뉴판을 만들고 관리하기 위한 클래스로 초기값 없이 기본 생성자로 객체를 생성하게 한다.
		 * - '메뉴명'과 '메뉴가격' 배열은 서로 동일한 인덱스 번호로 메뉴에 대한 가격이 연관되어 있다.
		 * - '메뉴 추가'를 하게 되면 '메뉴명'과 '메뉴가격'이 각 배열에 저장된다.
		 * - '메뉴 수정'을 하게 되면 지정한 메뉴에 대한 가격이 변경되어야 한다.
		 * - '메뉴 삭제'를 하게 되면 지정한 메뉴에 대한 정보가 배열에서 제거되어야 한다.
		 * - '메뉴 찾기'를 하게 되면 지정한 메뉴에 대한 가격이 반환되어야 한다.
		 * - '전체 메뉴'는 '메뉴명', '메뉴가격' 각 배열에 저장된 모든 데이터를 출력하기 위한 메서드이다. 
		 */
		
		Menu m = new Menu();
		
		// 전체 메뉴 출력
		System.out.println(m.showAllMenu());
		
		// 메뉴 추가
		m.addMenu("비빔밥", 4000);
		System.out.println(m.showAllMenu());
		
		// 메뉴 수정
		m.updateMenu("비빔밥", 5000);
		System.out.println(m.showAllMenu());
		
		// 메뉴 삭제
		m.deleteMenu("비빔밥");
		System.out.println(m.showAllMenu());
		
		// 메뉴 찾기
		m.findMenu("된장찌개");
		
	}

}