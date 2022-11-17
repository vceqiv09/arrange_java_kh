package inherit.exam.member;

public class InheritExam_Member {

	public static void main(String[] args) {
		/*
		 * 회원 관리를 위한 프로그램
		 * 멤버 클래스를 상속하는 Staff, Admin 클래스를 작성한다.
		 * 		Member : 모든 일반 회원은 해당 객체를 통해 다루어진다.
		 * 				 일반 회원은 게시글쓰기, 게시글보기, 게시글수정 
		 * 				 작업만 할 수 있다.
		 * 		Staff : 스태프 회원은 일반 회원들이 작성한 글을 삭제할 수 있는
		 * 				작업을 가진다.
		 * 		Admin : 관리자는 스태프 권한 제거 및 추가, 멤버 가입 및 탈퇴의
		 * 				작업을 할 수 있다.
		 * 
		 * - 위 모든 객체는 이름, 나이 정보를 가지고 있다.
		 * - 위 관계를 파악하여 클래스의 상속, 오버로딩, 오버라이딩, 다형성을 적용하여
		 * 	 다루어 본다.
		 * - 실제 프로그램을 구현하는 것은 아님.
		 * - 구현할 메서드는 단순 출력문이 동작하도록 하세요.
		 */
		
		Person p1 = new Member();
		p1.setName("홍길동");		p1.setAge(22);
		
		Person p2 = new Staff();
		p2.setName("김철수");		p2.setAge(25);
		
		Person p3 = new Admin();
		p3.setName("이지현");		p3.setAge(21);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		Person pArr[] = new Person[3];
		pArr[0] = p1;	pArr[1] = p2;	pArr[2] = p3;
		
		// 전부 true가 나온다.
		// 왜냐하면 (부모) Person <- Member <- Staff <- Admin (자식)
		// 이런식으로 계층구조식으로 상속을 했기 때문이다.
		System.out.println(p3 instanceof Admin);
		System.out.println(p3 instanceof Staff);
		System.out.println(p3 instanceof Member);
		System.out.println(p3 instanceof Person);
		
		
		Member m1 = (Member)p1;
		Admin a1 = (Admin)p3;
		p1 = a1.addStaff(m1);		// p1 = ((Admin)p3).addStaff((Member)p1);
		
		System.out.println(p1);
		
		for(int i=0; i<pArr.length; i++) {
			// 그러기때문에 가장 하층, 즉 가장 자식? 부터 if 해야한다.
			if(pArr[i] instanceof Admin) {
				Admin admin = (Admin)pArr[i];
//				admin.addStaff();
				admin.deleteMember();
				admin.addMember();
				admin.deleteMember();
			} else if(pArr[i] instanceof Staff) {
				Staff staff = (Staff)pArr[i];
				staff.delete();
			} else if(pArr[i] instanceof Member) {
				Member mem = (Member)pArr[i];
				mem.write();
				mem.read();
				mem.update();
			}
		}
		
	}

}