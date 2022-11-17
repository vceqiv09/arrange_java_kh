package inherit.exam.member;

public class Staff extends Member {
	
	public void delete() {
		System.out.println(getName() +"이(가) 게시글 삭제 완료");
	}
	
	@Override
	public String toString() {
		return "Staff  [getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
	
}