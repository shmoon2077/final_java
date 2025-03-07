package java014;

import java.util.Scanner;

public class Exception004 {
	
	public static int nextInt() throws Exception {
		int a=-1;
		Scanner scan = new Scanner(System.in);
		System.out.print("1을 입력하세요");
	    a = scan.nextInt();
		return a;
	}
	
	public static void main(String[] args) {
		int a=-1;
		while(true)
	    try {
		System.out.println(a=nextInt());
		if(a==1)break; }
	catch(Exception e) { System.out.println("오류");	}
	
}
}	
	
/* exception 메시지 
Exception in thread "main" java.util.InputMismatchException
at java.base/java.util.Scanner.throwFor(Scanner.java:939)
at java.base/java.util.Scanner.next(Scanner.java:1594)
at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
at java014.Exception004.nextInt(Exception004.java:11)   - 발생 지점
at java014.Exception004.main(Exception004.java:16)      - 호출 지점
*/