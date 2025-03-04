package java011_ex;

class User002 {
	final String nation = "Korea";
	final String jumin;
	String name;
	
	

public  User002() {
	this.jumin = ""; }
public  User002(String jumin, String name) {
	this.jumin=jumin;
	this.name=name;
	
}
@Override
public String toString() {
	return "User002 [nation=" + nation + ", jumin=" + jumin + ", name=" + name + "]";
}
	
}
public class FinalEx {
	public static void main(String[] args) {
		User002 user1 = new User002("123456-1234567", "아이유");
		System.out.println(user1);
		
//		user1.nation = "USA"; final이라 수정 불가
//		user1.jumin = "123123-1234321"; final이라 수정 불가
		user1.name="IU";
		System.out.println(user1);
	}

}

/*
-------------------------------------
[method:정보]   User002.class   , FinalEx.class , final{nation, jumin}  //##1
-------------------------------------
[heap]                       | [stack]
1번지 : {nation, jumin,name }
                         |  main  //##2
-------------------------------------
 */
