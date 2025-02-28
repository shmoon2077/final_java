package java10;

class Farm {
	Farm() {}
	//멤버 변수
	String name; // 인스턴스 - heap area - new O - this.name
	int age; // 인스턴스 - heap area - new O - this.name
	static String Farmname="(주)동물농장";  // 클래스변수 - method area = new X
	static int num = 10;  // 클래스변수 - method area = new X
	//멤버 함수
	static void num_plus () {num++; /*age++;*/}  // 클래스함수 - method area = new X
	void show () {
		System.out.println("\n\n:::::::::::::::::::");
		System.out.println(":: 회사명 : "+Farm.Farmname);
		System.out.println(":: 식구수 : "+Farm.num);
		System.out.println(":: 이 름  : "+this.name);
		System.out.println(":: 나 이  : "+this.age);
	}
	
	
}
public class OOP005 {
	public static void main(String[] args) {
		System.out.println("Step 1. 클래스 변수-static");
		System.err.println("회사명 >" + Farm.Farmname); Farm.num_plus();
		System.err.println("식구수 >" + Farm.num);
//		System.err.println("회사명 >" + Farm.name);
		
		System.out.println("\n\nStep 2. 인스턴스 변수 - this - 각각");
		Farm cat = new Farm(); cat.name="sally"; cat.age=8; cat.show();
		// cat.Farmname=" " .. 경고 뜸 공유 함수를 cat을 통해 변경하면 안됨
		Farm dog = new Farm(); dog.name="alpha"; dog.age=12; dog.show();

		
	}

}
/*
------------------------------- runtime ---------------------------------
[method 정보,공유] Farm.class / OOP005.class / Farmname /num / num_plus
--------------------------------------------------------------------------
[heap]                   |              [stack]
 {name,age}           	 ←       dog
 {name,age}              ←       cat                      
 						 | #2. main
---------------------------------------------
*/