package array;

import java.util.Arrays;
import java.util.Random;

public class Array_Exam06 {

	public static void main(String[] args) {
		/*
		 * 	배열의 크기가 0인 정수 배열을 생성 후 난수(Random)를 
		 *  사용하여 0 ~ 100가지의 임의값을 생성 후 배열에 추가. 
		 *  단 홀수의 해당하는 값만 6개 추가하도록 한다.
		 */
		
		Random rand = new Random();
		
		int arr[] = new int[0];
		for(int i=0; i<6;) {
			int random = rand.nextInt(101);

			if(random%2 == 1) {
				arr = Arrays.copyOf(arr, arr.length+1);
				arr[arr.length-1] = random;
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}