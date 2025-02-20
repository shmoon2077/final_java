package java004;

import java.util.Scanner;

public class Switch001 {
	public static void main (String [] args) {
		// 변수
		int a=0;
		int result = 0;
		Scanner scan = new Scanner(System.in);
		
		// 입력
		System.out.print("숫자 하나 입력");
		a = scan.nextInt();
		// 처리 (if or switch  // for, while, do while)
		// if var - a가 1이면 1이다, 2이면 2이다, 3이면 3이다
		
		  if (a==1) {result=1;}
		  else if (a==2) {result=2;}
		  else if (a==3) {result=3;};
		
		
		System.out.println(result+"이다");
		  
		  
		  
		  switch(a) {
		  case 1: System.out.println("1이다");break;
		  case 2: System.out.println("2이다");break;
		  case 3: System.out.println("3이다");
		   }
		scan.close();
		// 출력
	}

}
