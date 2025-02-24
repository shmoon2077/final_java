package java006_Ex;

public class Repeat009T {
	public static void main (String [] args) {
/*
for , while , do while 3가지 버젼으로 출력
ABCDE   
FGHIJ
KLMNO
PQRST
UVWXY
Z */

// if ('A'%5==0) {System.out.println();} System.out.print('A');
// if ('B'%5==0) {System.out.println();} System.out.print('B');
// if ('C'%5==0) {System.out.println();} System.out.print('C');
// if ('D'%5==0) {System.out.println();} System.out.print('D');
// if ('E'%5==0) {System.out.println();} System.out.print('E');
// if ('F'%5==0) {System.out.println();} System.out.print('F');
		
		for (char ch='A'; ch<='Z'; ch++) {if(ch%5==0) {System.out.println();}
		System.out.print(ch);}
		
	    char ch1='A'; while (ch1<='Z') {if(ch1%5==0) {System.out.println();}
	    System.out.print(ch1); ch1++;}
	    
	    
	    char ch2='A'; do {if(ch2%5==0) {System.out.println();} 
	    System.out.print(ch2); ch2++;} while (ch2<='Z');
	    
	    
	    
	    
	    
	    

 }
}