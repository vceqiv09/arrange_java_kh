package usefulCode;

import java.util.Arrays;

/**
 * 중복 값이 몇개인지 구하는 메서드
 * @author vceqiv
 *
 */
public class DuplicatedNumber {

	public static void main(String[] args) {
		int[] numbers = {1, 1, 2, 3, 4, 5};
		
		DuplicatedNumber d = new DuplicatedNumber();
		System.out.println(d.solution(numbers, 1));
	}
	
	public int solution(int[] array, int n) {
		return (int) Arrays.stream(array).filter(i -> i == n).count();
	}

//	// 나보다 키 큰 사람 몇 명?
//    public int solution(int[] array, int height) {
//        return (int) Arrays.stream(array).filter(value -> value > height).count();
//    }
}