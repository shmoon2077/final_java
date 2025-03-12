package java017;

import java.io.File;
import java.io.IOException;

public class Java_IO_001 {
	public static void main(String[] args) {
		String folder_rel="src/java017/";
		String file_rel="file001.txt";
		
		File folder = new File (folder_rel);
		File file = new File (folder_rel+file_rel);
		
	try {	
		if(!folder.exists()) { folder.mkdir(); }
		if(!file.exists()) { file.createNewFile(); }
		System.out.println("폴더/파일 준비 완료 ! "); 
		
	}catch(IOException e) {e.printStackTrace();}
		
		
	}
}
