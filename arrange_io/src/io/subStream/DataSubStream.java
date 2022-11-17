package io.subStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataSubStream {

	public static void dataSubStream() {
		File f = new File("D:\\Java\\file\\입출력테스트.txt");
		
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(f))) {
			dos.writeInt(100);
			dos.writeDouble(12.5);
			dos.writeBoolean(false);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(DataInputStream dis = new DataInputStream(new FileInputStream(f))) {
			int i = dis.readInt();
			double d = dis.readDouble();
			boolean b = dis.readBoolean();
			
			System.out.println(i + " | " + d + " | " + b);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		/*
		 * 데이터 타입 보조 스트림
		 * 		- DataInputStream / DataOutputStream 이 있으며,
		 * 		  바이트 기반 스트림에 적용하여 사용한다.
		 */

		dataSubStream();			// 데이터 타입 보조 스트림
		
	}
	
}