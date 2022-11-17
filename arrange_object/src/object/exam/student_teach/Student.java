package object.exam.student_teach;

import java.util.Arrays;

public class Student {

	private Subject subjects[];
	private String name;
	private int year;
	
	public Student(String name) {
		this.subjects = new Subject[0];
		this.name = name;
	}
	
	public Student(String name, int year) {
		this(name);
		this.year = year;
	}
	
	public String getGradeTable() {
		String result = "";
		for(int i = 0; i < this.subjects.length; i++) {
			Subject s = this.subjects[i];
			 result += String.format("%s\t%.2f\n", s.getName(), s.getScore());
		}
		return result;
	}
	
	private boolean isDuplicate(String subjectName) {
		return this.findIndex(subjectName) == -1 ? false : true;
	}
	
	private int findIndex(String subjectName) {
		for(int i = 0; i < this.subjects.length; i++) {
			Subject s = this.subjects[i];
			if(s.getName().equals(subjectName)) {
				return i;
			}
		}
		return -1;
	}
	
	public Subject getSubject(String subjectName) {
		int idx = this.findIndex(subjectName);
		if(idx >= 0) {
			return this.subjects[idx];
		}
		return null;
	}
	
	public double getScore(String subjectName) {
		Subject result = this.getSubject(subjectName);
		return result != null ? result.getScore() : -1;
	}
	
	public boolean addSubject(String subjectName, double score) {
		boolean result = false;
		if(!this.isDuplicate(subjectName)) {
			int len = this.subjects.length;
			this.subjects = Arrays.copyOf(this.subjects, len + 1);
			this.subjects[len] = new Subject(subjectName, score);
			result = true;
		}
		return result;
	}
	
	public boolean updateSubject(String subjectName, double score) {
		boolean result = false;
		int idx = this.findIndex(subjectName);
		if(idx >= 0) {
			Subject s = this.subjects[idx];
			s.setScore(score);
			result = true;
		}
		return result;
	}
	
	public boolean removeSubject(String subjectName) {
		boolean result = false;
		int idx = this.findIndex(subjectName);
		if(idx >= 0) {
			for(int i = idx; i < this.subjects.length - 1; i++) {
				this.subjects[i] = this.subjects[i + 1];
			}
			this.subjects = Arrays.copyOf(this.subjects, this.subjects.length - 1);
			result = true;
		}
		return result;
	}

}