package io.exam.subject;

import java.io.File;
import java.util.Scanner;

public class IOExam_Subject2 extends FileIO {
	
	public static void main(String[] args){
		/*
		 * subject2.list 파일에 작성된 과목명을 이용하여 subjects[] 을
		 * 생성하도록 하는 코드를 작성한다.
		 * 
		 * subject2.list 파일에는 다음과 같은 형식으로 과목명이 나열되어 있다.
		 * 
		 * subject2.list 파일
		 * 		국어:87,영어:79,수학:67,과학:92,사회:84,체육:95,미술:86
		 * 
		 * 점수 가져와서 점수 변경할겁니까? 변경하거나 변경하지 않거나 해서 다시 저장.
		 */
		Scanner sc = new Scanner(System.in);
		
		File f = new File("D:\\Java\\file\\subject2.list.txt");
		
		// 가져온 데이터 나누고 Subject 클래스 배열에 저장
		String strArr[] = getData(f).split(", ");
		Subject subjects[] = new Subject[strArr.length];
		String str = "<<변경 전>>\n";
		for(int i=0; i<strArr.length; i++) {
			String data[] = strArr[i].split(":");
			subjects[i] = new Subject(data[0], Double.parseDouble(data[1]));
			str += subjects[i].getName() +":"+ subjects[i].getScore() +"\n";
		}
		System.out.println(str);
		str ="<<변경 후>>\n";
		
		// 점수 변경 후 Subject 클래스 배열에 저장
		for(int i=0; i<strArr.length; i++) {
			System.out.print(subjects[i].getName() +" 점수 변경(No : -1) : ");
			int updateScore = sc.nextInt();		sc.nextLine();
			
			if(updateScore != -1) {
				subjects[i].setScore(updateScore);
			}
			str += subjects[i].getName() +":"+ subjects[i].getScore() +", ";
		}
		sc.close();
		str = str.substring(0, str.length()-2);
		System.out.println(str);
		
		str = str.replace("\n<<변경 후>>\n", "");
		saveData(f, str);
	}

}