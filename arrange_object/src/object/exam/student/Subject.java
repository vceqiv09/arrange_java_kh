package object.exam.student;

public class Subject {
	public String subName;
	public double score;
	public char grade;
	
	public Subject(String subName) {
		this.subName = subName;
	}
	public Subject(String subName, double score) {
		this.subName = subName;
		this.score = score;
	}

	public char getGrade(double score) {
		switch((int)(score/10)) {
		case 10:
		case 9:
			this.grade = 'A';	break;
		case 8:
			this.grade = 'B';	break;
		case 7:
			this.grade = 'C';	break;
		case 6:
			this.grade = 'D';	break;
		default:
			this.grade = 'F';
		}
		return this.grade;
	}
	
}