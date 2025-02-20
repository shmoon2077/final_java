package practice;

import java.util.Scanner;

public class QWER {
	public static void main (String [] args) {
		//변수
		Scanner scan = new Scanner(System.in);
		int age;
		String result = "1~5세 어린이가 아닙니다.";
		//입력
		System.out.print("나이를 입력하세여 > ");
		age = scan.nextInt();
		//처리
		if (age>=1 && age<=5) {result = "어린이는 "+age+"세 입니다.";}
		//출력
		System.out.println(result);
		scan.close();
	}
}
