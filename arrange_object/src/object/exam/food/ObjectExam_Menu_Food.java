package object.exam.food;

import java.util.Scanner;

public class ObjectExam_Menu_Food {

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
		
		Menu menu = new Menu();
		Scanner sc = new Scanner(System.in);
		
		System.out.println(menu.showAllMenu());
		
		int total = 0;
		while(true) {
			System.out.print("메뉴 선택 : ");
			String menuName = sc.nextLine();
			
			if(menuName.equals("exit")) {
				break;
			}
			
			int price = menu.findMenu(menuName);
			if(price != -1) {
				System.out.printf("%s 메뉴를 선택하였습니다. 가격은 %,d 입니다.\n", menuName, price);
				total += price;
			} else {
				System.out.printf("%s 라는 메뉴는 없습니다.\n", menuName);
			}
		}
		System.out.printf("지금까지 선택한 메뉴의 총 가격은 %,d 입니다.", total);
	}
		
}