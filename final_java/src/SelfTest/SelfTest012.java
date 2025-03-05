package SelfTest;

import java.util.Scanner;

public class SelfTest012 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int i=0;
		while (i<=0 || i>100) {
			System.out.print("1~100사이 숫자를 입력하세요");
			i=scan.nextInt();
		}
	}

}
