package SelfTest2_T;
//1. 클래스 부품객체 ( 상태-멤버변수와 행위-멤버함수  )
//Q1. 클래스변수, 인스턴스변수, 지역변수  / 클래스메서드, 인스턴스메서드
class A11{
	int a; //1  인스턴스변수 -heap area -  new O -  this 각각

	public A11() { super(); }
	public A11(int a) { super(); this.a = a; } //2 지역변수 - stack area 
	
	void show() {this.a=11; System.out.println(this.a);} 
	//3 인스턴스메서드 - heap area -new O - this각각
	
	static void classMethod() {  /*this.a=12; */ }    //Q2-1
	//4 클래스메서드 - method area - new X - 공유영역
	//  static이 jvm 로딩시 제일먼저 메모리상에 올라감. this는 new를 이용해 사용해야함. 순서가 안맞음.
	//  static은 instance 사용불가
	
	int show2() {  int a=1; return a;}    //Q2-2
	//인스턴스메서드 - heap area - new O - this 각각 
	//int show2() {  int a; return a;}    show2 메서드 안에 있는  int a는 지역변수
	// int a 는 stack - 임시공간 - 변수초기화가 안됨. 주의)
}

public class Repeat001_OOP {
	public static void main(String[] args) {
		A11 a1 = new A11();  //6 지역변수  -  stack 영역
	}
}
//Q3.  [ new ]: 메모리빌려오기 /객체생성,   
//	   [A11()]:	String null, int 0으로 초기화
// 	   [a1]   : new A11()

//Q4. 기본생성자를 반드시 선언 :  [생성자 오버로딩, 상속]

//Q5. 오버로딩성립 조건이 아닌 것 
//  비슷한 기능의 메서드들의 이름을 같게 만들고, 알규먼트의 자료형과 갯수로 구분
//  c,d






