package io.exam.weekend;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class FileIO {
	
	protected static String getYearMonth(File f1) {
		String data = "";
		
		try(FileInputStream fis = new FileInputStream(f1)){
			byte[] buffer = new byte[(int)f1.length()];
			fis.read(buffer);
			data = new String(buffer);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
	
	protected static void saveData(File f2, String data) {
		try(FileWriter fw = new FileWriter(f2)){
			fw.write(data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}