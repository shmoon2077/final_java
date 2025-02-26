package java008_ex;

public class Repeat007 {
	public static void main(String[] args) {
		
		// 1. 1bit + 1bit 값을 1bit 결과물로 담으려고 해서 오류

		int b=0;
		int c=0;
		int a=0;
		for (a=100; a<=300;a+=100) {System.out.print(a+"\t");}
		System.out.println();
		while (b<300) {b+=100; System.out.print(b+"\t");};
		System.out.println();
		do {c+=100; System.out.print(c+"\t");} while (c<300); 
		
		
	}

}
