package SelfTest3;

import java.util.Scanner;

public class Q10_throws {
	public static int nextInt() throws Exception
	{Scanner scan = new Scanner(System.in);
	System.out.println("1을 입력하시오");
	return scan.nextInt();}
	
	public static void main(String[] args) {
		int one = 0;
		while (true)
		try {one=nextInt();	if(one==1) {break;}}
		catch(Exception a) {System.out.println("숫자 입력");}
		
	}
}
