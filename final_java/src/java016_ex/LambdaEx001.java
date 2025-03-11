package java016_ex;

interface InterA2{  void hi1();}    
interface InterB2{  void hi2(String name);}  
interface InterC2{  String hi3();}   
interface InterD2{  String hi4(int num, String name);} 

public class LambdaEx001 {
public static void main(String[] args) {
	
	InterA2 a2 = ()-> {System.out.println("hi?");};
	a2.hi1();
	
	System.out.println();
	
	InterB2 b2 = (name)-> {System.out.println("hi!!"+name);};
	b2.hi2(" sally?");
	
	System.out.println();
	
	InterC2 c2 = ()-> {System.out.println("안녕?"); return null; };
	c2.hi3();
	
	System.out.println();
	
	InterD2 d2 = (num,name)-> {System.out.println(num+"마리의 "+name+"들아 안녕?");
	return null;};
	d2.hi4(3,"sally");
	
	
	
	
	
	
	
	
	
	
	
}
}
