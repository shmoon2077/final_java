package practice;

import java.util.Scanner;

public class Repeat002 {
	public static void main (String [] args) {
		int a=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		a = scan.nextInt();
		
		switch(a) {
		case 1 : {System.out.println("1입니다.");}break;
		case 2 : {System.out.println("2입니다.");}break;
		case 3 : {System.out.println("3입니다.");}
		}
		scan.close();
		}
		
	}


