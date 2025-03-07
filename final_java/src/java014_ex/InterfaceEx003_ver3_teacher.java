package java014_ex;

import java.util.Calendar;

interface Launch2 {
	int MONEY=10000;
	void eat();}

class Burger2 implements Launch2 {
	int price;
	public Burger2() {this.price=3900;}
	@Override public void eat() { System.out.println("버거 먹음"); }
	@Override public String toString() { return "버거"; }
		
}

class Kimchistew2 implements Launch2 {
	int price;
	public Kimchistew2() { this.price=4000; }
	@Override public void eat() {System.out.println("김치찌개 먹음");}
	@Override public String toString() { return "김치찌개"; }
	
}


class User2 {   //User2 = Launch2 연관관계 (상속이 아닌 동일선상)
	int money;
	int cnt;
	Launch2[] plate;
	public User2() { 
	this.money = Launch2.MONEY; 
	plate= new Launch2[3]; 
	cnt=0;}
	
	Burger2 burger = new Burger2();
	Kimchistew2 kimchi = new Kimchistew2();
	
	// 부모는 자식을 담을 수 있다.
	void order(Launch2 launch) {
		//1. 주문한 메뉴의 값을 확인
		int temp=0;
		    if(launch instanceof Burger2) {System.out.println("버거 하나 주문..."); temp = ((Burger2)launch).price; } 
	   else if(launch instanceof Kimchistew2) {System.out.println("김찌 하나 주문..."); temp = ((Kimchistew2)launch).price;}
		    
		//2. 내가 가진 돈 확인
		if (money<temp) { System.out.println(">>잔액부족 주문불가능"); return; }
		money-=temp; // 각 주문마다 money를 차감하는 코드
		//3. plate에 주문 받은거 넣기
		plate[cnt++] = launch; 
		
	}
						
	
    void show() { 
    	String order="주문 : ";
    	for (int i=0; i<cnt;i++) { order+= (i!=0? ",":"")+plate[i]; }
    	System.out.println("\n\n" + order);
    	System.out.println("주문금액 :"+(Launch2.MONEY-money));
    	System.out.println("잔액  : "+money);
    	Calendar today = Calendar.getInstance();
    	System.out.println(today.get(1)+"년"+
    	(today.get(2)+1)+"월"+today.get(5)+"일");
    	
    	for (int i=0; i<cnt;i++) {
    		plate[i].eat();}
    	
    	
//    	System.out.println("주문 ");
//    	System.out.println("주문금액");
//    	System.out.println("잔액");
//    	System.out.println("날짜");
//    
    }

}
	



public class InterfaceEx003_ver3_teacher {
	public static void main(String[] args) {
		User2 launchorder = new User2();
		launchorder.order(new Burger2());
		launchorder.order(new Kimchistew2());
		launchorder.order(new Burger2());
		launchorder.show();
		
	}

}
