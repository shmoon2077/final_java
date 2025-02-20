package java004_ex;

import java.util.Scanner;

public class IfEx001Teach {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		double avg;	String result = "불합격";	
		// String result로 기본 값을 "불합격"으로 가져간다
		System.out.print("평균 점수를 입력하세요");
		avg = scan.nextDouble();
			
		if (avg>=60) { result = "합격"; }
		// 조건 만족시 result에 합격을 입력한다. if 를 1개만 넣고도 합/불을 출력할 수 있는 방법 ''!
		System.out.println(result);
	    scan.close();
		}

}
