package io.subStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectSubStream {

	public static void objectSubStream() {
		File f = new File("D:\\Java\\file\\입출력테스트.txt");
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))) {
			Subject s1 = new Subject("국어", 67.8);
			Subject s2 = new Subject("영어", 78.3);
			Subject s3 = new Subject("수학", 82.9);
			
			oos.writeObject(s1);
			oos.writeObject(s2);
			oos.writeObject(s3);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
			Subject s1 = (Subject)ois.readObject();
			Subject s2 = (Subject)ois.readObject();
			Subject s3 = (Subject)ois.readObject();
			
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		/*
		 * 객체 타입 보조 스트림
		 * 		- ObjectInputStream / ObjectOutputStream 이 있으며,
		 * 		  바이트 기반 스트림에 적용하여 사용한다.
		 * 		- 프로그램에서 사용하는 객체 타입을 그대로 입출력에 사용할 수 있도록 하는 기능을 제공한다.
		 */

		objectSubStream();			// 객체 타입 보조 스트림
		
	}
	
}