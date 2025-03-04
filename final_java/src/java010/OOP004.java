package java010;


class Product {
	String name; int price; String origin;
	
	public Product () {System.out.println("원하는 값으로 초기화-수동생성시 컴파일러 자동생성 취소");};
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;	}
	public Product(String name, int price, String origin) {
		super();
		this.name = name;
		this.price = price;
		this.origin = origin;
	} 
	
	
	
	
}
   

public class OOP004 {
	public static void main(String[] args) {
		
		Product p1 = new Product();
		Product p2 = new Product("apple",1500);
		Product p3 = new Product("DragonFruit",25600,"Indonesia");
		
		System.out.println(p2.name+"\t"+p2.price);
		System.out.println ("제품 명 : "+p3.name+"\n"+"가격 : "+p3.price+"\n"+"원산지 : "+p3.origin);
		
	}

}
