package java014_ex;

interface Launch {
	int MONEY=10000;
	void eat();}

class Burger implements Launch {
	int price;
	public Burger() {this.price=3900;}
	@Override public void eat() { System.out.println("버거 먹음"); }
	@Override public String toString() { return "버거"; }
		
}

class Kimchstew implements Launch {
	int price;
	public Kimchstew() { this.price=4000; }
	@Override public void eat() {System.out.println("김치찌개 먹음");}
	@Override public String toString() { return "김치찌개"; }
	
}


class User {
	int money;
	int cnt;
	Launch[] plate;
	public User() { 
	money = Launch.MONEY; 
	plate= new Launch[3]; 
	cnt=0;
	int menu=0;}
	
	Burger burger = new Burger();
	
	Kimchstew kimch = new Kimchstew();

	void order(Launch launch) { 
		System.out.println(launch.toString()+"하나!");
		if (launch.toString()=="버거") {cnt+=burger.price; plate[0]=burger;  }
		else if (launch.toString()=="김치찌개") {cnt+=kimch.price;plate[1]=kimch;}
		if (cnt > Launch.MONEY) { System.out.println("잔액 부족");} 		
		
		
		} 
						
	
    void show() {
    	
    	System.out.println("주문  : " );
        System.out.println("주문 금액 :");                   ;
        System.out.println();
    }
}
	



public class InterfaceEx003_ver1 {
	public static void main(String[] args) {
		User launchorder = new User();
		launchorder.order(new Burger());
		launchorder.order(new Kimchstew());
		launchorder.order(new Burger());
		launchorder.show();
		
	}

}
