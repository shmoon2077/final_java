package java011;

public class Apple{   //// 실행 main과 파일을 분리해주세요!
	   private String name;
	   private String order;
	   private int num;
	   private int price;
   
	   
	   public Apple(String name, String order, int num, int price) {
		this.name = name;
		this.order = order;
		this.num = num;
		this.price = price;
	}
	   
	public String getName() { return name; } public void setName(String name) { this.name = name; } public String getOrder() { return order; } public void setOrder(String order) { this.order = order; } public int getNum() { return num; } public void setNum(int num) { this.num = num; } public int getPrice() { return price; } public void setPrice(int price) { this.price = price; }

	@Override
	public String toString() {return "Apple [name=" + name + ", order=" + order + ", num=" + num + ", price=" + price + "]";}
	   
	   
	   

}
