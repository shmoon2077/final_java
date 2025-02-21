package java005;

import java.util.Scanner;

public class Repeat002 {
	public static void main (String[] args) {
		//무한반복
		Scanner scan = new Scanner(System.in);
		int a=0;
		for( ;a==1; ) { 
			System.out.println("숫자 1을 입력하시오.");
			a = scan.nextInt();
//			if(a==1) { break; }
//						
		}
		
		for (int i=1; i<=10; i++) {
			if(i==3) {break;}
			System.out.print(i+"\t"+"\n");
		}
		for (int i=1; i<=10; i++) {
			if(i==3) {continue;}
			System.out.print(i+"\t");		
		}
		
		System.out.println();
		for (;;) {
        System.out.println("9를 입력하면 끝남");
		a = scan.nextInt();
		if(a==9) {break;}
		
		
		
		}
		
	}
}
