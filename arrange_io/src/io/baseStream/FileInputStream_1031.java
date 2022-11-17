package io.baseStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStream_1031 {

	public static void main(String[] args) {
		/*
		 * FileInputStream
		 * 		- 바이트기반 스트림으로 바이트 단위로 파일을 읽는다.
		 * 
		 * 파일 할 때는 try-catch 문이 꼭 들어간다.
		 * 입출력 스트림은 항상 닫아줘야 한다.
		 * 1Byte 씩 읽으면 한글 못 읽음. 문제 생김.
		 */

		// read() : 반환 타입 int 지만 사실상 byte 로 봐야한다. 1 byte씩 만 읽는다.
		//			-1이 반환 되면 "더 이상 읽을 데이터가 없는 것" 이다.
		// read(buffer) : buffer 크기만큼 읽어서 buffer에 담음
		
		// close() : 
		// try-with-resource : close 작업을 알아서 해준다? 
		// 기준 파일 입출력은 대부분 지원해준다. 모두 지원해주는 건 아니다. 
		// Interface 를 상속하고 있으면 지원해준다. API 문서에서 확인.
		File f = new File("D:\\Java\\입출력테스트.txt");
		
		try(FileInputStream fis = new FileInputStream(f)) {
			byte[] buffer = new byte[8];
			byte[] datas = new byte[(int)f.length()];
			
			int offset = 0;
			while(true) {
				int readByte = fis.read(buffer);
				if(readByte == -1) {
					break;
				}
				System.arraycopy(buffer, 0, datas, offset, readByte);
				offset += readByte;
			}
			System.out.println(Arrays.toString(datas));
			System.out.println(new String(datas));
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일을 찾지 못하였습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일 읽기 작업 중 문제가 발생하였습니다.");
			e.printStackTrace();
		}		
		
	}

}