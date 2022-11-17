package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Exam04_Duplicate {

	public static void main(String[] args) {
		/*
		 * Exam04.java 파일을 생성 후 다음의 문제를 풀어보세요.
		 * Exam03.java 와 동일한 과정으로 배열을 생성할 때
		 * 중복된 값이 없도록 초기화 하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("2 ~ 5 사이의 정수 값 입력 : ");
			int size = sc.nextInt();
			
			if(size >= 2 && size <= 5) {
				int arr[] = new int[size];
				
				for(int i=0; i<arr.length; i++) {
					System.out.print("1 ~ 10 사이의 값 입력 : ");
					int inputNum = sc.nextInt();
					
					if(inputNum >= 1 && inputNum <= 10) {
						arr[i] = inputNum;
						for(int j=0; j<i; j++) {
							if(arr[j] == inputNum) {
								System.out.println("중복입니다. 다시 입력해주세요.");
								i--;
								break;
							}
						}
					} else {
						System.out.println("다시 입력해주세요.");
						i--;
					}
				}
				System.out.println(Arrays.toString(arr));
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}

	}

}