package usefulCode;

import java.util.Arrays;

/**
 * 평균값 구하는 Arrays의 메서드?
 * @author vceqiv
 *
 */
public class Average {
	
	public static void main(String[] agrs) {
//		int[] numbers = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		Average t = new Average();
		System.out.println(t.solution(numbers));
	}
	
	// 평균값 구하는 Arrays 의 메서드?
	public double solution(int[] numbers) {
		return Arrays.stream(numbers).average().orElse(0);
	}
}
