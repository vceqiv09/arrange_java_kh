package exam.subject;

import java.util.Objects;

public class Student {
	
	private String name;
	private int year;
	private int classRoom;
	private int classNumber;
	
	public Student() { }
	public Student(int year, int classRoom, int classNumber) {
		this.year = year;
		this.classRoom = classRoom;
		this.classNumber = classNumber;
	}
	public Student(String name, int year, int classRoom, int classNumber) {
		this.name = name;
		this.year = year;
		this.classRoom = classRoom;
		this.classNumber = classNumber;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

	public int getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

	@Override
	public String toString() {
		return name +", "+ year +"학년, "+ classRoom +"반, "+ classNumber +"번";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(classNumber, classRoom, name, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return classNumber == other.classNumber && classRoom == other.classRoom
				&& year == other.year;
	}
	
}