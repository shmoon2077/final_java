package java007_ex;

public class Arr2Ex004 {
	public static void main(String[] args) {
		char[][] arr = new char[2][3];
		char fir = 'A';
		for (int row=0;row<arr.length;row++) {
			for (int col=0;col<arr[row].length;col++)
			{arr[row][col]=fir++;System.out.print(arr[row][col]);}
		System.out.println();
		}
		
	}

}
