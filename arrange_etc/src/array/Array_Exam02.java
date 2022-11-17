package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Exam02 {

	public static void main(String[] args) {
		/*
		 * Exam02.java 파일을 생성 후 다음의 문제를 풀어보세요.
		 * 사용자 입력으로 5~10 사이의 정수 값을 입력 받아
		 * 입력 받은 정수값과 동일한 크기의 배열을 생성.
		 * 배열의 값은 -1로 초기화
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("5 ~ 10 사이의 정수 값 입력 : ");
		int size = sc.nextInt();
		if(size >= 5 && size <= 10) {
			int arr[] = new int[size];		
			for(int i=0; i<arr.length; i++) {
				arr[i] = -1;
			}
			System.out.println(Arrays.toString(arr));
		} else {
			System.out.println("5 ~ 10 사이의 정수가 아닙니다.");
		}

	}

}