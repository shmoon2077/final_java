package java004_ex;

import java.util.Scanner;

public class IfEx004 {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		char ch;
		ch = ' ';
		System.out.print("알파벳을 입력하세요");
		ch = scan.next().charAt(0);
		if (ch>='a' && ch<='z') {System.out.println("소문자");}
		if (ch>='A' && ch<='Z') {System.out.println("대문자");}
		else {System.out.println("알파벳 입력하라니깐!!");} 
		scan.close();		
	}

}
