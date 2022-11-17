package array;

import java.util.Arrays;
import java.util.Random;

public class Array_Exam05 {

	public static void main(String[] args) {
		/*
		 * 	배열의 크기가 0인 정수 배열을 생성 후 난수(Random)를 
		 *  사용하여 0 ~ 100가지의 임의값을 생성 후 배열에 추가. 
		 *  총 6개의 정수 값을 추가하도록 한다.(=배열의 크기를 6까지)
		 */
		
		Random rand = new Random();
		
		int arr[] = new int[0];
		for(int i=0; i<6; i++) {
			int random = rand.nextInt(101);
			
//			//깊은 복사 - Arrays.copyOf();
//			arr = Arrays.copyOf(arr, arr.length+1);
//			arr[arr.length-1] = random;
			
			//깊은 복사 - System.arraycopy();
			int tmp[] = new int[arr.length+1];
			System.arraycopy(arr, 0, tmp, 0, arr.length);
			tmp[tmp.length-1] = random;
			arr = tmp;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}