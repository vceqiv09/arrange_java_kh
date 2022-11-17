package object;

public class Object2 {
	
	private String name;
	private int age;
	private String phone;

	public Object2(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	// getter : 멤버 변수에 저장된 데이터를 반환하는 메서드
	public String getName() {
		return this.name.substring(0, 1) + "XX";
	}
	public int getAge() {
		return this.age / 10 * 10;
	}
	public String getPhone() {
		return this.phone.substring(0, 9) + "XXXX";
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}