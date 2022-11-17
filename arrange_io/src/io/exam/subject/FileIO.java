package io.exam.subject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
	
	protected static String getData(File f) {
		StringBuilder sb = new StringBuilder();
		try(FileReader fr = new FileReader(f)){
			char[] buffer = new char[8];
				
			while(true) {
				int count = fr.read(buffer);
				if(count == -1) {
					break;
				}
				sb.append(buffer, 0, count);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	protected static void saveData(File f, String data) {
		try(FileWriter fw = new FileWriter(f)){
			fw.write(data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}