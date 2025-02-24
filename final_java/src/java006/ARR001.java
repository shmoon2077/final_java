package java006;

public class ARR001 {
	public static void main (String [] args) {
		int[] arr = null;
		
		int[] arr2 = {1,2,3};
		// heap area(동적메모리)     stack(임시공간)
		// 1번지 {1,2,3}          <- arr2:번지
		
		System.out.println(arr);
		System.out.println(arr2); // [I@372f7a8d 주소값

		System.out.println("1꺼내기 : "+arr2[0]);
		System.out.println("2꺼내기 : "+arr2[1]);
		System.out.println("3꺼내기 : "+arr2[2]);
	
	int[] arr3 = {1,2,3,4,5};
	System.out.println(arr3[3]);
	
	int[] arr4 = {100,200,300};
	System.out.println(arr4[2]);
	
	double[] arr5 = {1.1, 1.2, 1.3};
	System.out.println(arr5[1]);
	
	char[] arr6 = {'a','b','c'};
	System.out.println(arr6[0]);
	System.out.println(arr6[1]);
	System.out.println(arr6[2]);
	
	System.out.println("배열의 갯수 :"+ arr6.length);
	
	for (int a=0;a<=arr6.length-1;a++) {System.out.println(arr6[a]);}
	
	
	
	} // end main
} //end class
