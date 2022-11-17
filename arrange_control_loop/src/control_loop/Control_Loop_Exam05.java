package control_loop;

public class Control_Loop_Exam05 {

	public static void main(String[] args) {
		/*
		 * 다음과 같은 출력이 나오도록 하시오.
		 * (중첩 for문을 사용하세요.)
		 * 1
		 * 2	3
		 * 4	5	6
		 * 7	8	9	10
		 * 11	12	13	14	15
		 */
		
		int count = 1;
		for(int i=1; i<=5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(count +"\t");
				count++;
			}
			System.out.println();
		}
	
	}
	
}