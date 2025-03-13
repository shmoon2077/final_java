package SelfTest4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

class Info {
	private int no;
	private String name;
	private int age;
	public Info() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Info(int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Info [no=" + no + ", name=" + name + ", age=" + age + "]";
	}

	
}


public class Q7 {
	public static void main(String[] args) {
		List<Info> list = new ArrayList<>();
		list.add(new Info(1,"iron",45));
		list.add(new Info(2,"hulk",38));
		list.add(new Info(3,"captain",120));
		
		Iterator<Info> iter = list.iterator();
		System.out.println(         
				"==========================\n"+
		        "NO         NAME        AGE\n"+
		        "==========================\n");
		for ( Info a : list ) {System.out.println(a.getNo()+"\t"+a.getName()+"\t"+"\t"+a.getAge());}
		int hap=0;	
		for ( Info total : list ) { hap+=(total.getAge()); }
		double avg=hap/3.0;
		System.out.println("나이 총합 : "+hap);
		System.out.printf("나이 평균 : %.2f",avg);
		
		System.out.println();
		
		HashSet<Info> set = new HashSet<>();
		set.add(new Info(1,"iron",45)); 
		set.add(new Info(1,"hulk",38)); 
		set.add(new Info(1,"captain",120));
		
		Iterator<Info> iter1 = set.iterator();
		System.out.println(         
				"==========================\n"+
		        "NO         NAME        AGE\n"+
		        "==========================\n");
		while(iter1.hasNext()) {
			Info temp = iter1.next();
			System.out.println(temp.getNo()+"\t"+temp.getName()+"\t"+temp.getAge());
			
			}
		int setTotal=0;
		for ( Info a : set ) { setTotal+=(a.getAge()); }
		double setAvg = setTotal/3.0;
		System.out.println("총 나이는 : "+setTotal);
		System.out.printf("평균 나이는 : %.2f ",setAvg);
		
		
		
		HashMap<Integer,Info> map = new HashMap<>();
		map.put(1,new Info(1,"iron",45)); 
		map.put(1,new Info(1,"hulk",38)); 
		map.put(1,new Info(1,"captain",120));
		
		Iterator<Info> iter3 = map.entry(); 
		
		
}
}
