package practice;

import java.util.Scanner;

public class Repeat001 {
	public static void main (String [] args) {
		
		int a=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		a = scan.nextInt();
		if (a==1) {System.out.println(a+"입니다");}
		else if (a==2 ) {System.out.println(a+"입니다");}
		else if (a==3 ) {System.out.println(a+"입니다");}
		scan.close();
		
	 }

}
