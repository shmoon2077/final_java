package SelfTest;

public class SelfTest016 {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		
		for (int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				arr[row][col] = (100 * (row+1))+col;}
		}
	
		
		for (int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col]+"\t");
			}
			System.out.println();
		}
				
		
	}
	}
