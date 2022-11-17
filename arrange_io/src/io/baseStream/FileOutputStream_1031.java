package io.baseStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_1031 {

	public static void main(String[] args) {
		/*
		 * FileOutputStream(f, true)
		 * 		- 바이트기반 스트림으로 바이트 단위로 파일을 쓴다.
		 * 		- true : 초기화 되지 않고 기존 데이터에 append 된다.
		 */
		File f = new File("D:\\Java\\입출력테스트.txt");
		
		try(FileOutputStream fos = new FileOutputStream(f, true)){
			fos.write(65);		// A
			fos.write(66);		// B
			fos.write(67);		// C
			fos.write(68);		// D
			fos.write(69);		// E
			fos.write("한글문자열".getBytes());		// 이렇게 하면 한글도 쓸 수 있다.
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}