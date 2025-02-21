package java005_ex;

public class ForEx005 {
	public static void main (String [] args) {
		int a=0;
		int b=0;
		int c=0;
		char ch=' ';
		
		for (a=1; a<=10; a++) {if(a%3==0) {b+=1;}};
		for (ch='a'; ch<='z' ;ch++) {if(ch<='z') {c++;}};
		
		System.out.println ("3의 배수는"+b
				+"개, "+"알파벳은"+c+"개");
	} //end class
} //end main
		
	


