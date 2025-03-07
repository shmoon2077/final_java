package java014;

import java.util.Scanner;

public class Exception003 {
	public static void main(String[] args) {
		int a=-1;
		Scanner scan = new Scanner(System.in);
		
		try {while (a!=1) {
			System.out.print("1을 입력하세요");
		    a = scan.nextInt();
		    }
		}
	    catch (Exception e) {System.out.println("아 숫자 입력하라고");}
		finally { System.out.println(); }
			
	
	
	
	}
		
	
}
