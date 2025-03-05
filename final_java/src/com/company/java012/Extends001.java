package com.company.java012;

//1. 클래스는 부품객체
//2. 상태(멤버변수)와 행위(멤버함수)
/*3. 상속- 재활용
    Object    {   }
     ↑
     A1       int a
     ↑
     B1       int b
     ↑   
     C1       int c
 */
class A1 extends Object {
	int a;
	public A1() { super(); }
}  // ctrl + shift + f

class B1 extends A1 {
	int b;
	public B1() { super(); }
}

class C1 extends B1 {
	int c;
	public void show() { System.out.println(a + "/" + b + "/" + c); }
}

public class Extends001 {
	public static void main(String[] args) {
		C1 c1 = new  C1();   
		c1.a=1;  c1.b=2;  c1.c=3;   c1.show();
	}
}
/*
--------------------------------------
[method] A1.class, B1.class, C1.class  , public  Extends001.class  #1
--------------------------------------
[heap]				| [stack]
19번 1번지 {c}
					| main #2
-------------------------------------- 
 */


