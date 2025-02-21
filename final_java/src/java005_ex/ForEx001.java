package java005_ex;

public class ForEx001 {
	public static void main (String [] args) {
		int i=0;
		
		for (i=1; i<=5; i++) {System.out.print(i+"\t");}; System.out.println(); 
		for (i=5; i<=1; i--) {System.out.print(i+"\t");}; System.out.println();
		for (i=1; i<=3; i++) {System.out.print("JAVA"+i+"\t");}; System.out.println();
		for (i=3; i>=1; i--) {System.out.print("Happy"+i+"\t");}; System.out.println();

		for (i=0; i<=2; i++) {System.out.print(i+"\t");}; System.out.println(); //여기부턴t가 아니라 콤마
		for (i=0; i<=99; i++) {System.out.print(i+"\t");}; System.out.println();
		
		for (i=10; i<=1; i--) {System.out.print(i==10?" ":","+i);};

		
		for (i=0; i<=8; i+=2) {System.out.print(i+"\t");}; System.out.println();
		for (i=0; i<=18; i+=2) {System.out.print(i+"\t");}; System.out.println();
	}
}
/*
 * 연습문제1)  
패키지명 : com.company.java005_ex
클래스명 :  ForEx001
출력내용 :   for 이용
q1  for문을 이용해서 다음과 같이 출력하시오 :  1 2 3 4 5 
q2  for문을 이용해서 다음과 같이 출력하시오 :  5 4 3 2 1 
q3  for문을 이용해서 다음과 같이 출력하시오 :  JAVA1   JAVA2  JAVA3  
q4  for문을 이용해서 다음과 같이 출력하시오 :  HAPPY3   HAPPY2  HAPPY1  
q5  for문을 이용해서 다음과 같이 출력하시오 :  0,1,2  
q6  for문을 이용해서 다음과 같이 출력하시오 :   0,1,2, ,,,중간생략 ,,, 99  
q7  for문을 이용해서 다음과 같이 출력하시오 :   10, 9,,,,중간생략 ,,, , 1 
q8  for문을 이용해서 다음과 같이 출력하시오 :   0, 2, 4, 6, 8 
q9  for문을 이용해서 다음과 같이 출력하시오 :   0, 2, 4, 6, 8 ,,,중간생략 ,,, 18 
 * */
