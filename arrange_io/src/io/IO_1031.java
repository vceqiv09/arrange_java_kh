package io;

import java.io.File;
import java.io.IOException;

public class IO_1031 {

	public static void main(String[] args) {
		/*
		 * 입출력
		 * 		- 컴퓨터 내부/외부 장치간에 데이터를 교환하기 위해 사용
		 * 		- 프로그램을 기준으로 내부/외부 장치에서 데이터가 현재 동작하는
		 * 		  프로그램을 들어오면 입력, 반대로 현재 동작하는 프로그램에서
		 * 		  내부/외부 장치로 내보내면 출력이라고 한다.
		 * 		  (하드디스크의 파일을 프로그램 내에서 사용할 수 있도록 불러올 때는 입력
		 * 		   반대로 프로그램에서 생성한 데이터를 하드디스크의 파일로 내보낼 때에는 출력)
		 * 		- 입출력은 입력스트림, 출력스트림이 개별로 존재하며 입력스트림으로는 입력만
		 * 		  출력스트림으로는 출력만 수행할 수 있다.
		 * 
		 * 스트림(Stream)
		 * 		- 두 장치간에 데이터를 교환하기 위해 생성한 데이터 통로.
		 * 		- 스트림은 입력/출력 스트림으로 나누어져 있고 또한 그 안에서
		 * 		  바이트기반 스트림과 문자기반 스트림으로 나누어져 있다.
		 * 		- 바이트기반 스트림의 경우 이미지, 영상, 실행파일 등의 
		 * 		  바이트기반으로 생성된 데이터를 입출력할 때 사용한다.
		 * 		- 문자기반 스트림의 경우 텍스트 문서 등의 문자기반으로
		 * 		  생성된 데이터를 입출력할 때 사용한다.
		 * 		
		 * 	*** 보통 메모장으로 열리는 것들은 문자기반. 안 열리면 바이트기반
		 */
		File f = new File("D:\\Java\\샘플파일.txt");		// 파일을 다루기 쉽게 해주는 클래스
		
		// length() : 파일 크기?
		System.out.printf("%d Byte\n", f.length());
		
		// lastModified() : 마지막 수정 날짜
		System.out.printf("%1$tY년 %1$tm월 %1$td일에 수정함\n", f.lastModified());
		
		System.out.printf("파일이야? : %s\n", f.isFile());
		System.out.printf("폴더야?  : %s\n", f.isDirectory());
		System.out.printf("숨김이야? : %s\n", f.isHidden());
		
		System.out.printf("파일/폴더명 : %s\n", f.getName());
		System.out.printf("파일/폴더 상위 경로 : %s\n", f.getParent());
		System.out.printf("파일/폴더 전체 경로 : %s\n", f.getPath());
		
		// exists() : 존재 하냐?
		System.out.printf("존재해? : %s\n", f.exists());		// 중간에 경로가 없어도 false 가 뜬다???
		
		File f2 = new File("D:\\Java\\temp");
		
		// mkdir() : 디렉토리 생성, createNewFile() : 파일 생성
		// delete() : 파일이든 폴더는 상관 없이 삭제.
		if(!f2.exists()) {
//			f2.mkdir();
			try {
				f2.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			f2.delete();
		}
		
		
		File f3 = new File("D:\\Java\\parent\\child\\sample.txt");
		
		// mkdirs() : 없는 폴더들 다 만들어준다.
		if(!f3.exists()) {
			File tmpFile = new File(f3.getParent());
			tmpFile.mkdirs();
			try {
				f3.createNewFile();
			} catch(IOException e){
				e.printStackTrace();
			}
		}
		
	}

}