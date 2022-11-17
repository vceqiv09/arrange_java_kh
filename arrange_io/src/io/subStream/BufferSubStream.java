package io.subStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferSubStream {

	public static void bufferSubStream() {
		File f = new File("D:\\Java\\file\\입출력테스트.txt");
		
		StringBuilder sb = new StringBuilder();
		try(BufferedReader br = new BufferedReader(new FileReader(f))){
			while(br.ready()) {		// 읽을 상태면 진행.
				sb.append(br.readLine() +"\r\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(f, true))){
			bw.write("버퍼 보조 스트림을 적용하여 입출력");
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(sb.toString());
	}
	
	public static void main(String[] args) {
		/*
		 * 버퍼 보조 스트림
		 * 		- BufferedInputStream / BufferedOutputStream 이 있으며,
		 * 		  바이트 기반 스트림에 적용하여 사용한다.
		 * 		- BufferedReader / BufferedWriter 이 있으며,
		 * 		  문자 기반 스트림에 적용하여 사용한다.
		 * 		- 하드디스크와 메모리 사이의 입출력 속도차를 보완하기 위한 중간 완충 영역을 만들어서
		 * 		  병목현상을 최소화 하여 원활한 입출력이 이루어 질 수 있도록 제공한다. 
		 */

		bufferSubStream();			// 버퍼 보조 스트림
		
	}
	
}