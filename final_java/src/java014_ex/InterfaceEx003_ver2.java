package java014_ex;

interface Launch1 {
	int MONEY=10000;
	void eat();}

class Burger1 implements Launch1 {
	int price;
	public Burger1() {this.price=3900;}
	@Override public void eat() { System.out.println("버거 먹음"); }
	@Override public String toString() { return "버거"; }
		
}

class Kimchstew1 implements Launch1 {
	int price;
	public Kimchstew1() { this.price=4000; }
	@Override public void eat() {System.out.println("김치찌개 먹음");}
	@Override public String toString() { return "김치찌개"; }
	
}


class User1 implements Launch1 {
	int money;
	int cnt;
	Launch1[] plate;
	public User1() { 
	money = 0; 
	plate= new Launch1[10]; 
	cnt=0;}
	
	Burger1 burger = new Burger1();
	
	Kimchstew1 kimchi = new Kimchstew1();
	
	void order(Launch1 launch) {
		
		if (launch.toString()=="김치찌개") {	
			System.out.println("김치찌개 하나 주문!");
			money+=kimchi.price;
			plate[cnt++] = new Kimchstew1();
			
		}
		else if (launch.toString()=="버거") {
			System.out.println("버거 하나 주문!");
			money+=burger.price;
			plate[cnt++] = new Burger1();
		}
		else if (money > Launch1.MONEY) { System.out.println(" >>>>잔액 부족");}
		
		
		} 
						
	
    void show() {
    	
    	System.out.println("주문     : "+ plate );
        System.out.println("주문 금액 : "+ money);                   
        System.out.println("잔액     : "+(Launch1.MONEY-money));
        System.out.println("2025년 03월 07일");
        System.out.println(plate+"냠냠");
        
    }


	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
}
	



public class InterfaceEx003_ver2 {
	public static void main(String[] args) {
		User1 launchorder = new User1();
		launchorder.order(new Burger1());
		launchorder.order(new Kimchstew1());
		launchorder.order(new Burger1());
		launchorder.show();
		
	}

}
