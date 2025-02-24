package java004_ex;

import java.util.Scanner;

public class ForEx006T {
	public static void main (String [] args) {
		int a,b;
		double result;
		char oper=' ';
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요");
		a = scan.nextInt();
		while (a<0 || a>100) {System.out.println("숫자를 다시 입력하세요");
		a = scan.nextInt();
		}
		System.out.println("두번째 숫자를 입력하세요");
		b = scan.nextInt();
		while (b<0 || b>100) {System.out.println("숫자를 다시 입력하세요");
		b = scan.nextInt();
		}
		
		System.out.println("연산자를 입력하슈");
		oper = scan.next().charAt(0);
		if (oper=='+') {result = (a+b);}
		else if (oper=='-') {result = (a-b);}
		else if (oper=='*') {result = (a*b);}
		else if (oper=='/') {result = (a/(double)b);}
		
		System.out.println();
		
		
	}}		
	


