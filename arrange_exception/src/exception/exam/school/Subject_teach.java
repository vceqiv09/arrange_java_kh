package exception.exam.school;

import exception.exam.school.exception.NegativeNumberException;
import exception.exam.school.exception.NumberRangeOverException;

public class Subject_teach {

	private static final int SCORE_MAX = 100;
	private static final int SCORE_MIN = 0;
	
	private String subName;
	private double score;
	private char grade;

	public Subject_teach(String subName) {
		this.subName = subName;
	}

	private double getScore() {
		return this.score;
	}
	public void setScore(double score) {
		if(score >= SCORE_MIN && score <= SCORE_MAX) {
			this.score = score;
			this.setGrade();
		} else if(score < SCORE_MIN){
			throw new NegativeNumberException("점수는 양수 값만 입력할 수 있습니다.");
		} else {
			throw new NumberRangeOverException(SCORE_MIN, SCORE_MAX);
		}
	}

	private void setGrade() {
		switch((int)(this.score / 10)) {
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
				this.grade = 'F';
		}
	}
	
	public Subject_teach greatThen(Subject_teach sub) {
		return this.getScore() >= sub.getScore() ? this : sub;
	}
	
	@Override
	public String toString() {
		return String.format("%s(%c: %.2f)", this.subName, this.grade, this.score);
	}
	
}