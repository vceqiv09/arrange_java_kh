package object.exam.clock;

public class Clock {

	private int hour;
	private int minute;
	private int second;
	
	public Clock(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	// 시간 출력
	public String getTime() {
		String time = "";
		
		time += this.hour < 10 ?  "0"+ this.hour : this.hour;
		time += ":";
		time += this.minute < 10 ?  "0"+ this.minute : this.minute;
		time += ":";
		time += this.second < 10 ?  "0"+ this.second : this.second;
		
		return time;
	}
	
	// 1시간 후
	public void afterOneHour() {
		this.hour++;
		this.hour %= 24;
	}
	
	// 1분 후
	public void afterOneMinute() {
		this.minute++;
		if(this.minute > 59) {
			this.afterOneHour();
			this.minute = 0;
		}
	}
	
	// 1초 후
	public void afterOneSecond() {
		this.second++;
		if(this.second > 59) {
			this.afterOneMinute();
			this.second = 0;
		}
	}
	
	// 1시간 전
	public void beforeOneHour() {
		this.hour--;
		if(this.hour < 0)
			this.hour = 23;
	}
	
	// 1분 전
	public void beforeOneMinute() {
		this.minute--;
		if(this.minute < 0) {
			this.beforeOneHour();
			this.minute = 59;
		}
	}
	
	// 1초 전
	public void beforeOneSecond() {
		this.second--;
		if(this.second < 0) {
			this.beforeOneMinute();
			this.second = 59;
		}
	}

}