package SelfTest;

import java.util.Scanner;

public class SelfTest006 {
	public static void main(String[] args) {
		int kor;
		Scanner scan = new Scanner(System.in);
		System.out.print("국어점수를 입력하시오");
		kor = scan.nextInt();
		System.out.println(
		(kor>=90) ? "수" : 
		(kor>=80) ? "우" :
		(kor>=70) ? "미" :
		(kor>=60) ? "양" :
		"가");
			
	}

}
