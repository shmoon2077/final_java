package java007_ex;

public class Arr2Ex006 {
	public static void main(String[] args) {
		int[][] datas = { {10,10,10,10},{20,20,20,20},{30,30,30,30}};
		int colresult = 0;
		int rowresult = 0;
		int total=0;
		int[][] result = new int[datas.length+1][datas[0].length+1];
		
		
		for (int row=0;row<datas.length;row++) {
			for (int col=0;col<datas[row].length;col++) {
				System.out.print(datas[row][col]);
			}
		
		
	
		
		
		
		
		
		for (int r=0;r<=datas.length+1;r++) {
			for (int c=0;c<=datas[0].length+1;c++) {
				
			}
		}
		
		
//		 for (int col=0; col<datas.length+1;col++) {colresult+=datas[0][col];}
//		 for (int row=0; row<datas.length;row++) {rowresult+=datas[row][0];}
		
		 
//		 System.out.println(colresult+"1열의 합계");
//		 System.out.println(rowresult+"1행의 합계");
		 
	}
}
}
/*
 * 연습문제14)  array
패키지명 : com.company.java007_ex
클래스명 :  Array2Ex006
배열을 이용하여 다음의 프로그램을 작성하시오.   
1. 다음의 주어진조건을 이용하여 총점과 평균을 구하시오.

int[][] datas = {  {  10, 10, 10 ,10}, 
            {  20, 20, 20 ,20}, 
            {  30, 30, 30 ,30},  
};  // 3층 4칸 
int[][] result = new int[datas.length+1][datas[0].length+1];


출력내용:
10   10   10   10   40   
20   20   20   20   80   
30   30   30   30   120   
60   60   60   60   240   

 * */
