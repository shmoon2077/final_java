package SelfTest3;

//1. 클래스 변수 = company
//2. 인스턴스 변수 = a
//3. 지역변수 = method 안의 int a
//4. 오류날만한 코드 void method() {int a} 

public class Q2_A {
	int a; // heap new 
	static String company; 
	void method() {int a;} // stack 임시! ※ 주의사항 = 무조건 초기화할 것!

}
