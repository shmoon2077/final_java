package java009;
//1. 클래스는 부품 객체
//2. 부품 객체는 속성(멤버변수)과 행위(멤버함수)를 갖습니다.


class Animal002 {
	String name; int age;
	
	void show() {System.out.println(this.name+"\t"+this.age); }
	
}

public class OOP002 {
 public static void main(String[] args) {
	Animal002 a1 = new Animal002(); a1.name="sally";a1.age=10; a1.show();
	//1. new(공간,객체 생성) 2.Animal002() 초기화 , 3. a1 주소 	
	Animal002 a2 = new Animal002(); a2.name="alpha";a2.age=3; a2.show();
	 
	
	System.out.println(a1);
	System.out.println(a2);
	
}
}
/* 10행 : A1 a = new A1();
---------------------------------------- [run time data area]
[method: 정보, static, final: 공용정보 ] A1.class , Class001.class
----------------------------------------
[heap: 동적 영역]    |   [stack:잠깐 빌리는]
A1 {}              <- a1 (호출? 1번지?) 
A1 {}              <- a2 
       			   |    main 
----------------------------------------
*/