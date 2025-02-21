package java005_ex;

public class ForEx002 {
	public static void main (String [] args) {
		int a=0, b=0;
		int result = 0;
		
		for (a=2; a<=9; a++) {
			for (b=1; b<=9; b++) {
			     result = a*b;
		         System.out.print( a+"x"+b+"="+result+"\t");}
			System.out.println();
		
		}
	}
}		


