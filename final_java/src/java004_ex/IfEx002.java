package java004_ex;

import java.util.Scanner;

public class IfEx002 {
	public static void main (String []args) {
		Scanner scan = new Scanner(System.in);
		double num1;
		System.out.println("숫자를 입력하세요");
		num1 = scan.nextDouble();
		if (num1>0) {System.out.println("양수네요");}
		else if (num1==0) {System.out.println("zero");}
		else {System.out.println("음수인듯");}
		scan.close();
	}

}
