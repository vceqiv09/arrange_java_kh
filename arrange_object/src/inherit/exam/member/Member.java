package inherit.exam.member;

public class Member extends Person {

	public void write() {
		System.out.println(getName() +"이(가) 게시글 쓰기 완료");
	}
	
	public void read() {
		System.out.println(getName() +"이(가) 게시글 보기 완료");
	}
	
	public void update() {
		System.out.println(getName() +"이(가) 게시글 수정 완료");
	}

	@Override
	public String toString() {
		return "Member [getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
	
}