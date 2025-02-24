package practice;

import java.util.Scanner;

public class Repeat006 {
	public static void main (String [] args) {
		int a=0;
		Scanner scan = new Scanner(System.in);
		System.out.println ("1을 입력하세요");
		a = scan.nextInt();
	    while (a!=1) { System.out.println("1을 입력하세요"); a = scan.nextInt();}
	    scan.close();
	    }
		
	}



