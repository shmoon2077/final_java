package java017;

class RefClass { void method(String str) {System.out.println(str);}}
interface InterUsing { void inter(RefClass c,String str);}



public class Lambda003_ref {
	public static void main(String[] args) {
		//#1. 익명 클래스
		InterUsing a1 = new InterUsing() {
			@Override
			public void inter(RefClass c, String str) {
				c.method(str);}
		};
		a1.inter(new RefClass(), "Hello TT");
		
		
		//#2. 람다 ()->{ }
		InterUsing a2 = (RefClass c,String str) -> { c.method(str);};
		a2.inter(new RefClass(), "Bye");
			
		//#3. :: 표현식 (참조)
		
		InterUsing a3 = RefClass::method;
		a3.inter(new RefClass(), "집에 가고 싶다");
		
		InterBasic basic = (int a ,int b) -> { return Math.max(a, b);};
		System.out.println( basic.method(10, 1520));
		
		
		InterEx1 ex1 = str->str.length();
		//            ▼
		InterEx1 ex11 = String::length;
		System.out.println(ex11.method("ABC"));
		
		InterEx2 ex2 = num->System.out.println(num);
		//            ▼
		InterEx2 ex22 = System.out::println;
		ex22.method(50500);
	}
}




interface InterBasic { int method(int a, int b); }
interface InterEx1 { int method(String str); }
interface InterEx2 { void method(int num); }