package object.exam.menu;

import java.util.Arrays;

public class Menu {

	private String menu[] = { "불백", "김치찌개", "된장찌개" };
	private int price[] = { 7000, 6000, 6500 };
	
	// 전체 메뉴
	public String showAllMenu() {
		String str = "<<< 메뉴판 >>>\n";
		
		for(int i=0; i<this.menu.length; i++) {
			str += String.format("%d. %s   \t%,d\n", i+1, this.menu[i], this.price[i]);
		}
		return str;
	}
	
	// 메뉴 추가 - 중복 검사
	public void addMenu(String menuName, int price) {
		// 중복 검사
		int index = findIndex(menuName);
		
		if(index == -1) {
			this.menu = Arrays.copyOf(this.menu, this.menu.length+1);
			this.price = Arrays.copyOf(this.price, this.price.length+1);
			
			this.menu[this.menu.length-1] = menuName;
			this.price[this.price.length-1] = price;
		} else {
			System.out.println("중복입니다.");
		}
	}
	
	// 메뉴 수정
	public void updateMenu(String menuName, int price) {
		int index = findIndex(menuName);
		
		if(index != -1) {
			this.price[index] = price;
		} else {
			System.out.println("수정할 메뉴가 존재하지 않습니다.");
		}
	}
	
	// 메뉴 삭제
	public void deleteMenu(String menuName) {
		int index = findIndex(menuName);
		
		if(index != -1) {
			for(int i=index; i<this.menu.length-1; i++) {
				this.menu[i] = this.menu[i+1];
				this.price[i] = this.price[i+1];
			}
			this.menu = Arrays.copyOf(this.menu, this.menu.length-1);
			this.price = Arrays.copyOf(this.price, this.price.length-1);
		} else {
			System.out.println("삭제할 메뉴가 존재하지 않습니다.");
		}
	}
	
	// 메뉴 찾기
	public void findMenu(String menuName) {
		int index = findIndex(menuName);
		
		if(index != -1) {
			System.out.println(menuName +"의 가격은 "+ this.price[index] +"원 입니다.");
		} else {
			System.out.println("찾는 메뉴가 존재하지 않습니다.");
		}
	}
	
	// 메뉴 찾는 메서드
	public int findIndex(String menuName) {
		for(int i=0; i<this.menu.length; i++) {
			if(this.menu[i].equals(menuName)) {
				return i;
			}
		}
		// 찾는 메뉴가 없을 때
		return -1;
	}
		
}