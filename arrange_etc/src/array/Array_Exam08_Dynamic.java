package array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array_Exam08_Dynamic {

	public static void main(String[] args) {
		/*
		 * 3행, n열에 해당하는 2차 배열을 만들어보세요.
		 * 	1. n은 사용자 입력을 통해 3~9 사이의 정수를 받아 사용.
		 *  2. 배열에 초기화 하는 데이터는 랜덤을 사용하여 1~99 사이의 값을 저장.
		 */
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int arr[][];
		int n;
		
		// 3 ~ 9 사이의 숫자 입력
		while(true) {
			System.out.print("2차원 배열의 크기가 될 정수를 입력하세요 : ");
			n = sc.nextInt();
			if(n >= 3 && n <= 9) {
				break;
			} else
				System.out.println("다시 입력해주세요. ");
		}
	
		// 동적 배열을 이용해서 해보자
		// 입출력
		
		arr = new int[3][0];
		
		for(int i=0; i<arr.length; i++) {
			int tmp[] = new int[0];
			
			for(int j=0; j<n; j++) {
				int random = rand.nextInt(99)+1;
				tmp = Arrays.copyOf(tmp, tmp.length+1);
				tmp[tmp.length-1] = random;
				
			}
			arr[i] = tmp;
			System.out.println(Arrays.toString(arr[i]));			
		}
	}

}