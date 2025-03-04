package java011;

// 초기화 순서
// 클래스변수 (company) -> 인스턴수 변수 a
// 기본값 -> 명시적 초기화 -> 초기화블록 -> 생성자 순으로 초기화

class A {
	//멤버 변수
	int a=10; // 인스턴수변수 =  heap, new, this와 관련 있다.
	static String company="(주)동물농장"; // 명시적 초기화
//	static { company="(주) 동물농장-joy"; } //초기화 블록

	//멤버 함수
	void method () { int a =3000 ; System.out.println(a);  } //지역 변수 stack,초시화
	void show() { System.out.println(this.a); } //인스턴스 변수
    
	A() {  }
	A(int a ) {this.a=a;}
	@Override
	public String toString() {
		return "A [a=" + a + "]";
	}
}



public class Class006_var {
	public static void main(String[] args) {
		System.out.println(A.company);
		
		A a1 = new A(3); System.out.println(a1);
		A a2 = new A(7); System.out.println(a2); a2.method()
;	}

}
