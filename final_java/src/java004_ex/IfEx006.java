package java004_ex;

import java.util.Scanner;

public class IfEx006 {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		int gender;
		System.out.print("숫자을 입력하세요");
		gender = scan.nextInt();
		if (gender%2==0) {System.out.println("여자!");}
		else {System.out.println("남자!");}
		scan.close();
		}
	
	//단항식의 경우 기본값을 설정 후 if 한번으로 끝낼 수 있다...
}
