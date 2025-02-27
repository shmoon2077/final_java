package java09_ex;

import java.util.Arrays;

public class MethodEx005 {

	public static void upper(char[] a) 
	{ a[0]='A'; a[1]='B'; a[2]='C';}
	
	
	public static void main(String[] args) {
		char[] ch = {'a','b','c'};
		upper(ch);
		System.out.println("main. 배열값 : "+Arrays.toString(ch));
		
		
		
		
	}//end main
}//end class
