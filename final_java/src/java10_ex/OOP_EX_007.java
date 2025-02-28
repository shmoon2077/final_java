package java10_ex;

import java.util.Scanner;

class Calc {
	static String name="**계산기**";
	Calc () { }
	int num1,num2; char op; double result;
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 1, 숫자 2, 연산자 입력하세요");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		op = scan.next().charAt(0);}
	void opcalc() { 
			     if (op=='+') {result = num1+num2;}
			else if (op=='-') {result = num1-num2;}
			else if (op=='*') {result = num1*num2;}
			else if (op=='/') {result = (double)num1/num2;}
	}
	void show() {
		opcalc();        //   정수  문자  정수   숫자 "이지만" 문자는 숫자로 저장되기 때문에 num1 앞에 문자열로 넣어주지 않으면 ㅈㅈ
		System.out.println(""+num1+op+num2+"="+( op!='/'? (""+(int)result) : String.format("%.2f",result) ));
	}
	Calc (int num1,int num2,char op) {this.num1=num1;this.num2=num2;this.op=op;}

	
	
}

public class OOP_EX_007 {
	public static void main(String[] args) {
	  System.out.println(Calc.name);  // Calc 내에서 static로 선언한 변수이기 때문에 new를 사용하지 않아도 바로 사용 가능!	
		
	  Calc c1 = new Calc(10,3,'+'); 
	  c1.show();
	  
	   Calc  c2= new Calc();  
	   c2.input();   
	   c2.show();
	}

}


/* OPP_EX_007.java [ Calc.class / public OOP_EX_007 ]
------------------------------- runtime 
[method]
#1. Calc.class / OOP_EX_007. class / Calc.name / main
---------------------------------------------
[heap]                     | [stack]
				     	   |  println(**계산기**)
					       |  #2. main 
Calc {num1,num2,op,result} ←  c1.show()
Calc {0,0,0,0} 초기화 된 녀석 ←  c2.input() c2.show
---------------------------------------------
*/










