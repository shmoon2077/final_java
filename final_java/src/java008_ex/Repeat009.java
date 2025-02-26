package java008_ex;

public class Repeat009 {
	public static void main(String[] args) {
//		int[][] arr = new int[2][3];
//		int result=0;
//		for(int row=0;row<arr.length;row++) {
//			for (int col=0;col<arr[row].length;col++) {
//				arr[row][col]=result;result+=10; System.out.print(Arrays.deepToString(arr));
//			}
//			System.out.println();
//		}
//		
		int[][] arr = new int[2][3];
		
//				arr[0][0] = 10;
//				arr[0][1] = 20;	
//				arr[0][2] = 30;	
		
//		int data=10;
//		 for (int col=0; col<3;col++) {arr[0][col] = data; data+=10;}
//		 data = 50;
//		 for (int col=0; col<3;col++) {arr[1][col] = data; data+=10;}
		
		
		int data=10;
		
		for (int row=0;row<3;row++) {
			for(int col=0; col<3; col++) {
				arr[row][col] = data; data+=10;}
			}
		

				
				
				
				
				
				
				
				
				
//				arr[1][0] = 50;				
//				arr[1][1] = 60;
//				arr[1][2] = 70;	
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				for (int row=0;row<arr.length;row++) {
					for (int col=0;col<arr[row].length;col++) {
						System.out.print(arr[row][col]+"\t");
					}
					System.out.println();
				}
		
		
	}
}
