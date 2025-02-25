package java007;

import java.util.Arrays;

public class Arr2_002 {
	public static void main(String[] args) {
		int [][] arr = new int [2][3]; // 2행 3열 공간만 빌리기
		
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[0][2] = 3;
//		
//		arr[1][0] = 4;
//		arr[1][1] = 5;
//		arr[1][2] = 6;
		
//		int data=1;
//		arr[0][0] = data++; arr[0][1] = data++;arr[0][2] = data++;
//		arr[1][0] = data++;arr[1][1] = data++;arr[1][2] = data++;
		
		int data=1;
		for (int row=0;row<arr.length;row++) {;
		 for (int col=0;col<arr[row].length;col++)
		 {arr[row][col]= data++;System.out.print(arr[row][col]);}
		 System.out.println();
		}
		
		System.out.println(Arrays.deepToString(arr));
		
		
		
		
		
		
		
		
		
	}
}
