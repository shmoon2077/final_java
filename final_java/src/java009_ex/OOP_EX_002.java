package java009_ex;

import java.util.Scanner;

class MyPrice001 {
	String name; int price;
	
	String input() {
	  Scanner scan = new Scanner(System.in); // 위치????
	  String result="옳바른 값을 입력하세요";
	  System.out.print("상품명을 입력하셔");
	  this.name=scan.next();
	  System.out.print("가격을 입력하시오");
	  this.price=scan.nextInt();
	  return result;	  
	}
	void show() {
	System.out.print("상품정보"+"\n"+"상품명 : "+this.name+"\n"
						+"가격: "+this.price);
	
	}
	
}

public class OOP_EX_002 {
	public static void main(String[] args) {
		MyPrice001 p1 = new MyPrice001();
		p1.input();
		p1.show();
		
	}
	

}
