package SelfTest3;

//abstract 와 interface의 공통점과 차이점?
//인터페이스에는 추상메서드와 상수만 들어감. 추상 클래스에는 인스턴스 변수와 인스턴스 메서드도 사용 가능

// 공통점 : 자손객체(구현객체)를 통해 코드를 구현
// 차이점 : 추상화 정도가 interface가 크다

interface Vehicle1b { public void run();}


class MotorCycle1b implements Vehicle1b {
	@Override public void run() {System.out.println("오토바이가 달려유");}
	public void helmet() {System.out.println("헬멧을 착용합니다.");}
}

class Car1b implements Vehicle1b {
	@Override
	public void run() {System.out.println("자동차가 달려유");}
}

class Driverb1 {
	void drive (Vehicle1b a) { a.run();
	if ( a instanceof MotorCycle1b) { ((MotorCycle1b) a).helmet(); }}
	Driverb1() { }

}

public class Q8_Q9 {
	public static void main(String[] args) {
		Driverb1 driver1b = new Driverb1();
		MotorCycle1b odobye = new MotorCycle1b();
		Car1b car = new Car1b();

		driver1b.drive(car); // 리턴값 메서드명(파라미터)
								   // void drive(car,odobye)
		
		System.out.println("\n\n>> 자동차가 고장나서 교통수단을 바꿔유");
		
		driver1b.drive(odobye);
	
	}
}
