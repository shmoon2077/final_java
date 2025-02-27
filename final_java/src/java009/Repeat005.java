package java009;

import java.util.Arrays;

public class Repeat005 {
	public static void main(String[] args) {
		char[][] arr = new char[2][3];
		char i = 'a';
		for(int a=0;a<arr.length;a++) {
			for(int b=0;b<arr[a].length;b++)
			{arr[a][b]=i++;}
		}
		System.out.println(Arrays.deepToString(arr));
	}
	}

