package array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array_Exam08_1 {

	public static void main(String[] args) {
		/*
		 * 3행, n열에 해당하는 2차 배열을 만들어보세요.
		 * 	1. n은 사용자 입력을 통해 3~9 사이의 정수를 받아 사용.
		 *  2. 배열에 초기화 하는 데이터는 랜덤을 사용하여 1~99 사이의 값을 저장.
		 */
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
				
		while(true) {
			System.out.print("2차원 배열의 크기가 될 정수를 입력하세요 : ");
			int n = sc.nextInt();
			
			if(n >=3 && n <= 9) {
				int arr[][] = new int[3][n];
				for(int i=0; i<arr.length; i++) {
					for(int j=0; j<arr[i].length; j++) {
						arr[i][j] = rand.nextInt(99)+1;
					}
					System.out.println(Arrays.toString(arr[i]));
				}
				break;
			} else {
				System.out.println("3 ~ 9 사이의 값이 아닙니다.");
			}
		}
		
	}

}