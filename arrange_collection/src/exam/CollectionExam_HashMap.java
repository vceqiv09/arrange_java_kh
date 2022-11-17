package exam;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Map.Entry;

public class CollectionExam_HashMap {
	
	public static void main(String[] args) {
		/*
		 * 과목 정보를 담기위한 HashMap 컬렉션을 사용해 보세요.
		 * 다음이 과목명과 과목 점수가 HashMap 에 저장될 수 있게 하세요.
		 * 
		 * 과목명 : 국어, 영어, 수학, 과학, 사회, 체육, 미술
		 * 
		 * 과목명은 Key가 됩니다.
		 * 과목 점수는 Value가 되며, Score 객체로 임의의 점수와 등급이 저장되게 합니다.
		 * 
		 * 모든 정보를 입력 후에는 평균과 총점을 구해서 출력하세요.
		 */
		HashSet<String> subName = new HashSet<String>();
		subName.add("국어");	 subName.add("영어");
		subName.add("수학");	 subName.add("과학");
		subName.add("사회");	 subName.add("체육");
		subName.add("미술");
		
		HashMap<String, Score> datas = new HashMap<String, Score>();
		Random rand = new Random();
		
		for(String subjects: subName) {
			double random = Double.valueOf(rand.nextInt(40) * rand.nextDouble()+60);
			datas.put(subjects, new Score(random));
		}
		
		double sum = 0, avg = 0;
		for(Entry<String, Score> e: datas.entrySet()) {
			System.out.printf("과목 : %s\t점수 : %.1f\t등급 : %c\n", e.getKey(), e.getValue().getScore(), e.getValue().getGrade());
			sum += e.getValue().getScore();
		}
		avg = sum / datas.size();
		System.out.printf("합계 : %.2f\t평균 : %.2f", sum, avg);
		
	}

}