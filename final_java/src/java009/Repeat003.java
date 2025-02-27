package java009;

public class Repeat003 {
	public static void main(String[] args) {
		int i = 0;
		int a = 0;
		int b = 0;
		for(i=100;i<=300;i+=100) {System.out.println(i);}
		
		while (a<300) {a+=100; System.out.println(a);} 
		
		do {b+=100; System.out.println(b);} while (b<300);
			
	}

}
