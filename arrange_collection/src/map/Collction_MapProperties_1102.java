package map;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Collction_MapProperties_1102 {

	public static void main(String[] args) {
		/*
		 * Properties
		 * 		- Map이라서 Map에서 사용하는 메서드 사용 가능.
		 */
		Properties prop = new Properties();
		
		File f = new File("D:\\Java\\Develop Tool\\eclipse-jee-2022-09\\configuration\\config.ini");
		// load() : 불러오기?
		try {
			prop.load(new BufferedReader(new FileReader(f)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(prop);
		System.out.println(prop.get("eclipse.application"));
		
		f = new File("D:\\Java\\Develop Tool\\eclipse-jee-2022-09\\configuration\\config.ini.bak");
		// store() : 저장
		try {
			prop.store(new BufferedWriter(new FileWriter(f)), "Comment");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	 }
	
}