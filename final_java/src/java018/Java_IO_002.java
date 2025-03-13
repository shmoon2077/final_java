package java018;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Java_IO_002 {
	public static void main(String[] args) {
		//#1. 경로 준비 
		String folder_rel="src/java018/";
	    String   file_rel="file002.txt";
	    
	    File folder = new File(folder_rel);
	    File file = new File(folder_rel+file_rel);
		
		//#2. 폴더 + 파일 만들기
	    try {
	    if(!folder.exists()) { folder.mkdir(); }
	    if(!file.exists()) {file.createNewFile();}
	    } catch (Exception e) {e.printStackTrace(); }
		
		
		//#.3 byte 파일 쓰기      OutputStream [프로그램을 기준으로]
	    try {
	    OutputStream output = new FileOutputStream(file); 
	    output.write('j');
	    output.write('a');
	    output.write('v');
	    output.write('a');
	    output.write('n');
	    output.write('o');
	    output.flush();
	    output.close();
	    System.out.println("쓰기 끝");
	    } catch(Exception e) {e.printStackTrace();}
	    
	    	
		//#.4 byte 파일 읽기		InputStream [프로그램을 기준으로]
	    try {
	    InputStream input = new FileInputStream(file);
//	    System.out.println(input.read());  // 
	    int cnt = 0;
	    
	    while ( (cnt=input.read()) !=-1 ) {  //파일 끝남. -1이 아닐때까지
	    	System.out.print((char)cnt);   }
	    input.close();
		
	    } catch(Exception e) {e.printStackTrace();}
	
	}
}
