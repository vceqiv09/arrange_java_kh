package loop;

public class Loop_Exam03 {

	public static void main(String[] args) {
		/*
		 * 7부터 시작하여 7의 배수에 해당하는 값을 출력할 때
		 * 150 미만에 출력되는 7의 배수 값과 총 반복 횟수를 출력.
		 */
			
		int count = 0;
		
		for(int i=1; i*7 <= 150; i++) {
			System.out.print(i*7 +" ");
			count++;
		}
		System.out.println("\n총 반복 횟수 : "+ count + "\n");
		
		
		int i = 1;
		count = 0;
		while(i*7 <= 150){
			System.out.print(i*7 +" ");
			i++; count++;
		}
		System.out.println("\n총 반복 횟수 : "+ count);
		
	}
	
}