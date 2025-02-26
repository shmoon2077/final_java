package java008_ex;

public class MethodEx002 {
	static int result=0; 
	public static void test1(int a) {System.out.println(a);};
	public static void test2(double b) {System.out.println(b);};
	public static int hap(int num1,int num2) {for (int w=num1;w<=num2;w++) {
		result+=w;
	}
		System.out.println(result);
	    return result;
	    };
	    
	public static void disp(int c, char d) { 
	for (int i=0;i<c;i++) {System.out.print(d);}
	}
	
	
	
	
	
	public static void main(String[] args) {
		test1(10);
		test2(1.2);
		hap(1,10);
		disp(7,'*');
		
		
	}
		
	}


