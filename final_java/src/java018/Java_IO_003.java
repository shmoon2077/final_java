package java018;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Java_IO_003 {
	public static void main(String[] args) {
		//#1. 경로
		String folder_rel="src/java018/";
		String file_rel="file003.txt";
		
		File folder = new File (folder_rel);
		File file = new File (folder_rel+file_rel);
		
		//#2. 파일 만들기
		try {
			if(!folder.exists()) {folder.mkdir();};
			if(!file.exists()) {file.createNewFile();}
		} catch (Exception e) {e.printStackTrace();}
			
		
		
		//#3. char 쓰기    Reader / Writer 
		
		
		try {
		Writer writer = new FileWriter(file);
		writer.write("java");
		writer.flush();
		writer.close();
		System.out.println("파일 쓰기 완료우");
		} catch (Exception e) {e.printStackTrace();}	
		//#4. char 읽기
		try {
		Reader reader = new FileReader(file);
//		System.out.println(reader.read());
		int cnt=0;
		while ( (cnt=reader.read()) !=-1) {
			System.out.print((char)cnt);
		}
		reader.close();
		System.out.println();
		System.out.println("읽었음 ㅇㅇ");
				
		
		
		} catch (Exception e) {e.printStackTrace();}
	}

}
