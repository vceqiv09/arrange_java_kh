package exam.subject2;

/**
 * exam.subject 와 다름
 * 	매 선택마다 "exit" 를 입력하면 한 단계 종료 하는 거 추가함
 */
public class CollectionExam_Final {
	
	public static void main(String[] args) {
		/* 종합문제?
		 * 
		 * 학생들의 성적을 관리하기 위한 프로그램으로 컬렉션과 파일 입출력을 활용하여 만들어 보세요.
		 * 
		 * Student 클래스는 학생의 정보를 담기 위한 클래스로 사용하세요.
		 * 		멤버 필드 : 이름, 학년, 반, 번호
		 * 		멤버 메서드 : getter/setter 생성, hashCode(), equals(), toString() 생성
		 * 
		 * Subject 클래스는 과목 정보를 담기 위한 클래스로 사용하세요.
		 * 		멤버 필드 : 과목명, 점수, 등급
		 * 		멤버 메서드 : getter/setter 생성, hashCode(), equals(), toString() 생성
		 * 
		 * LinkedHashMap 을 기본으로 Key에는 Student 클래스를 사용하고 Value에는 ArrayList를 사용하도록 한다.
		 * ArrayList에는 Subject 클래스를 담아 사용하도록 한다.
		 * 
		 * - 성적 관리 프로그램으로 관리하는 모든 정보는 파일에 저장되어야 하며 다음번에 다시
		 *   프로그램을 실행 했을 때 이전 상태가 저장되어 있어야 한다.
		 * - 파일명은 "학생성적관리정보.info" 로 한다.
		 * 
		 * 
		 * 학생성적관리정보.info
		 * 	홍길동,1,1,24:국어=80,영어=70,수학=80,과학=67
		 * 	김철수,1,1,15:국어=86,영어=93,수학=79,과학=78
		 * 	박종권,1,1,12:국어=80,영어=70,수학=82,과학=82
		 */
		
		Run run = new Run();
		run.start();
		
	}
	
}