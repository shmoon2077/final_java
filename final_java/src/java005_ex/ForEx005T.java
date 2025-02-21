package java005_ex;

public class ForEx005T {
	public static void main (String [] args) {
		//변수
		int cnt=0;
		char ch=' ';

		//입력
				
		//처리
		for(ch='a'; ch<='z'; ch++) { if (ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ) { cnt++; } }
		
		//출력 소문자 a~z까지 모음의 갯수를 출력하시오. 
		System.out.println("소문자 a~z까지 모음의 갯수 > "+cnt);
		
		
		
		//ver1 대상 어떠하다
		// a가 모음이라면 카운트: 갯수 증가
		
		//ver-2 구조  a가 a e i o u
		//if (a=='a' ||a=='e' ||a=='i' ||a=='o' ||a=='u' ) { cnt++ }
		
		
	} //end class
} //end main
		
	


