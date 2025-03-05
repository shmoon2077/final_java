package SelfTest;

public class SelfTest017 {
	public static void main(String[] args) {
		
		int data = 1;
		int[][] arr = new int[4][5];
		for(int row=0;row<arr.length;row++) {
			for (int col=0;col<arr[row].length;col++) {
				arr[row][col] = data++;
			}
		}
		
		
		for (int row=0;row<arr.length;row++) {
			for (int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col]+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
