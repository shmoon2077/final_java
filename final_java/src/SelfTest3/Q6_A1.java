package SelfTest3;

//Q1. 변수 함수의 재활용
//Q2. Object ← A1 ← B1 ← C1
//Q3... 다 쳐버림...


class A1 extends Object {
	int a;
	public A1() {super();}
	public A1(int a) { super(); this.a = a; }
}

class B1 extends A1 {
	int b;

	public B1() { super(); }
	public B1(int b) {this.b=b;}
	public B1(int a, int b) {super(a);this.b=b;}

}

class C1 extends B1 {
	int c;
	public void showC() {
		System.out.println("A클래스의 a:"+a);
		System.out.println("B클래스의 b:"+b);
		System.out.println("C클래스의 a:"+c);
		
	}
}


public class Q6_A1 {
	public static void main(String[] args) {
		C1 myc = new C1();
		myc.a=10; myc.b=20; myc.c=30;
		myc.showC();
	}
	
}