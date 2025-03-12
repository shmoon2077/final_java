package java017;

interface Intertest21 { void test(); }
interface Intertest22 { void test(int a);}
interface Intertest23 { int test(); }
interface Intertest24 { int test(int a);}

public class Repeat002_Lambda {
	public static void main(String[] args) {
		Intertest21 hi = ()-> {System.out.println("안녕");
		};
		hi.test();
		
		Intertest22 hihi = (int a)-> { System.out.println("안녕".repeat(a));}; 
		hihi.test(3);
		
		Intertest23 num = ()-> { int result=3; return result; };
		System.out.println(num.test());
		
		Intertest24 ten = (int a)-> { int result=a*10; return result;};
		System.out.println(ten.test(3));
		
	}

}
