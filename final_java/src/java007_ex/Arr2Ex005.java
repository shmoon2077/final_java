package java007_ex;

public class Arr2Ex005 {
	public static void main(String[] args) {
		int[][] arr = { {1,1,1},{2,2,2},{3,3,3},{4,4,4} };
		int total = 0;
		double avg = 0.1;
		
		//총점
		//평균
		for (int col=0;col<arr.length;col++) {
			for (int row=0; row<arr[col].length;row++) {
				total+=arr[col][row];}};
				avg=total/4;
			
		
		System.out.println("총합은"+total+"평균은"+avg);		
		
	}

}
