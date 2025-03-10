package java015_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class UserInfo {
	private String name;
	private int age;
	public UserInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;	}
	
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }

	}

public class ListEx003 {
	public static void main(String[] args) {
		List<UserInfo> users = new ArrayList<>();
		users.add( new UserInfo("아이언맨",50));
		users.add( new UserInfo("헐크",40));
		users.add( new UserInfo("캡틴",120));

	for (int i=0;i<users.size();i++) {
		UserInfo temp = users.get(i);
		System.out.println(temp.getName()+"/"+temp.getAge());
	}
	
	for ( UserInfo temp : users ) {System.out.println(temp.getName()+"/"+temp.getAge());}
	
	
	Scanner scan = new Scanner (System.in);
	System.out.print("이름을 입력하세요");
	String name = scan.next();
		
	
	for (int i=0;i<users.size();i++) {
		if (users.get(i).getName().equals(name)) {
		UserInfo temp = users.get(i);
		System.out.println(temp.getName()+"/"+temp.getAge());
		break;
	}
	}
	
		
		
	}
}
