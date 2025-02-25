package java007_ex;

public class Arr2Ex003 {
	public static void main(String[] args) {
		int[][] arr = new int [2][3];
		int data = 101;
		
		for (int row=0;row<arr.length;row++) {
			for (int col=0;col<arr[row].length;col++)
			{arr[row][col]=data++;System.out.print(arr[row][col]+"\t");}
			System.out.println();
		}
		
	}

}
