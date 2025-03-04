package SelfTest;

import java.util.Scanner;

public class SelfTest007 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		char ch;
		System.out.print("a,b,c중 입력하세요");
		ch = scan.next().charAt(0);
		switch (ch) {
		case 'a','A' : {System.out.println("Apple");}break;
		case 'b','B' : {System.out.println("Banana");}break;
		case 'c','C' : {System.out.println("Coconut");}break;
		default : {System.out.println("대소문자 관계없이 a,b,c만 입력 가능합니다");		
		}
		}
		
	}

}
