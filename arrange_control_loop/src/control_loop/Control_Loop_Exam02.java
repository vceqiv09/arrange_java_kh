package control_loop;

import java.util.Scanner;

public class Control_Loop_Exam02 {

	public static void main(String[] args) {
		/*
		 * 사용자 입력을 활용하여 사용자가 입력한 2개의 정수값 n, m을
		 * n ~ m 까지의 반복 또는 m ~ n 까지의 반복을 수행하는 코드 작성.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n, m;
		System.out.print("첫 번째 정수 입력 : ");
		n = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		m = sc.nextInt();
		
		int min = n, max = m;					// if(n >= m) {
		min = n >= m ? m : n;					//	   min = m; max = n;
		max = n >= m ? n : m;					// }
		
		for(int i=min; i<=max; i++) {
			System.out.print(i +" ");
		}
		
//		for(int i=n; i<=m; i++) {
//			System.out.print(i +" ");
//		}
//		if(n >= m) {
//			for(int i=m; i<=n; i++) {
//				System.out.print(i +" ");
//			}
//		}
	
	}
	
}