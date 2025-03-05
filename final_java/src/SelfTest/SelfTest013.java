package SelfTest;

import java.util.Scanner;

public class SelfTest013 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int dan=0;
		int i=0;
		System.out.print("구구단~ 원하는 단 수를 입력하세요.");
		dan = scan.nextInt();
		for (i=1;i<=9;i++) {
			System.out.println(dan+" x "+i+" = "+(dan*i));
		}
	}

}
