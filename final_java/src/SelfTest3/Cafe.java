package SelfTest3;

class Cafe {
	String menu;
	int ea;
	int price;
	
	public Cafe() {	}
	
	public Cafe(String menu, int ea, int price) {
		this.menu = menu; this.ea = ea; this.price = price; }
		

	void show() {System.out.println(menu+","+ea+","+price); }
	

	public static void main(String[] args) {
		Cafe a1 = new Cafe("카페라떼",2,4000);
		a1.show();
		Cafe a2 = new Cafe();
		a2.show();
	}
	
	
	
	
	
}


