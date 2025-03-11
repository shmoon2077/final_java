package SelfTest3;

//Q1 예상되는 money = 10000 , sing = 빅뱅 - 거짓말


class Papa extends Object {
	int money=10000;
	public Papa () {super(); }
	public void sing() {System.out.println("GOD-그짓말");}
}
	
class Son2 extends Papa {
	int money=1500;
	public Son2() {super();}
	@Override public void sing() {super.sing();
	System.out.println("빅뱅-거짓말");}
	}


public class Q7_Polymorphism {
	public static void main(String[] args) {
		Papa mypapa = new Son2();
		Son2 mine = new Son2();
		System.out.println(mine.money);
		mypapa.sing();
	}
}


