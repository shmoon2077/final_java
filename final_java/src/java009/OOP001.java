package java009;

//1. 클래스는 부품 객체
//2. 부품 객체는 속성(멤버변수)과 행위(멤버함수)를 갖습니다.

class A1 {}

public class OOP001 {
	public static void main(String[] args) {
		A1 a = new A1(); // 3-1. new => heap 공간 빌리기 3-2. A1() 호출/초기화
		                 // 3-3. a는 주소

		
		//a = java009.A1@2f92e0f4
		System.out.println(a);
	}

}
/* 10행 : A1 a = new A1();
---------------------------------------- [run time data area]
[method: 정보, static, final: 공용정보 ] A1.class , Class001.class
----------------------------------------
[heap: 동적 영역]    |   [stack:잠깐 빌리는]
A1 {}              <- a (호출? 1번지?) 
       			   |    main 
----------------------------------------


*/