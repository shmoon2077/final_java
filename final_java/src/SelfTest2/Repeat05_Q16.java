package SelfTest2;


//Q1. Object > Papa > Son2 ???
//Q2. 
class Papa extends Object {
	public Papa() {super();};
	int money = 10000; //멤버 변수
	
	int getMoney() {return money;}
	
	public void sing() {System.out.println("GOD-그짓말" );} //멤버 함수
}

class Son2 extends Papa {
	int money = 1500; //멤버 변수
	
	int getMoney() {return money;}
	public Son2() {super();}
	@Override
	public void sing() {System.out.println("빅뱅-그짓말");} //멤버함수
}


public class Repeat05_Q16 {
	public static void main(String[] args) {
		
		Papa mypap = new Son2();
		//Q3. money=10000, sing() 사용 가능 !
		//Q4.
		/*
		 
		 ------------------------------------
		 [heap]           |
		 Papa            ←   mypap
		 Child           ←   mypap
		                  |
		 --------------------------------------
		 */
		
		
		System.out.println(mypap.money);
		System.out.println(((Son2)mypap).money);
		
		mypap.sing();
				

	}
}
	


    
		
		
