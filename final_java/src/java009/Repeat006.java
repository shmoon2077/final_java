package java009;

import java.util.Scanner;

public class Repeat006 {
	public static void hi() { System.out.println("hi");}
	public static void hi(int a) { System.out.println("hi" + a);}
	public static String hi(String str) { return "hi "
			+ ""+str; }
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		hi();
		int name = scan.nextInt();
		hi(name);
		String name2 = scan.next().toString();
		System.out.println( hi(name2));
				
	}

}
