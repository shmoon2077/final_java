package java004_ex;

import java.util.Scanner;

public class ForEx006 {
	public static void main (String [] args) {
		int num1,num2;
		char oper=' ';
		double result;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력해주세요");
		num1 = scan.nextInt();
		while (num1<0 || num1>100) {System.out.print("숫자를 다시 입력해주세요");
		num1 = scan.nextInt();}
		
		
		System.out.print("두번째 숫자를 입력해주세요");
		num2 = scan.nextInt();
		while (num2<0 || num2>100) {System.out.print("숫자를 다시 입력해주세요");
		num2 = scan.nextInt();
		scan.nextLine();}
		
		System.out.print ("두 숫자 사이의 연산자를 택해주세요.");
		oper = scan.next().charAt(0);
		switch (oper) {
		case '+' : result = (num1+num2);break;
		case '-' : result = (num1-num2);break;
		case '*' : result = (num1*num2);break;
		case '/' : result = (num1/num2);break;
		default : System.out.print("연산자를 다시 입력해주세요.");
		oper = scan.next().charAt(0);
	
		}
		
		
		}
		
	}
	

