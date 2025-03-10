package java015_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

class Userinfo2 {
	private int no;
	private String name;
	private int age;
	
	public int getNo() { return no; }  public void setNo(int no) { this.no = no; }  public String getName() { return name; }  public void setName(String name) { this.name = name; }  public int getAge() { return age; }  public void setAge(int age) { this.age = age; }

	public Userinfo2(int no, String name, int age) {
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	public Userinfo2 () {}

	@Override public String toString() { return "Userinfo2 [no=" + no + ", name=" + name + ", age=" + age + "]"; }

	
	@Override public int hashCode() { return Objects.hash(no, name, age); } // 객체 기반 생성 확인 (해시코드)
	@Override
	public boolean equals(Object obj) { //2.  객체 안의 값이 같은지 확인
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Userinfo2 other = (Userinfo2) obj;
		return age == other.age && Objects.equals(name, other.name) && no == other.no;
	}
	
	
		
}

public class SetEx002 {
	public static void main(String[] args) {
		Set<Userinfo2> users = new HashSet<>();
		users.add(new Userinfo2(1, "아이언맨" , 50));
		users.add(new Userinfo2(2, "헐크" ,40));
		users.add(new Userinfo2(3, "캡틴" , 120));
		users.add(new Userinfo2(3, "캡틴" , 120));
		
		System.out.println("회원수 >"+users.size()); // 4명 나오는데 3명으로 바꾸기 set은 중복허용 x
		System.out.println(users.getClass());
		
		// 향상된 for loop
		for ( Userinfo2 u : users ) { System.out.println(u.getNo()+","+u.getName()+","+u.getAge()); }
	
	    Iterator<Userinfo2> iter = users.iterator();
	    while (iter.hasNext()) {
	    	Userinfo2 u = iter.next();
	    	System.out.println(u.getNo()+","+u.getName()+","+u.getAge());   }
	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("정보를 출력하고 싶은 이름을 입력하세요");
	String name = scan.next();
	
	// set에서 데이터 꺼내와 / 해당 데이터의 이름과 같다면 / 해당 유저의 자료 출력
	
		iter = users.iterator();
		for ( Userinfo2 u : users ) {
			if(u.getName().equals(name)) {
				System.out.println(u.getNo()+","+u.getName()+","+u.getAge());}
		}
	
	

	}
	}


