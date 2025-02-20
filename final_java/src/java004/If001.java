package java004;

public class If001 {
	public static void main (String [] args) {
		// 1. if (1형식)
		int a=0;
		System.out.println("1형식-조건을 무조건 읽음");
		// a가 0이라면 0이다.
		// a가 1이라면 1이다.
		if (a==0) {System.out.println("0이다.");}
		if (a==1) {System.out.println("1이다.");} // 이 조건을 처리했는지 알 수 없음

		// 2. if else (2형식)  else 뒤에는 조건식이 못오지이
		System.out.println("2형식 - 맞다 / 틀린다");
		a = 3;
		if (a==0) {System.out.println("0이네요");}
		else {     System.out.println("0이 아니네요");}
		
		// 3. if else if (다형식)
		a= 1;
		//a가 1이라면 "1이다" 
		if (a==1) {System.out.println("1이다");}
		//a가 2라면 "2이다" 
		else if (a==2) {System.out.println("2이다");}
		//3이라면 "3이다" 
		else if (a==3) {System.out.println("3이다");}
		//아니면 1,2,3이 아니다
		else {System.out.println("1,2,3이 아니다");}
		
		
		
	}
}
