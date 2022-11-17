package array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array_Exam09 {

	public static void main(String[] args) {
		/*
		 * 1번 문제
		 * 	A. 3~10 사이의 랜덤값을 생성하면 이것을 1차 배열의 크기로 사용.	(=행)
		 *  B. 1차 배열의 크기가 정해지면 다시 5~10 사이의 랜덤값을 생성하고	(=열)
		 *     이것을 2차 배열의 크기로 사용.
		 *  C. 2차 배열까지의 크기가 정해지면 다시 10~99 사이의 랜덤값을 생성하고
		 *     이것을 2차 배열에 초기값으로 사용한다.
		 *  D. C에서 만들어진 2차 배열을 전체 탐색을 통해서 짝수는 별도의 짝수 배열에
		 *     홀수는 별도의 홀수 배열에 저장한다.
		 *  E. D에서 만든 짝수, 홀수 배열의 동일한 위치에 있는 정수 값들의 합을 구하고
		 *     구해진 합들만을 저장한 배열을 만든다.
		 *     (짝수와 홀수의 개수가 다른 경우 수량이 더 많은 배열을 기준으로 자기 자신의
		 *      합을 구하여 저장하도록 한다.)
		 *      ex) 짝 : {6, 8, 4, 2}
		 *      	홀 : {3, 7}
		 *      	합 : {9, 15, 8, 4}
		 */
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int row, col, random;
		int arr[][];
		
		// A
//		row = rand.nextInt(8)+3;
		row = rand.nextInt(3)+2;
		arr = new int[row][];
		
		// B
		for(int i=0; i<arr.length; i++) {
//			col = rand.nextInt(6)+5;
			col = rand.nextInt(3)+2;
			arr[i] = new int[col];
		}
		
		// C
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				random = rand.nextInt(90)+10;
				arr[i][j] = random;
			}
		}
		
		// D
		int odd[] = new int[0];
		int even[] = new int[0];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j] % 2 != 0) {
					odd = Arrays.copyOf(odd, odd.length+1);
					odd[odd.length-1] = arr[i][j];
				} else {
					even = Arrays.copyOf(even, even.length+1);
					even[even.length-1] = arr[i][j];
				}
			}
		}
		
		// E
		int sum[], tmp[];
		if(odd.length >= even.length) {
			sum = Arrays.copyOf(odd, odd.length);
			tmp = Arrays.copyOf(even, odd.length);
		} else {
			sum = Arrays.copyOf(even, even.length);
			tmp = Arrays.copyOf(odd, even.length);
		}
		
		for(int i=0; i<sum.length; i++) {
			if(tmp[i] != 0)
				sum[i] += tmp[i];
			else
				sum[i] *= 2;
		}

		System.out.println(Arrays.toString(odd));
		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(sum));
		
	}

}