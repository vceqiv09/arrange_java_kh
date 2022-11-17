package interface_Impl;

import java.util.Objects;

public class AdminPerson implements Admin {

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdminPerson other = (AdminPerson) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "AdminPerson [name=" + name + ", age=" + age + "]";
	}
	
	// Admin	
	@Override
	public void removeRole() {
		System.out.println("Person 클래스의 removeRole() 메서드");
	}
	@Override
	public void addRole() {
		System.out.println("Person 클래스의 addRole() 메서드");
	}
	
	// Staff
	@Override
	public void remove() {
		System.out.println("Person 클래스의 remove() 메서드");
	}
	
	// Member
	@Override
	public void write() {
		System.out.println("Person 클래스의 write() 메서드");
	}
	@Override
	public void view() {
		System.out.println("Person 클래스의 view() 메서드");
	}
	@Override
	public void update() {
		System.out.println("Person 클래스의 wrupdateite() 메서드");
	}
	
}