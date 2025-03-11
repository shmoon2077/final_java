package java016_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

class UserInfo {
	private String name;
	private int age;
	public UserInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return " "+"name :" + name + ", age :" + age;
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
	
	
	
}


// int 와 Integer 차이 반드시 숙지할 것. int는 그냥 변수일 뿐이고, Integer는 객체

public class MapEx002 {
	public static void main(String[] args) {
		Map<Integer,UserInfo> map = new HashMap<>();
		map.put(  1,  new UserInfo("아이언맨"    , 50) );  // 1 넣어도 Integer( 클래스, 객체 )
		map.put(  2,  new UserInfo("헐크"       , 40) );  // wrapper 클래스
		map.put(  3,  new UserInfo("캡틴"       , 120) ); // boxing
		map.put(  1,  new UserInfo("아이언맨-new", 50) ); 

			
		for( Integer key : map.keySet() ) {System.out.println(key+". "+map.get(key));}
		
		for ( Entry<Integer,UserInfo> m : map.entrySet()) {
			System.out.println(m.getKey()+" / "+m.getValue());
		}

		
		
		Iterator<Entry<Integer, UserInfo>> iter = map.entrySet().iterator();
		while(iter.hasNext()) {			
			Entry<Integer,UserInfo> info = iter.next();
			System.out.println(info);
		}
		
		
		Iterator<Integer> iterI = map.keySet().iterator();
		while(iterI.hasNext()) {
			Integer key = iterI.next();
			System.out.println(key+ "★" + map.get(key));
		}
		
		
		
		
	
	}}
