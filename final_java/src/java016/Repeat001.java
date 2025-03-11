package java016;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class UserInfo {
	private String name;
	private int age;
	public UserInfo(String name, int age) { super(); this.name = name; this.age = age; }
	public String getName() { return name; } public void setName(String name) { this.name = name; } public int getAge() { return age; } public void setAge(int age) { this.age = age; }
	@Override
	public String toString() { return "UserInfo [name=" + name + ", age=" + age + "]"; }
	public UserInfo() { }
	
		
	}

public class Repeat001 {
	public static void main(String[] args) {
		List<UserInfo> users = new ArrayList<>();
		users.add(new UserInfo("아이언맨",50));
		users.add(new UserInfo("헐크",40));
		users.add(new UserInfo("캡틴",120));
		
		for(int i=0;i<users.size();i++) {
			UserInfo u = users.get(i);
			System.out.println(u.getName()+u.getAge());
			
		}
		
		for( UserInfo u : users ) {System.out.println(u.getName()+u.getAge()); }
		
		
		Set<UserInfo> user = new HashSet<>();
		user.add(new UserInfo("아이언맨",50));
		user.add(new UserInfo("헐크",40));
		user.add(new UserInfo("캡틴",120));
		
		Iterator<UserInfo> iter = user.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println(user.size());
		for (UserInfo h : user ) {System.out.println(h.getName()+h.getAge()); }
		
		
		
	
	}
}


//Q1. ##1 배열  ##2. 객체    ##3. 유동적
//    ##4 List Set Map


//Q2. ##5 인덱스 o 중첩 o  add get(index) size remove contains
//    ##6 인덱스 x 중첩 x  add get, enhanced for loop, Iterator, size remove contains
//    ##7 Map 사전 [키;값] - 쌍 (Entry) put (add x) get(key) size remove contains








