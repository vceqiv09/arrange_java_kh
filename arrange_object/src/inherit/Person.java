package inherit;

public class Person {
	
	private String name;
	private int age;
	private char gender;
	
//	public Person() {
//		
//	}
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	/**
	 * 이 메서드를 실행하면 기존 나이에 +1 한 나이가 누적된다.
	 */
	public void addAge() {
		this.age++;		// this.age += 1;
	}
	
}