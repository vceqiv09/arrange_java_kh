package string.exam.split;

import java.util.Arrays;
import java.util.Scanner;

public class StringExam_split01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String strArr[][] = new String[0][];
		
		while(true) {
			String input = sc.nextLine();
			if(input.contains("exit")) {
				break;
			} else {
				String arr[] = input.split(" ");
				strArr = Arrays.copyOf(strArr, strArr.length+1);
				strArr[strArr.length-1] = arr;
			}
		}
		
		for(int i=0; i<strArr.length; i++) {
			System.out.println(Arrays.toString(strArr[i]));
		}
		
	}
}