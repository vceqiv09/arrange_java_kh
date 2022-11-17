package io.subStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CharSubStream {

	public static void charSubStream() {
		File f = new File("D:\\Java\\file\\입출력테스트.txt");
		
		StringBuilder sb = new StringBuilder(128);
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream(f))){
			char[] buffer = new char[8];
			while(true) {
				int readCount = isr.read(buffer);
				if(readCount == -1) {
					break;
				}
				sb.append(buffer, 0, readCount);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(f, true))){	// CP949 : 인코딩.
			osw.write("문자열을 그대로 출력에 사용\r\n");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(sb.toString());
	}
	
	public static void main(String[] args) {
		/*
		 * 보조 스트림 
		 * 		- 입/출력에서 사용하는 기반(바이트, 문자기반) 스트림을 보조하는 역할을 수행하는 스트림
		 * 		- 보조 스트림을 사용하기 위해서는 반드시 기반 스트림과 같이 사용해야 한다.
		 * 		- 보조 스트림은 기반 스트림의 성능 향상 또는 추가 기능을 제공하여 입출력을
		 * 		  보다 효율적으로 사용하기 위한 용도로 쓰인다.
		 * 
		 * 문자 보조 스트림
		 * 		- InputStreamReader / OutputStreamWriter 이 있으며, 
		 * 		  바이트 기반 스트림에 적용하여 사용한다.
		 * 		- 바이트 데이터를 문자 데이터로 변환하는 기능을 제공한다.
		 * 		- OutputStreamWriter(new FileOutputStream(f), "CP949") -> "CP949" : 인코딩 바꾼거.
		 */

		charSubStream();			// 문자 보조 스트림
		
	}
	
}