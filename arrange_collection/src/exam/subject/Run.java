package exam.subject;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Run {
	
	private static FileSet fs = new FileSet();
	private static Function func = new Function();
	
	private static Scanner sc = new Scanner(System.in);
	private static LinkedHashMap<Student, ArrayList<Subject>> datas = new LinkedHashMap<Student, ArrayList<Subject>>();
	
	public LinkedHashMap<Student, ArrayList<Subject>> getDatas(){
		return datas;
	}
	public void setDatas(Student student, ArrayList<Subject> subject){
		datas.put(student, subject);
	}
	
	public void start() {
		while(true) {
			fs.fileLoad();
			printMenu();
			System.out.print("메뉴 선택 : ");
			int menuNumber = sc.nextInt();	sc.nextLine();
			System.out.println();
			
			select(menuNumber);
		}
	}
	private void printMenu() {
		String menu = "";
		menu += "<<학생 성적 관리 프로그램>>\n"
			 + "[1] 전체 조회\n"
			 + "[2] 학생 검색\n"
			 + "[3] 학생 추가\n"
			 + "[4] 성적 수정\n"
			 + "[5] 학생 삭제\n"
			 + "[6] 프로그램 종료\n";
		System.out.println(menu);
	}
	private void select(int menuNumber) {
		switch(menuNumber) {
		case 1:		// 전체 조회
			System.out.println(func.findAll());	break;
		case 2:		// 학생 검색
			func.findStudent();					break;
		case 3:		// 학생 추가
			func.inputStudent();				break;
		case 4:		// 성적 수정
			func.updateScore();					break;
		case 5:		// 성적 수정
			func.deleteStudent();				break;
		case 6:		// 프로그램 종료
		default:
			System.exit(0);		break;
		}
	}
	
}