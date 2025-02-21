package java005_ex;

public class ForEx004 {
	public static void main (String [] args) {
		int a=0;
		int b=0;
		for (a=1; a<=10; a++) {if(a%3==0) {b++;}}
		System.out.println("3의 배수는  "+b+"개");
	}

}
