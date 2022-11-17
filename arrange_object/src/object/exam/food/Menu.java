package object.exam.food;

import java.util.Arrays;

public class Menu {

	private Food food[] = {
			new Food("불백", 6000), new Food("김치찌개", 5000),
			new Food("된장찌개", 5500), new Food("비빔밥", 5000)
	};

	public Menu() {
		
	}
	
	// 전체 메뉴
	public String showAllMenu() {
		String str = "<<< 메뉴판 >>>\n";
		
		for(int i=0; i<this.food.length; i++) {
			Food f = this.food[i];
			str += String.format("%d. %s   \t%d\n", i+1, f.menuName, f.price);
		}
		return str;
	}
	
	// 메뉴 추가
	public void addMenu(String menuName, int price) {
		int index = findIndex(menuName);
		
		if(index == -1) {	// 추가할 메뉴가 메뉴판에 없을 때
			this.food = Arrays.copyOf(this.food, this.food.length+1);
			this.food[this.food.length-1] = new Food(menuName, price);
		} else {			// 있을 때 (중복 일 때)
			System.out.println("중복입니다.");
		}
	}
	
	// 메뉴 수정
	public void updateMenu(String menuName, int price) {
		int index = findIndex(menuName);
		
		if(index != -1) {
			this.food[index].price = price;
		} else {
			System.out.println("수정할 메뉴가 존재하지 않습니다.");
		}
	}
	
	// 메뉴 삭제
	public void deleteMenu(String menuName) {
		int index = findIndex(menuName);
		
		if(index != -1) {
			for(int i=index; i<this.food.length-1; i++) {
				this.food[i] = this.food[i+1];
			}
			this.food = Arrays.copyOf(this.food, this.food.length-1);
		} else {
			System.out.println("삭제할 메뉴가 존재하지 않습니다.");
		}
	}
	
	// 메뉴 찾기
	public int findMenu(String menuName) {
		int index = findIndex(menuName);
		
		if(index != -1) {
			return this.food[index].price;
		} else {
			return -1;
		}
		
	}
	
	// 메뉴 찾는 메서드
	public int findIndex(String menuName) {
		for(int i=0; i<this.food.length; i++) {
			// 찾는 메뉴가 있을 때
			if(this.food[i].menuName.equals(menuName)) {
				return i;
			}
		}
		// 찾는 메뉴가 없을 때
		return -1;
	}
	
}