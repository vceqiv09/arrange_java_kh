package io.baseStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_1031 {

	public static void main(String[] args) {
		/*
		 * FileWriter(f, true)
		 * 		- 문자기반 입력스트림으로 문자 단위로 파일을 쓴다.
		 * 		- true : 초기화 되지 않고 기존 데이터에 append 된다.
		 * 
		 */
		File f = new File("D:\\Java\\입출력테스트.txt");
		
		try(FileWriter fw = new FileWriter(f, true)){
			fw.write("문자기반 출력");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}