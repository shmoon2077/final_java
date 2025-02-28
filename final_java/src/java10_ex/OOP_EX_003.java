package java10_ex;

class Coffee {
String name; int price,num;

public Coffee () { this.name="아메리카노"; this.price=2000; this.num=1; }  // 기본 생성자 자동생성 취소
public Coffee(String name, int price, int num) {
	this.name = name;
	this.price = price;
	this.num = num;
}

void show() {
	 System.out.println(
			 "==========코히"+"\n"+
			"커피명 : "+this.name+"\n"
		   +"커피잔수 : "+this.num+"\n"
		   +"커피가격 : "+(this.num*this.price));
 }




}
public class OOP_EX_003 {
	public static void main(String[] args) {
		Coffee c1 = new Coffee();
		c1.show();
		
		Coffee c2 = new Coffee("바닐라라떼",4000,2);
		c2.show();
		
	}

}
