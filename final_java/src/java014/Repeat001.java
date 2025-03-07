package java014;

import java.util.ArrayList;

/*Q1 p.x = 100
 *   Child Method
 *   p.c = 200
 *   Child Method
 *  
 * 
 * */

class Papa {
	int money=10;
	public Papa () {}
	public Papa (int money) {this.money=money;}
	@Override
	public String toString() { return "Papa [money=" + money + "]"; };
		
}

class Son extends Papa {
	int money=150;
	int car=2;
	public Son() {super();}
	public Son(int money) {this.money = money; }
	public Son(int money, int car) { this.money = money; this.car = car; }
	@Override
	public String toString() { return "Son [money=" + money + ", car=" + car + "]"; } 
}





public class Repeat001 {
	public static void main(String[] args) {
		Papa p1 = new Papa();
		System.out.println(p1);
		
		Son s2 = new Son();
		System.out.println(s2);
		
//		Son s3 = new Papa();
//		상속 받은 자식이 부모를 호출하는 것은 불가... 호로자식
// 		Papa 생성자는 Son의 변수를 초기화할 수 없다.

		Papa p4 = new Son();
		System.out.println(p4); // 오버라이딩
		System.out.println(p4.money);
		
		Papa p5 = new Son(); // 업캐스팅 / 타입캐스팅 x
		Son s5 = (Son) p5; // 다운캐스팅 / 타입캐스팅 필요
		
		System.out.println(s5);
		System.out.println(s5.money);
		
		ArrayList<String> list = new ArrayList<>();
		

	}
	
}


// 오버로딩은 메서드의 이름이 같고, 내용이 다르다. 변수의 형태 메서드 내용 등
// 오버라이딩은 부모의 메서드를 상속 받아 쓰는 것 (메서드 이름이 같음)
