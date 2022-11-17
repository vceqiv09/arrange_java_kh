package object;

public class Object {
	
	String name;
	int age;
	String phone;
	String address;
	
	// 기본 생성자
	public Object() {
		
	}
	// 매개변수가 있는 생성자
	public Object(String name) {
		this.name = name;
	}
	public Object(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void pay() {
		
	}
	public void payCancel() {
		
	}
	public void phoneChange() {
		
	}
	
}