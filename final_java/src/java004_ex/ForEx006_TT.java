package java004_ex;

import java.util.Scanner;

public class ForEx006_TT {
	public static void main (String [] args) {
		//변수
		int a, b;
		char op= ' ';
		double result= ' ';
		//입력
		Scanner scan = new Scanner(System.in);
		for (;;) {System.out.print(" 숫자 1 입력 >") ; a = scan.nextInt();
	
		if (a>=0 && a<=100) break;};
		for (;;) {System.out.print(" 숫자 2 입력 >") ; b = scan.nextInt();
		if (a>=0 && a<=100) break;};
	
		for (;;) { System.out.print(" 연산자 입력 > "); op = scan.next().charAt(0); 
		if(op=='+' || op=='-' || op=='*' ||op=='/'); break;}
		
		//처리		
		if (op=='+') {result = a+b;}
		else if (op=='-') {result = a-b;}
		else if (op=='*') {result =a*b;}
		else if (op=='/') {result =a/(double)b;}
		//출력
		System.out.printf("%d%s%d = %.2f",a,op,b,result);
		scan.close();
		
	}

 }
	
