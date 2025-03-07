package java014;

import java.util.Scanner;

public class Exception001 {
	public static void main(String[] args) {
		int a=-1;
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력하셈");
		a = scan.nextInt();
		while (a!=1) {
			System.out.print("숫자 입력하셈");
			a = scan.nextInt();
		}
		
	}
}
