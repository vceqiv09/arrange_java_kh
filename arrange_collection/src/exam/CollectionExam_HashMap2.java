package exam;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Random;

public class CollectionExam_HashMap2 {
	
	public static void main(String[] args) {
		/*
		 * 컬렉션에 다른 컬렉션을 담아서 (2차 배열처럼) 사용하기
		 * 
		 * ArrayList에 과목정보들이 있는 LinkedHashMap 컬렉션을 담아서 사용해보세요.
		 * LinkedHashMap에는 다음의 과목명과 과목점수가 저장될 수 있게 하세요.
		 * 
		 * 과목명 : 국어, 영어, 수학, 과학, 사회, 체육, 미술
		 * 
		 * 과목명은 Key가 됩니다.
		 * 과목 점수는 Value가 되며, Score 객체로 임의의 점수와 등급이 저장되게 합니다.
		 * 
		 * 총 5개의 LinkedHashMap을 ArrayList에 담아 놓고 ArrayList에 있는 LinkedHashMap 별로
		 * 평균과 총점을 구해서 출력하세요.
		 */

		ArrayList<String> subName = new ArrayList<String>();
		subName.add("국어");	 subName.add("영어");
		subName.add("수학");	 subName.add("과학");
		subName.add("사회");	 subName.add("체육");
		subName.add("미술");
		
		ArrayList<LinkedHashMap<String, Score>> datas = new ArrayList<LinkedHashMap<String, Score>>(); 
		Random rand = new Random();
		
		for(int i=0; i<5; i++) {
			System.out.println("------------------"+ (i+1) +"번째------------------");
			
			// 과목 정보 넣기
			LinkedHashMap<String, Score> subject = new LinkedHashMap<String, Score>();
			for(String sub: subName) {
				Double random = Double.valueOf(rand.nextInt(40) * rand.nextDouble() + 60);
				subject.put(sub, new Score(random));
			}
			
			// 합계, 평균 구하기, 출력
			double sum = 0, avg = 0;
			for(Entry<String, Score> sub: subject.entrySet()) {
				System.out.printf("과목 : %s\t점수 : %.2f\t등급 : %c\n",
					sub.getKey(), sub.getValue().getScore(), sub.getValue().getGrade());
				sum += sub.getValue().getScore();
			}
			avg = sum / subject.size();
			
			subject.put("합계", new Score(sum));
			subject.put("평균", new Score(avg));
			System.out.printf("합계 : %.2f\t평균 : %.2f\t평균 등급 : %c\n\n", sum, avg, new Score(avg).getGrade());
			datas.add(subject);
		}
		
	}
	
}