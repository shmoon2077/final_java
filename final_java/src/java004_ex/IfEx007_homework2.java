package java004_ex;

import java.util.Scanner;

public class IfEx007_homework2 {
	public static void main (String [] args) {
		//변수
		Scanner scan = new Scanner(System.in);
		int num1,num2;
		String result="";
		char op= ' ';
		//입력
		System.out.print("먼저 숫자를 입력하세요");
		num1 = scan.nextInt();
		System.out.print("두번째 숫자를 입력하세요");
		num2 = scan.nextInt();
		System.out.print("연산자를 선택하세요");
		op = scan.next().charAt(0);
		
		//처리  result가 위에서 String으로 정의되었기 때문에, int+int를 result에 담으려면 앞에 ""빈공간을 만들어 char+int로 가공한다
		     if (op=='+') {result=""+(num1+num2);}
		else if (op=='-') {result=""+(num1-num2);}
		else if (op=='*') {result=""+(num1*num2);}
		else if (op=='/') {result=""+String.format("%.2f", num1/(float)num2);};
		
		//출력
		System.out.println(""+num1+op+num2+"="+result);
		scan.close();
	}//main end		
}//class end
	
	// 1. 정수 입력 해주세요 x 2
	// 2. 연산자를 입력하세요
	// 3. 결과를 출력하세요
