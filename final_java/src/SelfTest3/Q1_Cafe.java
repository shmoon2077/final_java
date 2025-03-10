package SelfTest3;

class Q1_Cafe {
	String menu;
	int ea;
	int price;
	
	public Q1_Cafe() {	}
	
	public Q1_Cafe(String menu, int ea, int price) {
		this.menu = menu; this.ea = ea; this.price = price; }
		

	void show() {System.out.println(menu+","+ea+","+price); }
	

	public static void main(String[] args) {
		Q1_Cafe a1 = new Q1_Cafe("카페라떼",2,4000);
		a1.show();
		Q1_Cafe a2 = new Q1_Cafe();
		a2.show();
	}
	
	
	
	
	
}


