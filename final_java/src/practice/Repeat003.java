package practice;

import java.util.Scanner;

public class Repeat003 {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		System.out.println("숫자를 입력하세요 10 20 30");
		a= scan.nextInt();
		if (a==10) {System.out.println("10이다");}
		else if (a==20) {System.out.println("20이다");}
		else if (a==30) {System.out.println("30이다");}
		scan.close();
		
		 
		
	 }

}
