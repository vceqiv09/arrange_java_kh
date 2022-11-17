package inherit.exam.member;

public class Admin extends Staff {
	
	// Member 객체를 Staff 객체로
	public Staff addStaff(Member member) {
		Staff staff = new Staff();
		staff.setName(member.getName());
		staff.setAge(member.getAge());
		return staff;
	}
	public Member deleteStaff(Staff staff) {
		Member member = new Member();
		member.setName(staff.getName());
		member.setAge(staff.getAge());
		return member;
	}

	public void addMember() {
		System.out.println(getName() +"이(가) 멤버 가입 완료");
	}
	public void deleteMember() {
		System.out.println(getName() +"이(가) 멤버 탈퇴 완료");
	}
	
	@Override
	public String toString() {
		return "Admin  [getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
	
}