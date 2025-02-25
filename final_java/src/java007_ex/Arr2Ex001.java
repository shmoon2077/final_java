package java007_ex;

public class Arr2Ex001 {
	public static void main(String[] args) {
		int[][] arr2 = { 
						{100,200,300},
						{400,500,600}
						};
		
		for (int row=0;row<arr2.length;row++) {
			for (int col=0;col<arr2[row].length;col++) {
				if(row==1 && col==0) {System.out.println();}
			System.out.print(arr2[row][col]+"\t");
			};
		};
	
		
	 }	
	} // end class
