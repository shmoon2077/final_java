package java007;

import java.util.Scanner;

public class Remind {
	public static void main(String[] args) {
		// 1. 기본형 참조형
		// 2. byte shot int long float double char
		// 3. boolean
		// 4. *ch>='A' && ch<='Z'
		// 5. *ch>='a' && ch<='z'
		// 6. a>=0 && a<=100
		
		Scanner scan = new Scanner(System.in);
		char a, b = ' ', c= ' ';
		System.out.println("a,b,c 중 입력");
		a = scan.next().charAt(0);
		if (a=='a') {System.out.println("apple");}
		else if (a=='b') {System.out.println("banana");}
		else if (a=='c') {System.out.println("coconut");};
		
		System.out.println("a,b,c 중 입력");
		a = scan.next().charAt(0);		
		switch (a) {
		case 'a' : {System.out.println("apple");}break;
		case 'b' : {System.out.println("banana");}break;
		case 'c' : {System.out.println("coconut");}break;
		}
		
		
		
		int i;
		for (i=10; i <=30; i+=10) { System.out.println(i);};
		
		int v = 0;
		while (v<=20) {v+=10 ; System.out.println(v);};
		
		int e = 0;
		do {e+=10 ; System.out.println(e);} while (e<=20);
		
		
		
		int[] arr = {1,2,3};
		for (i=0;i<arr.length;i++) {System.out.println(arr[i]);};
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
