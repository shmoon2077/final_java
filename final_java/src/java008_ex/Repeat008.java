package java008_ex;

public class Repeat008 {
	public static void main(String[] args) {
	
		int[] arr = new int[3];
		
		int data=10;
		
		for(int i=0;i<arr.length;i++) { arr[i]=data;
			data+=10; System.out.print(arr[i]+"\t");
		}
				
		
	}
}
