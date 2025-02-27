package java009;

import java.util.Arrays;

public class Method005 {
	public static void show(int a) { System.out.println(a*10);}
	public static void show(int a, int b, int c) { System.out.println(a*100+"\t"+b*100+"\t"+c*100+"\t");}
	public static void show(int[] a) {
		System.out.println( "show3. 배열의 주소값: " +System.identityHashCode(a) );
		a[0]+=10; a[1]+=10; a[2]+=10;
	}
	
 public static void main(String[] args) {
	 int []a = {1,2,3};
	 // [heap]1번지 {1,2,3} ← [stack] a : 1번지
	 
	 show(a[0]);
	 
	 show(a[0],a[1],a[2]);
	 
	 show(1     ,   2,    3); // value -> call by value
	 
	 System.out.println( "1. 배열의 값 : " + Arrays.toString(a));
	 System.out.println( "2. 배열의 주소값: " +System.identityHashCode(a) );

	 //
	 show(a);
	 System.out.println("main4. 배열값 : "+ Arrays.toString(a));
}
}
