package exam.subject2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map.Entry;

public class FileSet extends Function {
	
	private File f = new File("D:\\Java\\file\\학생성적관리정보.info.txt");
	private Run run = new Run();
	
	public StringBuilder dataInput() {
		StringBuilder sb = new StringBuilder();
		for(Entry<Student, ArrayList<Subject>> e: run.getDatas().entrySet()) {
			Student stu = e.getKey();
			sb.append(stu.getName() +", ");
			sb.append(stu.getYear() +", ");
			sb.append(stu.getClassRoom() +", ");
			sb.append(stu.getClassNumber() +"\t: ");
			for(Subject sub: e.getValue()) {
				sb.append(sub.getSubName() +"=");
				sb.append(sub.getScore() +", ");
			}
			sb.replace(sb.length()-2, sb.length(), "\r\n");
		}
		return sb;
	}
	
	public void fileLoad() {
		try(BufferedReader br = new BufferedReader(new FileReader(f))){
			while(br.ready()) {
				this.parse(br.readLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileSave() {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(f))){
			bw.write(dataInput().toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void parse(String data) {
		// Student 부분
		String[] stuArr = data.split("\t: ");
		String[] stuInfo = stuArr[0].split(", ");
		Student student = new Student(stuInfo[0], 
				Integer.valueOf(stuInfo[1]),
				Integer.valueOf(stuInfo[2]),
				Integer.valueOf(stuInfo[3]));
		
		// Subject 부분
		ArrayList<Subject> subjectList = new ArrayList<Subject>();
		String[] subArr = stuArr[1].split(", ");
		for(int i=0; i<subArr.length; i++) {
			String[] subInfo = subArr[i].split("=");
			subjectList.add(new Subject(subInfo[0], Integer.valueOf(subInfo[1])));
		}
		
		run.getDatas().put(student, subjectList);
	}
	
}