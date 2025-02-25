package java007;

import java.util.Arrays;

public class Arr2_001 {
	public static void main(String[] args) {
		int[][] arr = { {1,2,3} , // 00 01 02
			         	{4,5,6}	  // 10 11 12		
					  }; 
		System.out.println( arr );
		System.out.println( Arrays.toString(arr));
		System.out.println( Arrays.deepToString(arr));
		
		
		// 1. 눈에 보이는대로
		System.out.print(arr[0][0]+"\t");System.out.print(arr[0][1]+"\t");System.out.print(arr[0][2]+"\t"); 
		System.out.println();
		System.out.print(arr[1][0]+"\t");System.out.print(arr[1][1]+"\t");System.out.print(arr[1][2]+"\t");   
		System.out.println();
		
		
		
		//2. 칸 정리
		
		for(int kan=0; kan<3; kan++) {System.out.print(arr[0][kan]);};
		System.out.println();
		for(int kan=0; kan<2; kan++) {System.out.print(arr[kan][0]);};
		System.out.println();
		
		
		//3. 층 정리
		for (int ch=0;ch<2;ch++) {
			for(int dan=0;dan<3;dan++) {System.out.print(arr[ch][dan]+"\t");}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	} // end main

} // end class
