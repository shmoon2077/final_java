package java008_ex;

public class Arr2Ex008 {
	public static void main(String[] args) {
		//변수
		int[][] arr = new int[4][4];
		int data=1;
		
		for (int row=0;row<arr.length;row++) { 
		for(int col=0;col<arr[row].length;col++) {arr[row][col]=data++;
		System.out.print(arr[row][col]+"\t");}
		
		data=1;System.out.println(); // 층 끝나면 해야할 일 
		}
	}
}
