package practice;

import java.util.Scanner;

public class Repeat004 {
	public static void main (String [] args) {
		int a;
		Scanner scan = new Scanner(System.in);
	    System.out.println("숫자를 입력하세요");
	    a = scan.nextInt();
	    switch (a) {
	    case 10 : System.out.println("10이다"); break;
	    case 20 : System.out.println("20이다"); break;
	    case 30 : System.out.println("30이다"); break;	
	    }
	    scan.close();
	}  

}
