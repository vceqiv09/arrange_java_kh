package exception.exam.school;

import exception.exam.school.exception.NegativeNumberException;
import exception.exam.school.exception.NumberRangeOverException;

public class Subject {

	protected String subName;
	protected double score;
	protected char grade;

	public Subject() { }
	public Subject(String subName, double score) {
		this.subName = subName;
		this.setScore(score);
		this.setGrade(score);
	}

	private double getScore() {
		return this.score;
	}
	protected void setScore(double score) {
		if(score >= 0 && score <= 100) {
			this.score = score;
		} else if(score < 0){
			throw new NegativeNumberException("점수는 양수 값만 입력할 수 있습니다.");
		} else {
			throw new NumberRangeOverException("점수는 0 ~ 100 사이의 정수 및 실수만 입력할 수 있습니다.");
		}
	}

	private void setGrade(double score) {
		switch((int)(score / 10)) {
			case 10:
			case 9:
				this.grade = 'A'; break;
			case 8:
				this.grade = 'B'; break;
			case 7:
				this.grade = 'C'; break;
			case 6:
				this.grade = 'D'; break;
			case 5:
				this.grade = 'E'; break;
			default:
				this.grade = 'F'; break;
		}
	}
	
	public Subject greatThen(Subject sub1, Subject sub2) {
		return sub1.getScore() >= sub2.getScore() ? sub1 : sub2;
	}
	
	@Override
	public String toString() {
		return String.format("%s(%c: %.2f)", this.subName, this.grade, this.score);
	}
		
}