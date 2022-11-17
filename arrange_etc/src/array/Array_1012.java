package array;

public class Array_1012 {
	public static void main(String[] args) {
		// 배열
		
		int arr[] = new int[3];
		
		arr[0] = 10;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		for(int i=0; i< arr.length; i++) {
			arr[i] = 10;
		}

		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i]+ "\t");
		}
			
	}
	
}