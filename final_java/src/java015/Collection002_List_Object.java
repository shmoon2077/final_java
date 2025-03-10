package java015;

import java.util.ArrayList;
import java.util.List;

// 1. Dto (데이터 전달 : 생성자 , toString, get/set)

class Milk {
	private int mno;
	private String name;
	private int mprice;
	@Override public String toString() { return "Milk [mno=" + mno + ", name=" + name + ", mprice=" + mprice + "]"; }
	
	public Milk () {}
	
	
	public Milk(int mno, String name, int mprice) {
		this.mno = mno;
		this.name = name;
		this.mprice = mprice;
	}



	public int getMno() { return mno; }
	public void setMno(int mno) { this.mno = mno; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getMprice() { return mprice; }
	public void setMprice(int mprice) { this.mprice = mprice; }
	
		
	
}

public class Collection002_List_Object {
	public static void main(String[] args) {
		List<Milk> milks = new ArrayList<>();
		
		milks.add( new Milk(1, "White", 1200));
		milks.add( new Milk(2, "Choco", 1400));
		milks.add( new Milk(3, "Banana", 1500));
		
		
		for (int i=0;i<milks.size();i++) {
			Milk temp = milks.get(i);
			System.out.println(temp.getMno()+"/"+temp.getName()+"/"+temp.getMprice());
		}
		
		
		
		//enhanced for loop
		for (Milk temp : milks) { 
			System.out.println(temp.getMno()+"/"+temp.getName()+"/"+temp.getMprice());
		}
		
		
		
	}

}
