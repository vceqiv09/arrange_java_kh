package array;

import java.util.Arrays;
import java.util.Random;

public class Array_DeepCopy_1013 {

	public static void main(String[] args) {
		/* 
		 * 깊은 복사
		 * 	1. 반복문을 사용한 깊은 복사
		 * 	2. System.arraycopy(...) 를 사용한 깊은 복사
		 *  3. Arrays.copyOf(...) 를 사용한 깊은 복사
		 *  4. 배열변수명.clone() 을 사용한 깊은 복사
		 */

		int arr[] = new int [] {1, 2, 3, 4};
		
		// 1. 반복문을 사용한 깊은 복사
		int arr1[] = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			arr1[i] = arr[i];
		}
		
		// 2. System.arraycopy(...)
		int arr2[] = new int[arr1.length];
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		
		System.out.println(arr +"\t"+ arr2);
		for(int i=0; i<arr2.length; i++) {
			System.out.printf("arr[%d] = %d\tarr2[%d] = %d\n",
					i, arr[i], i, arr2[i]);
		}
		
		// 3. Arrays.copyOf(...) 를 사용한 깊은 복사
		int arr3[];
		arr3 = Arrays.copyOf(arr, arr.length);	//copyOf( , int newLength)
												// int newLength : 원본 배열 크기보다 크게 작게 다 가능 
		System.out.println(arr +"\t"+ arr3);
		for(int i=0; i<arr3.length; i++) {
			System.out.printf("arr[%d] = %d\tarr3[%d] = %d\n",
					i, arr[i], i, arr3[i]);
		}
		
		// 4. 배열변수명.clone() 을 사용한 깊은 복사
		int arr4[] = arr.clone();
		
		System.out.println(arr +"\t"+ arr4);
		for(int i=0; i<arr4.length; i++) {
			System.out.printf("arr[%d] = %d\tarr4[%d] = %d\n",
					i, arr[i], i, arr4[i]);
		}
	}

}