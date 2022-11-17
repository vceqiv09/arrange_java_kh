package exception.exam.school;

import exception.exam.school.exception.NegativeNumberException;
import exception.exam.school.exception.NumberRangeOverException;

public class Evaluation extends Subject {


	private static final int SCORE_MAX = 10;
	private static final int SCORE_MIN = 1;
	
	private void setGrade() {
		int offset = (int)this.score;
		this.grade = offset >= 6 ? 'P' : 'F';
	}
	
	@Override
	public void setScore(double score) {
		if(score >= SCORE_MIN && score <= SCORE_MAX) {
			this.score = score;
			this.setGrade();
			return;
		} else if(score < 0) {
			throw new NegativeNumberException();
		}
		
		throw new NumberRangeOverException(SCORE_MIN, SCORE_MAX);
	}
	
}
