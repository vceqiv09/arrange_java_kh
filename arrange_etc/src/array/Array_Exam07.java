package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Exam07 {

	public static void main(String[] args) {
		/*
		 * 사용자 입력을 받아서 다음의 기능을 수행하는 코드를 작성.
		 * 1. 입력한 횟수만큼 정수 값을 입력 받아서 배열에 저장.
		 * 2. 배열에 저장된 모든 정수의 합과 평균을 구하여 출력
		 * 3. -1 입력이 들어오면 더 이상 사용자 입력을 받지 않는 것으로 한다.
		 * 
		 * ex)
		 * 		1 번째 정수값 입력 : 7 
		 * 		2 번째 정수값 입력 : 12 
		 * 		3 번째 정수값 입력 : 24 
		 * 		4 번째 정수값 입력 : -1
		 * 
		 *  	총합 : 43
		 *  	평균 : 14.3
		 */
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[0];
		int i = 1, sum = 0;
		double avg;
		while(true){
			System.out.print(i +"번째 정수값 입력 : ");
			int inputNum = sc.nextInt();
			if(inputNum == -1)
				break;
			
			arr = Arrays.copyOf(arr, arr.length+1);
			arr[i-1] = inputNum;
			sum += inputNum;
			i++;
		}
		avg = sum / arr.length;
		System.out.println("총합 : "+ sum +"\n평균 : "+ avg);
		
	}

}