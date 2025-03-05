package java012_ex;
//1. 클래스는 부품객체
//2. 상태는            멤버변수 + 행위는     멤버함수 
//3. 상속 - 클래스 재사용(재활용)    
//		   오버라이드(@Override)- 부모메서드 나한테맞게 수정
/*			
					Object
			↑					↑
		Grand( one(),two() )    Aunt( name, toString() )
	   ↑		  ↑
	Father		Uncle
	(three())	(four()/ one(), two())
*/
class Grand  extends Object{
	public void one() {  System.out.println("Grand: one"); }
	public void two() {  System.out.println("Grand: two"); }
}// end Grand

class Aunt   extends Object{ 
	String name="MiMi";
	@Override public String toString() { return name + " 옆집이모클래스"; }
}// end Aunt

class Father extends Grand {
	public void three() {  System.out.println("Father: three"); }
}// end Father

class Uncle  extends Grand {
	public void four() {  System.out.println("Uncle: four"); }
	public void one() {  System.out.println("Uncle: one"); }
	public void two() {  System.out.println("Uncle: two"); }
}// end Uncle

public class Extends004 {
	public static void main(String[] args) {
		Father father = new Father();  father.three();   father.two();   father.one();  
		//↑ Object(){#3    }#4 객체틀만들고
		//↑  Grand(){#2    }#5 one(),two()  사용가능!
		//↑ Father(){#1    }#6 three()      사용가능!  본인께 없으면,,,, 부모클래스에서 사용
		System.out.println();  System.out.println();
		
		Uncle uncle = new Uncle();  uncle.four();   uncle.two();   uncle.one(); 
		//↑ Object(){#3    }#4 객체틀만들고
		//↑  Grand(){#2    }#5         one(),two()  사용가능!  Override :부모클래스와 같은메서드 재정의
		//↑  Uncle(){#1    }#6 four(), one(),two()  사용가능!  우선순위 - 자식메서드(내꺼) 우선
		System.out.println();  System.out.println(); 
		
		Aunt  aunt = new Aunt();
		System.out.println(aunt);  // MiMi 옆집이모클래스   @Override
	}
}
/*			
		Object
		↑					↑
Grand( one(),two() )    Aunt( name, toString() )
	↑		  ↑
	Father		Uncle
	(three())	(four()/ one(), two())
*/









