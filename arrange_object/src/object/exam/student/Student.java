package object.exam.student;

import java.util.Arrays;
import java.util.Scanner;

public class Student {

	private Scanner sc = new Scanner(System.in);
	
	private Subject sub[];		// 
	private String name;		// 이름
	private int level;			// 학년
	
	public Student(String name) {
		sub = new Subject[]{
				new Subject("국어", 95), new Subject("수학", 90), new Subject("사회", 85),
				new Subject("과학", 80), new Subject("영어", 75)
		};
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	// 1. 성적표 출력
	public String allSubPrint() {
		int sum = 0;
		double avg = 0;
		String str = "과목\t점수\t등급\n";
		
		for(int i=0; i<this.sub.length; i++) {
			str += String.format("%s\t%.2f\t%c\n", this.sub[i].subName, 
					this.sub[i].score, this.sub[i].getGrade(this.sub[i].score));
			sum += this.sub[i].score;
		}
		avg = sum / this.sub.length;
		str += "평균\t"+ avg +"\t"+ this.sub[this.sub.length-1].getGrade(avg);
		
		return str;
	}
	
	// 2. 과목 성적 출력
	public void oneSubPrint() {
		while(true) {
			System.out.print("성적 출력 할 과목명 : ");
			String subName = sc.nextLine();
			
			int findSub = findSubName(subName);
			if(findSub == -2) {			// subName == "exit"
				break;
			} else if(findSub == -1) {	// 존재x
				System.out.println("출력 할 과목이 존재하지 않습니다.\n");
			} else if(findSub != -1) {	// 점수 출력
				System.out.println(subName +" 점수 : "+ 
							this.sub[findSub].score +"\n");
			}
		}
	}
	
	// 3. 과목 성적 추가
	public void addSubject() {
		while(true) {
			System.out.print("추가 할 과목명 : ");
			String subName = sc.nextLine();
			
			int findSub = findSubName(subName);
			if(findSub == -2) {			// subName == "exit"
				break;
			} else if(findSub != -1) {	// subName 중복
				System.out.println("이미 존재하는 과목 정보 입니다.\n");
			} else if(findSub == -1) {	// 과목, 점수 추가
				double score;
				while(true) {
					System.out.print(subName +"성적 입력(0 ~ 100) : ");
					score = sc.nextDouble();		sc.nextLine();
					
					if(score >= 0 && score <= 100)
						break;
					System.out.println("0 ~ 100 사이의 값만 입력해주세요.\n");
				}
				System.out.println();
				
				this.sub = Arrays.copyOf(this.sub, this.sub.length+1);
				this.sub[this.sub.length-1] = new Subject(subName, score);
			}
		}
	}
	
	// 4. 과목 성적 수정
	public void updateSubject() {
		while(true) {
			System.out.print("수정 할 과목명 : ");
			String subName = sc.nextLine();
			
			int findSub = findSubName(subName);
			if(findSub == -2) {			// subName == "exit"
				break;
			} else if(findSub == -1) {	// 존재x
				System.out.println("수정 할 과목이 존재하지 않습니다.\n");
			} else if(findSub != -1) {	// 점수 수정
				double score;
				while(true) {
					System.out.print(subName +" 성적 입력(0 ~ 100) : ");
					score = sc.nextDouble();		sc.nextLine();
					
					if(score >= 0 && score <= 100)
						break;
					System.out.println("0 ~ 100 사이의 값만 입력해주세요.\n");
				}
				System.out.println();
				this.sub[findSub].score = score;
			}
		}
	}
	
	// 5. 과목 성적 삭제
	public void deleteSubject() {
		while(true) {
			System.out.print("삭제 할 과목명 : ");
			String subName = sc.nextLine();
			
			int findSub = findSubName(subName);
			if(findSub == -2) {			// subName == "exit"
				break;
			} else if(findSub == -1) {	// 존재x
				System.out.println("삭제 할 과목이 존재하지 않습니다.\n");
			} else if(findSub != -1) {	// 과목 삭제
				for(int i=findSub; i<this.sub.length-1; i++) {
					this.sub[i] = this.sub[i+1];
				}
				this.sub = Arrays.copyOf(this.sub, this.sub.length-1);
				System.out.println(subName +" 삭제 완료 되었습니다.\n");
			}
		}
	}
	
	// 과목 찾는 메서드
	public int findSubName(String subName) {
		for(int i=0; i<this.sub.length; i++) {
			if(this.sub[i].subName.equals(subName)) {
				return i;
			}
		}
		if(subName.equals("exit"))
			return -2;
		return -1;
	}
	
}