package object.exam.student;

import java.util.Scanner;

public class Run {

	private Scanner sc = new Scanner(System.in);
	private Student stu = new Student("홍길동");
	
	private void printMenu() {
		System.out.println("<<< "+ stu.getName() +" 학생 성적 관리 메뉴 >>>");
		System.out.println("1. 성적표 출력");
		System.out.println("2. 과목 성적 출력");
		System.out.println("3. 과목 성적 추가");
		System.out.println("4. 과목 성적 수정");
		System.out.println("5. 과목 성적 삭제");
		System.out.println("6. 프로그램 종료");
	}
	
	private void select(int num) {
		switch(num) {
		case 1:			// 성적표 출력기능을 수행하는 메서드 호출
			System.out.println(stu.allSubPrint());
			break;
		case 2:			// 과목 성적 출력을 수행하는 메서드 호출
			stu.oneSubPrint();
			break;
		case 3:			// 과목 성적 추가 기능을 수행하는 메서드 호출
			stu.addSubject();
			break;
		case 4:			// 과목 성적 수정 기능을 수행하는 메서드 호출
			stu.updateSubject();
			break;
		case 5:			// 과목 성적 삭제 기능을 수행하는 메서드 호출
			stu.deleteSubject();
			break;
		case 6:
			System.out.println("프로그램이 종료 됩니다.");
			System.exit(0);		// 프로그램 종료
			break;
		default:		// 메뉴 번호를 잘못 입력했을 경우
				
		}
	}
		
	public void start() {	
		while(true){
			this.printMenu();
			System.out.print("메뉴 번호 입력 : ");
			int num = sc.nextInt();		sc.nextLine();
			System.out.println();
			
			this.select(num);
			
			System.out.println("\n초기 메뉴로 돌아가려면 Enter 입력!");
			sc.nextLine();
		}
	}

}