package java006_Ex;

public class Repeat008 {
	public static void main (String [] args) {
		int a=0,sum=0;
		for (a = 1; a <= 10; a++) {
			if (a % 3 == 0) { sum += a; }
		}
		System.out.println("1~10 사이 3의 배수의 합 :"+sum);
		
		int b = 1 ,sum1 = 0;
		while(b<=10) {if(b%3==0) {sum1+=b;}  b++;}
		System.out.println("1~10 사이 3의 배수의 합 :"+sum1);
		
		int c = 1, sum2 = 0;
		do {if (c%3==0) {sum2+=c;} c++;} while (c<=10);
		System.out.println("1~10 사이 3의 배수의 합 :"+sum2);
		/*		*/
		
	}
}
