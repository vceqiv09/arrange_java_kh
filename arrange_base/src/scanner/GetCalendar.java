package scanner;

public class GetCalendar {

	private int year;
	private int month;
	private boolean leaf;
	private char firstDate[] = new char[12];
	private int lastDay[] = {
			31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
	};
	private char date[] = {
			'일',  '월', '화', '수', '목', '금', '토'
	};
	
	public GetCalendar(int year, char JanDate, int month) {
		this.setYear(year);
		this.setFirstDate(JanDate);
		this.month = month;
	}

	private void setYear(int year) {
		this.year = year;
		this.leaf = false;
		
		// 윤년
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			this.leaf = true;
		}
	}

	public int getLastDay() {
		int lastDay = this.lastDay[this.month -1];
		if(this.month == 2 && this.leaf)
			lastDay += 1;
		
		return lastDay;
	}
	
	
	public char getFirstDate(int month) {
		return this.firstDate[month-1];
	}
	private void setFirstDate(char JanDate) {
		int index = 0;
		for(int i=0; i<this.date.length; i++) {
			String jDate = String.valueOf(JanDate);
			String date = String.valueOf(this.date[i]);
			
			if(date.equals(jDate)) {
				index = i;
			}
		}
		
		// index = 6;
		this.firstDate[0] = JanDate;

		for(int i=1; i<this.firstDate.length; i++) {
			if(this.lastDay[i-1] == 29) {
				index = findIndex(index, 1);
				this.firstDate[i] = date[index];
			} else if(this.lastDay[i-1] == 30) {
				index = findIndex(index, 2);
				this.firstDate[i] = date[index];
			} else if(this.lastDay[i-1] == 31) {
				index = findIndex(index, 3);
				this.firstDate[i] = date[index];
			} else if(this.lastDay[i-1] == 28) {
				index = findIndex(index, 0);
				this.firstDate[i] = date[index];
			}
		}
	}
	private int findIndex(int index, int plus) {
		index += Math.abs(plus);
		if(index > 6) {
			index = index % 7;
		}
		return index;
	}

}