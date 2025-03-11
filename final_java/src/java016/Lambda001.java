package java016;

// 설계 목적 - interface
interface Inter1{ void method(); } 
class     Inter1Impl implements Inter1 {

	@Override
public void method() { System.out.println("졸려 ~_~");	}
	}


public class Lambda001 {
	public static void main(String[] args) {
		//#1. interface = 구현객체 만들기
		Inter1 a1 = new Inter1Impl(); a1.method();
		// 부모           자식        다형성       업캐스팅
		
		//#2. 익명 이너클래스 ( 테스트 목적 )
		Inter1 a2 = new Inter1() {
			@Override
			public void method() {System.out.println("개졸림 ㅡㅡ");}
					};
			a2.method();
		//#3. lambda  (처리)
	
		Inter1 a3 = ()->{System.out.println("진짜 졸림");};
		a3.method();
			
			
			
			
			
			
		}
}
