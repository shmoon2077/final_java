package java017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class Milk { 
	private int no;
	private String name;
	private int price;
	public Milk(int no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
		
		
		
	}

	public Milk() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	@Override
	public String toString() {
		return no+"\t"+name+"\t"+price;
	}
	
	public void show() {
		System.out.println("======================");
		System.out.println("NO\tNAME\tPRICE");
		System.out.println("======================");
	}
	
	
}

public class Repeat001 {
	public static void main(String[] args) {
	Milk milk = new Milk();	
	List<Milk> mlist = new ArrayList<>();    /// List에선 Iterator가 필요없지 않나요!!
	
	mlist.add(new Milk(1,"white",1000));
	mlist.add(new Milk(2,"choco",1200));
	mlist.add(new Milk(3,"banana",1300));
	
	milk.show();
	for ( Milk m : mlist ) {
		System.out.println(m.getNo()+"\t"+m.getName()+"\t"+m.getPrice());
	}
	
	
	HashSet<Milk> mset = new HashSet<>();
	mset.add(new Milk(1,"white",1000));
	mset.add(new Milk(2,"choco",1200));
	mset.add(new Milk(3,"banana",1300));
	
	Iterator<Milk> iter = mset.iterator();
	
	milk.show();
	while (iter.hasNext()) {
		System.out.println(iter.next());
	}
	
	
	
	Map<Integer,Milk> mmap = new HashMap<>();
	mmap.put(1,new Milk(1,"white",1000));
	mmap.put(2,new Milk(2,"choco",1200));
	mmap.put(3,new Milk(3,"banana",1300));
	
	Iterator<Entry<Integer,Milk>> miter = mmap.entrySet().iterator();
	Iterator<Integer> key = mmap.keySet().iterator();
	Iterator<Milk> value = mmap.values().iterator();
	
	milk.show();
	for ( Integer a : mmap.keySet() ) { 
		System.out.println(value.next());
	}
	
	
	
	
	
	
	
	
	
	
}
}