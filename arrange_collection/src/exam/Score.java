package exam;

public class Score {
	
	private double score;
	private char grade;
	
	public Score(double score) {
		this.score = score;
		this.setGrade();
	}
	
	public double getScore() {
		return score;
	}
	
	public char getGrade() {
		return grade;
	}
	private void setGrade() {
		// A ~ F 까지의 등급 계산.
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
	
	@Override
	public String toString() {
		return String.format("%.2f=%c", this.score, this.grade);
	}
	
}