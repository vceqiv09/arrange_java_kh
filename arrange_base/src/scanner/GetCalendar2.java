package scanner;

import java.util.Calendar;

public class GetCalendar2 {

	private int tab;
	private int nextLine;
	private char firstDate;
	private int lastDay;
	
	public void setFirstDate(int firstDate, int lastDay) {
		this.lastDay = lastDay;
		switch(firstDate) {
		case Calendar.SUNDAY:
			this.firstDate = '일'; break;
		case Calendar.MONDAY:
			this.firstDate = '월'; break;
		case Calendar.TUESDAY:
			this.firstDate = '화'; break;
		case Calendar.WEDNESDAY:
			this.firstDate = '수'; break;
		case Calendar.THURSDAY:
			this.firstDate = '목'; break;
		case Calendar.FRIDAY:
			this.firstDate = '금'; break;
		case Calendar.SATURDAY:
			this.firstDate = '토'; break;
		}
	}
	
	public void getTabNewLine() {
		// 시작 요일에 따른 들여쓰기와 개행 설정
		switch(this.firstDate) {
		case '일':
			tab = 0; nextLine = 0; break;
		case '월':
			tab = 1; nextLine = 6; break;
		case '화':
			tab = 2; nextLine = 5; break;
		case '수':
			tab = 3; nextLine = 4; break;
		case '목':
			tab = 4; nextLine = 3; break;
		case '금':
			tab = 5; nextLine = 2; break;
		case '토':
			tab = 6; nextLine = 1;break;
		}
	}
	
	public void print() {
		// 들여쓰기(tab)
		for(int i=0; i<this.tab; i++) {
			System.out.print("\t");
		}
		
		// 출력
		for(int i=1; i<=this.lastDay; i++) {
			System.out.print(i +"\t");
			if(i % 7 == nextLine) {
				System.out.println();
			}
		}
	}

}