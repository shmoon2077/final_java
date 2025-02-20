package java004_ex;

import java.util.Scanner;

public class IfEx003 {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.print("숫자를 입력하세요...좀 작은 수로...");
		num = scan.nextInt();
		
		if(num==1) {System.out.println("one");}
		else if (num==2) {System.out.println("two");}
		else if (num==3) {System.out.println("three");}
		else {System.out.println("1,2,3이 아니여");}
		scan.close();
	}

}
