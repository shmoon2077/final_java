package java007_ex;

public class Arr2Ex002 {
	public static void main(String[] args) {
		int[][] arr2 = {
						{101,102,103},
						{201,202,203}
						}; 
		
		for (int row=0;row<arr2.length;row++) {
			for (int col=0;col<arr2[row].length;col++) 
			{System.out.print(arr2[row][col]+"\t");
			}
			System.out.println();
		}
		
		
	} // end main
} // end class
