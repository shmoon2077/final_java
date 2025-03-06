package SelfTest2;

class A11 {
	int a; 
	A11() {}
	A11(int a) {this.a = a;}
	void show() {this.a=11; System.out.println(this.a);}
	
	static void classMethod(int i) {i=12;}
	
	int show2() {int a=0; return a;}
	
	
}

public class Repeat01 {
	public static void main(String[] args) {
		
	}
}

/*
Q1. 클래스 변수 (1)
    인스턴스 변수 (5)
    지역 변수 (2)
    클래스 메서드 (4)
    인스턴스 메서드 (3)    
    
Q2. 1. 클래스 메서드에 지역변수 this를 넣었기 때문에 오류 
    2. int show2(0)에서 int a를 초기화 안했기 때문에 오류
    
    
Q3. new
    A11()
    a1
    
         
Q4. 파라메터에 아무 값도 넣지 않아도 출력해야하는 기본 값이 있는 경우?

Q5. b c d



 
 */
 
