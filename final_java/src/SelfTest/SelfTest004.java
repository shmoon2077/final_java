package SelfTest;

import java.util.Scanner;

public class SelfTest004 {
	public static void main(String[] args) {
	int kor;
	int eng;
	Scanner scan = new Scanner(System.in);
	System.out.print("국어 점수를 입력하세요.");
	kor = scan.nextInt();
	System.out.print("영어 점수를 입력해주세요.");
	eng = scan.nextInt();
	if (kor<40) {System.out.println("과락 : 국어");}
	if (eng<40) {System.out.println("과락 : 영어");}
	
	
	
	
	
	}
}
