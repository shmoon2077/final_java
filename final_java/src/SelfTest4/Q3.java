package SelfTest4;

class Milk1 {
	private String name;
	private int price;
	
	

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




	public Milk1(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	


	@Override
	public String toString() {
		return "Milk1 [name=" + name + ", price=" + price + "]";
	}




	public Milk1() {
		super();
	}
	
		
	
	
}

public class Q3 {
	public static void main(String[] args) {
		Milk1 m1 = new Milk1("choco" , 1200);
		 	System.out.println( m1.getName()+"/"+m1.getPrice() );  // 출력된 결과 : choco / 1200
		 	Milk1 m2 = new Milk1("white",1300);
		 	System.out.println( m2.getName()+"/"+m2.getPrice() );  // 출력된 결과 : white / 1300
			}

}
