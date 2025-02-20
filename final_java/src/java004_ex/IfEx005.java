package java004_ex;

import java.util.Scanner;

public class IfEx005 {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		char ch;
		System.out.print("알파벳을 입력하세요");
		ch = scan.next().charAt(0);
		if (ch>='a' && ch<='z') {System.out.println((char)(ch-32));}
		if (ch>='A' && ch<='Z') {System.out.println((char)(ch+32));}
		else {System.out.println("'알파벳'를 입력하세용");};
		scan.close();
	}

}
