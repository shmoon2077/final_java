package java015_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Fruits {
	private int no;
	private String name;
	private int price;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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
	public Fruits(int no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}
	
	
	
}







public class ListEx004 {
	public static void main(String[] args) {
	List<Fruits> fruits = new ArrayList<>();
	fruits.add( new Fruits(1,"apple",2000));
	fruits.add( new Fruits(2,"banana",2500));
	fruits.add( new Fruits(3,"coconut",4500));

	
	for (int i=0;i<fruits.size();i++) {
		Fruits temp = fruits.get(i);
		System.out.println(temp.getNo()+","+temp.getName()+","+temp.getPrice());
	}
	
	for (Fruits temp : fruits) { System.out.println(temp.getNo()+","+temp.getName()+","+temp.getPrice());}
	
	Scanner scan = new Scanner(System.in);
	String [] fruitinfo = {"사과는 빨개", "바나나는 맛있어", "코코넛은 맛없어"};
	System.out.print("1~3 과일 숫자를 입력하시오");
	int num = scan.nextInt();

	int find=-1;
//	if ( fruits.get(0).getNo()==num) {find=0;}
//	if ( fruits.get(1).getNo()==num) {find=1;}
//	if ( fruits.get(2).getNo()==num) {find=2;}
//	과일 꺼내오기 -> 과일 번호 == 입력한 값
	for (int i=0;i<fruits.size();i++) {
		if( fruits.get(i).getNo()==num) {find=i; }
	}
	System.out.println("번호: "+fruits.get(find).getNo());
	System.out.println("이름: "+fruits.get(find).getName());
	System.out.println("가격: "+fruits.get(find).getPrice());
	System.out.println( fruitinfo[find]);
	
	
	
	
	
	
	}
}
