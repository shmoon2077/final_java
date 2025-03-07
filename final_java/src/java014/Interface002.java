package java014;

class Class1{}

interface Inter21 { void method1(); }
interface Inter22 { void method2(); }
interface Inter23 extends Inter21, Inter22 {  }
// 인터페이스는 다중상속 인터페이스 끼리는 extends 클래스에는 implements
// 많이 쓰이는 형식
// Class extends Class implements interface, interface, interface

class Using1 extends Class1 implements Inter21,Inter22 {

	@Override public void method2() {   }
	@Override public void method1() {   }
	
}


public class Interface002 {
	public static void main(String[] args) {
		Using1 my = new Using1();
		if ( my instanceof Object) { System.out.println("Object 상속 받음");}
		if ( my instanceof Class1) { System.out.println("Class1 상속 받음");}
		if ( my instanceof Inter21) { System.out.println("Inter21 상속 받음");}
		if ( my instanceof Inter22) { System.out.println("Inter22 상속 받음");}
	}

}
