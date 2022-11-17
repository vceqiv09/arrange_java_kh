package array;

import java.util.Scanner;

public class Array_Dynamic_1013 {

	public static void main(String[] args) {
		// 동적 배열
		
		Scanner sc = new Scanner(System.in);
		
		int arr1[] = new int[3];
		arr1[0] = 1; arr1[1] = 2; arr1[2] = 3;
		
		for(int i=0; i<3; i++) {
			System.out.print("정수값 입력 : ");
			int num = sc.nextInt();
			int tmp[] = new int[arr1.length + 1];
			
			for(int j=0; j<arr1.length; j++) {
				tmp[j] = arr1[j];
			}
			tmp[tmp.length - 1] = num;
			arr1 = tmp;
			
			System.out.println("값을 배열 arr1에 추가.");
		}
		
		for(int i=0; i<arr1.length; i++) {
			System.out.printf("%d\t", arr1[i]);
		}

	}

}