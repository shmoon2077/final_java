package java10_ex;

class Area1 {
    static float pi = 3.14159f;
//	int num1, num2;
//	Area1 (int num1, int num2){ this.num1=num1; this.num2=num2; }
//	static void pi () { (float)3.141559 }
//	
	static double rect(int num1,int num2) { return num1*num2;} 
	static double triangle(int num1,int num2) { return num1*num2*0.5;} 
}









public class OOP_EX_008 {
	public static void main(String[] args) {
		   System.out.println("원의 면적    : " + 10 * 10 * Area1.pi);
		   System.out.println("사각형의 면적 : " + Area1.rect(10, 5));
		   System.out.println("삼각형의 면적 : " + Area1.triangle(10, 5));
	
}
}
/*
출력내용 : 
원의 면적    : 314.159
사각형의 면적 : 50.0
삼각형의 면적 : 25.0
*/