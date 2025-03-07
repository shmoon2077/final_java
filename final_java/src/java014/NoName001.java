package java014;

interface Inter1 { void method (); }  // public abstract

class Inter1Impl implements Inter1 {

	@Override public void method() { System.out.println("아 머래");  }}

public class NoName001 {
	public static void main(String[] args) {
		Inter1 i1 = new Inter1Impl(); 
		i1.method();
		
		
    // 위 방법과 다르게 익명 이너클래스 사용
//		Inter1 i2 = new Inter1();   //구현부가 없어서 불가능   
		Inter1 i2 = new Inter1(){

			@Override public void method() { System.out.println("아 머래");   }
			}; // 테스트 목적, 잘 안 쓰임 ; ; 
			i2.method();
		
				
	}
}
