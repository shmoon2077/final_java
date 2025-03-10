package Array;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {10,20,30,40,50};
		
		
		System.arraycopy(arr1, 0, arr2, 1, 4);
			for (int i=0;i<arr2.length;i++) {
				System.out.println(arr2[i]);
			}
		
		
		
		
	}

}
