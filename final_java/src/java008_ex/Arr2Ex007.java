package java008_ex;

public class Arr2Ex007 {
public static void main(String[] args) {
	int[][] arr = new int[5][5];
	int data = 1;
	
	for (int row=0;row<arr.length;row++) {
	for (int col=0;col<arr[row].length;col++) {
		arr[row][col]=data; data++; System.out.print(arr[row][col]+"\t");}
	    System.out.println();
	}
	

	
	
	
	
	
	
}
}
