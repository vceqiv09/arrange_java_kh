package array;

import java.util.Arrays;

public class Array_Exam01 {

	public static void main(String[] args) {
		/*
		 * 배열 크기가 3인 정수 배열을 만들고 3부터 시작하는
		 * 3의 배수 값으로 초기화 후 출력.
		 */
		
		int arr1[] = new int[3];
		for(int i=0; i<3; i++) {
			arr1[i] = (i+1) *3;
		}
		System.out.println(Arrays.toString(arr1));
		
		/*
		 * 배열 크기가 5인 정수 배열을 만들고 5부터 -1씩 감소된 값으로
		 * 초기화 후 출력.
		 */
		
		int arr2[] = new int[5];
		for(int i=5; i>0; i--) {
			arr2[5-i] = i;
		}
		System.out.println(Arrays.toString(arr2));

	}

}