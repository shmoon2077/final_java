package java004_ex;

import java.util.Scanner;

public class IfEx007_homework {
	public static void main (String [] args) {
		//변수
		Scanner scan = new Scanner(System.in);
		int num1,num2;
		int result=0;
		String oper;

		//입력
		System.out.print("먼저 숫자를 입력하세요");
		num1 = scan.nextInt();
		System.out.print("두번째 숫자를 입력하세요");
		num2 = scan.nextInt();
		System.out.print("연산자를 선택하세요");
		oper = scan.next();
		
		//처리
		if (oper=="+") {result=(num1+num2);}
		else if (oper=="-") {result=(num1-num2);}
		else if (oper=="*") {result=(num1*num2);}
		else if (oper=="/") {result=(num1/num2);}

		
		//출력
		System.out.println(result);
		scan.close();
	}//main end		
}//class end
	
	// 1. 정수 입력 해주세요 x 2
	// 2. 연산자를 입력하세요
	// 3. 결과를 출력하세요
