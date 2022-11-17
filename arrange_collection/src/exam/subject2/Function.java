package exam.subject2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map.Entry;
import java.util.Scanner;

public class Function {
	
	private static final String objStudent = "STUDENT";
	private static final String objSubject = "SUBJECT";
	
	private static FileSet fs = new FileSet();
	private static Run run = new Run();
	
	private static Scanner sc = new Scanner(System.in);
	
	String findAll() {
		StringBuilder sb = fs.dataInput();
		return sb.toString();
	}
	
	void findStudent() {
		while(true) {
			System.out.print("찾을 학생 이름 : ");
			String stuName = sc.nextLine();
			int indexStu = findName(objStudent, stuName);
			
			if(indexStu == -2) {
				System.out.println();
				break;
			} else if(indexStu == -1) {
				System.out.println("존재하지 않는 학생입니다.\n");
			} else if(indexStu != -1) {
				int j = 0;
				for(Entry<Student, ArrayList<Subject>> e: run.getDatas().entrySet()){
					if(indexStu == j) {
						String stuInfo = e.getValue().toString().replace("[", "").replace("]", "점");
						stuInfo = stuInfo.replace("=", " ").replace(",", "점,");
						System.out.println(stuInfo +"\n");
						break;
					}
					j++;
				}
			}
		}
	}
	
	void inputStudent() {
		while(true) {
			System.out.println(findAll());
			System.out.print("추가할 학생의 이름을 입력 : ");
			String stuName = sc.nextLine();
			int indexStu = findName(objStudent, stuName);
			
			if(indexStu == -2) {
				System.out.println();
				break;
			} else if(indexStu != -1) {
				System.out.println("이미 존재하는 학생입니다.\n");
			} else if(indexStu == -1) {
				while(true) {
					Student addStudent = null;
					ArrayList<Subject> addSubject = new ArrayList<Subject>();
					
					System.out.print(stuName +" 학생의 학년, 반, 번호 입력 : ");
					String[] stuArr = sc.nextLine().split(" ");
					if(stuArr[0].equals("exit")) {
						System.out.println();
						break;
					}
					
					int year = Integer.valueOf(stuArr[0]);
					int classRoom = Integer.valueOf(stuArr[1]);
					int classNumber = Integer.valueOf(stuArr[2]);
					
					int i=0;
					for(Entry<Student, ArrayList<Subject>> e: run.getDatas().entrySet()) {
						if(e.getKey().equals(new Student(stuName, year, classRoom, classNumber))) {
							System.out.println("이미 존재하는 학년, 반, 번호 입니다.\n");
							break;
						}
						i++;
					}
					if(i == run.getDatas().size()) {
						addStudent = new Student(stuName, year, classRoom, classNumber);
					} else if(i != run.getDatas().size()) {
						continue;
					}
					
					String[] subName = {"국어", "영어", "수학", "과학"};
					System.out.print(stuName +" 학생의 성적(국어, 영어, 수학, 과학) : ");
					String[] score = sc.nextLine().split(" ");
					if(score[0].equals("exit")) {
						System.out.println();
						continue;
					}
					for(int j=0; j<score.length; j++) {
						addSubject.add(new Subject(subName[j], Integer.valueOf(score[j])));
					}
					System.out.println();
					
					run.setDatas(addStudent, addSubject);
					fs.fileSave();
					break;
				}
			}
		}
	}
	
	void updateScore() {
		while(true) {
			System.out.println(findAll());
			System.out.print("성적 수정할 학생 이름 입력 : ");
			String stuName = sc.nextLine();
			int indexStu = findName(objStudent, stuName);
			
			if(indexStu == -2) {
				System.out.println();
				break;
			} else if(indexStu == -1) {
				System.out.println("존재하지 않는 학생입니다.\n");
			} else if(indexStu != -1) {
				while(true) {
					int i = 0;
					for(Entry<Student, ArrayList<Subject>> e: run.getDatas().entrySet()){
						if(indexStu == i) {
							String stuInfo = e.getValue().toString().replace("[", "").replace("]", "점");
							stuInfo = stuInfo.replace("=", " ").replace(",", "점,");
							System.out.println(stuInfo +"\n");
							break;
						}
						i++;
					}
					
					System.out.print("수정할 과목 입력 : ");
					String subName = sc.nextLine();
					int indexSub = findName(objSubject, subName);
					
					if(indexSub == -2) {
						System.out.println();
						break;
					} else if(indexSub == -1) {
						System.out.println("존재하지 않는 과목입니다.\n");
					} else if(indexSub != -1) {
						System.out.print(subName +" 점수 : ");
						String score = sc.nextLine();
						System.out.println();
						if(score.equals("exit")) {
							break;
						}
						
						int j = 0;
						for(Entry<Student, ArrayList<Subject>> e: run.getDatas().entrySet()) {
							if(indexStu ==j) {
								e.getValue().get(indexSub).setScore(Integer.valueOf(score));
								fs.fileSave();
								break;
							}
							j++;
						}
					}
				}
			}
		}
	}
	
	void deleteStudent() {
		while(true) {
			System.out.println(findAll());
			System.out.print("삭제할 학생의 이름 입력 : ");
			String stuName = sc.nextLine();
			int indexStu = findName(objStudent, stuName);
			
			if(indexStu == -2) {
				System.out.println();
				break;
			} else if(indexStu == -1) {
				System.out.println("존재하지 않는 학생입니다.\n");
			} else if(indexStu != -1) {
				int i = 0;
				for(Entry<Student, ArrayList<Subject>> e: run.getDatas().entrySet()) {
					if(indexStu == i) {
						run.getDatas().remove(e.getKey());
						System.out.println("삭제 되었습니다.\n");
						fs.fileSave();
						break;
					}
					i++;
				}
			}
		}
	}
	
	private int findName(String obj, String name) {
		int i = 0;
		for(Entry<Student, ArrayList<Subject>> e: run.getDatas().entrySet()) {
			if(name.equals("exit")) {
				return -2;
			}
			if(obj.equals(objStudent)) {
				if(name.equals(e.getKey().getName())) {
					return i;
				}
			} else if(obj.equals(objSubject)) {
				int j = 0;
				String subject[] = new String[0];
				for(Subject sub: e.getValue()) {
					subject = Arrays.copyOf(subject, subject.length+1);
					subject[j++] = sub.getSubName();
				}
				for(int n=0; n<subject.length; n++) {
					if(name.equals(e.getValue().get(n).getSubName())) {
						return n;
					}
				}
			}
			i++;
		}
		
		return -1;
	}
	
}