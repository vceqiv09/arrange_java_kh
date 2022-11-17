package io.baseStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_1031 {

	public static void main(String[] args) {
		/*
		 * FileReader
		 * 		- 문자기반 입력스트림으로 문자 단위로 파일을 읽는다.
		 * 
		 */
		File f = new File("D:\\Java\\입출력테스트.txt");
		
		try(FileReader fr = new FileReader(f)){
			char[] buffer = new char[8];
			StringBuilder sb = new StringBuilder(64);

			while(true){
				int readChar = fr.read(buffer);
				if(readChar == -1) {
					break;
				}
				sb.append(buffer, 0, readChar);
			}
			System.out.println(sb.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}