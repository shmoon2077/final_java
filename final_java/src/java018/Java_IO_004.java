package java018;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class Java_IO_004 {
	public static void main(String[] args) throws Exception {
		
		//1 경로
		String origin = "src/java018/winter.webp";
		String target1 = "src/java018/winter1.webp";
		String target2 = "src/java018/winter2.webp";
		
		// winter.wepp -> winter1.wepp
		
		InputStream bis = new FileInputStream(origin);
		OutputStream bos = new FileOutputStream(target1);
		
		int cntw = 0;
		while ( (cntw=bis.read())  !=-1) {	bos.write( (byte)cntw );
		} bos.flush(); bos.close(); bis.close();
		
		
		// winter.wepp -> winter2.wepp
		// char 단위
		
		Reader cr = new FileReader(origin);
		Writer cw = new FileWriter(target2);
		
		int cntw1 = 0;
		while ( (cntw1=cr.read()) !=-1) { cw.write((char)cntw1); }
		cw.flush();cw.close();cr.close();
		
		
				
	}

}
