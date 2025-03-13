package java018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Java_IO_005 {
	public static void main(String[] args) {
		String folder_rel="src/java018/";
		String file_rel="file004.txt";
		
		File folder = new File(folder_rel);
		File file = new File(folder_rel+file_rel);

		try {
			if(!folder.exists()) {folder.mkdir();}
			if(!file.exists()) {file.createNewFile();}
		} catch (Exception e) {e.printStackTrace();}
		
//		OutputStream output = new FileOutputStream();
//		InputStream input = new FileInputStream();
		
	   try {
		   BufferedWriter bw=
		new BufferedWriter(new OutputStreamWriter (new FileOutputStream(file)));
		   // 속도 향상               단어                    byte
		   bw.write("1,white,1200\n");
		   bw.write("1,choco,1500\n");
		   bw.write("1,banana,1800\n");
		   bw.flush();
		   bw.close();
		   System.out.println("썼음");
		
	} catch (Exception e) { e.printStackTrace();}
		
		
	  try {
		  BufferedReader br = 
		  new BufferedReader (new InputStreamReader(new FileInputStream(file)));
		   // 속도 향상               단어                    byte
		  String line;
		  StringBuffer sb = new StringBuffer();
		  while( (line=br.readLine()) !=null)
		  { sb.append(line+"\n"); }
		  System.out.println(sb.toString());
		  br.close();
//		  System.out.println(br.readLine());
	  } catch (Exception e) {e.printStackTrace();}
		
	   
	   
	   
	   
	   
	   
	   
	}

}
