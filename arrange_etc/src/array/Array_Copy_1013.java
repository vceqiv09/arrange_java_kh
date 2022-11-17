package array;

public class Array_Copy_1013 {
	public static void main(String[] args) {
		// 배열 복사
		// 얕은 복사
		int arr1[] = {1, 2, 3};
		int arr2[] = arr1;		
		arr2[1] = 20;		//arr2[1]만 20으로 바뀌는 것이 아니라 arr1[1]도 20으로 바뀐다.

		System.out.println("얕은 복사\n"+ arr1 +" = "+arr2);
		for(int i=0; i< arr1.length; i++) {
			System.out.printf("arr1[%d] -> %d\tarr2[%d] -> %d\n",
					i, arr1[i], i, arr2[i]);
		}
		System.out.println();
		
		//깊은 복사
		int arr3[] = new int[arr1.length];
		for(int i=0; i<arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		arr3[1] = 200;
		System.out.println("깊은 복사\n"+ arr1 +" != "+arr3);
		for(int i=0; i< arr1.length; i++) {
			System.out.printf("arr1[%d] -> %d\tarr3[%d] -> %d\n",
					i, arr1[i], i, arr3[i]);
		}
			
	}
	
}