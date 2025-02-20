package java004_ex;

import java.util.Scanner;

public class SwitchEx001 {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in); 
		int season;
		System.out.print("1~12숫자를 입력하세요");
		season = scan.nextInt();
		// JDK 하위 버전에서는 case를 하나하나 적어줘야함 첫 줄 경우엔 case 3 : case 4 : case 5 : 이런식
		switch (season) {
		case 3,4,5: System.out.println("봄이다");break;
		case 6,7,8: System.out.println("여름이다");break;
		case 9,10,11: System.out.println("가을이다");break;
		case 12,1,2: System.out.println("겨울이다");
		scan.close();
		}
	}
}
