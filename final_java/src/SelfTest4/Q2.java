package SelfTest4;

//Q2.  인스턴스변수, 클래스변수를 구분하시오.
class Test{
	static int cv = 1;  
	int iv = 1;          
	static {cv=2;}
	{iv=2;}
	Test(){  iv=3; }
}
public class Q2 {
	public static void main(String []args) {
		System.out.println(" 다음 중 인스턴스변수의 초기화 순서를 적으시오.  ");  // ####
		Test t1 = new Test();  System.out.println(t1.iv);
	   
		
	}
}


 
/*runtime area [  method  | heap | stack | pc register | navtive method stack]
ㅁ 클래스변수 :   static int cv
	기본값 	| 명시적 초기화  = | 클래스 초기화블럭  { }
	[             1               2       ]
ㅁ 인스턴스 변수 : int iv 
	기본값	| 명시적 초기화  =  | 인스턴스 초기화 블록 | 생성자
	[  0          1               2 			   3  ]
	[  ###     ####               #### 			  ####]*/
	  
	  
	  
	  
	 
