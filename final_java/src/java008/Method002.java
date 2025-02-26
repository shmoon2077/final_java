package java008;

public class Method002 {
	//
	public static void myint(int a) {System.out.println(a);}
	
	public static int myaddd(int b, int c) { int result = b+c;
	System.out.println(b+"+"+c+"="+result);
	return result;
	}
	
	public static void main(String[] args) {
		myint(1);
		myint(2);
		myint(3);
	
		myaddd(1,3);
		myaddd(10,3);
	}

}
