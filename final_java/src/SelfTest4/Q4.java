package SelfTest4;

class Milk {
	private String name;
	private int price;
	public Milk(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Milk [name=" + name + ", price=" + price + "]";
	}
	public Milk() { super();  }
	
}

class MilkPrint {

	public MilkPrint() { super(); }
	
	
	public void show(Milk[] milks) {
		for ( Milk a : milks ) {System.out.println(a);}
		}
	
		
	}
	
	


public class Q4 {
	public static void main(String[] args) {
		Milk []milks = new Milk[3];   
		milks[0] = new Milk("white",1000);
		milks[1] = new Milk("choco",1200);
		milks[2] = new Milk("banana",1500);
		
		MilkPrint  print = new MilkPrint();   
		print.show(milks);	
		/* 출력된 결과 : 
		 * white  / 1000
		 * choco  / 1200
		 * banana / 1500*/ 
	}

}
