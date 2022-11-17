package object.exam.schedule;

import object.exam.clock.Clock;

public class Schedule {

	private int year;
	private int month;
	private int day;
	private boolean fullDay;
	private Clock startTime;
	private Clock endTime;
	private boolean leaf;
	private int lastDayForMonth[] = {
			31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
	};
	
	public Schedule(int year, int month, int day) {
		this.setYear(year);
		this.setMonth(month);
		this.setDay(day);
		this.startTime = new Clock(9, 0, 0);
		this.endTime = new Clock(10, 0, 0);
	}

	private void setYear(int year) {
		this.year = year;
		this.leaf = false;
		
		// 윤년
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			this.leaf = true;
		}
		
	}

	private void setMonth(int month) {
		this.month = 1;
		if(month >= 1 && month <= 12)
			this.month = month;
	}
	
	private void setDay(int day) {
		this.day = 1;
		int lastDay = this.lastDayForMonth[this.month-1];
		
		if(this.month == 2 && this.leaf)
			lastDay += 1;
		
		if(day >= 1) {
			if(day <= lastDay)
				this.day = day;
			else
				this.day = lastDay;
		}
	}

	public void changeFullDay() {
		this.fullDay = true;
		this.startTime = new Clock(0, 0, 0);
		this.endTime = new Clock(23, 59, 59);
	}
	
	public void changeTime(Clock startTime, Clock endTime) {
		this.fullDay = false;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public void changeDay(int year, int month, int day) {
		this.setYear(year);
		this.setMonth(month);
		this.setDay(day);
	}
	
	public String getSchedule() {
		String str = "";
		
		str += this.year +"년 "+ this.month +"월 "+ this.day +"일 ";
		str += this.startTime.getTime() +" 부터 "+ this.endTime.getTime() +" 까지 ";
		str += this.fullDay ? "하루종일 " : "";
		str += "스케쥴이 잡혀 있습니다.";
		
		return str;
	}
	
}