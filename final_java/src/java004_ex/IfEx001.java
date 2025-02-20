package java004_ex;

import java.util.Scanner;

public class IfEx001 {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		double avg;		
		System.out.print("평균 점수를 입력하세요");
		avg = scan.nextDouble();
		
		if (avg>=60) {System.out.println("합격 ㅊㅊ");}
		else {System.out.println("불합격");}
		// else 를 지워도 작동은 하지만... 60미만 숫자 입력 시 아무 반응이 없음
	    scan.close();
		}
	}

