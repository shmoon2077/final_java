package java005_ex;

import java.util.Scanner;

public class ForEx002T {
	public static void main (String [] args) {
		int dan;
		Scanner scanner = new Scanner(System.in);
		System.out.print("원하는 단을 입력하시오");
		dan = scanner.nextInt();
		
		
		System.out.println(dan+"*"+1+"="+(2*1));
		
		for (int i=1; i<=9; i++) { System.out.println(dan+"*"+i+"="+(dan*i));};
		scanner.close();


		
		
		
	}
	}
		


