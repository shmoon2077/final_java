package java005_ex;

public class ForEx004T2_u {
	public static void main (String [] args) {
		//1~10까지 3의 배수 갯수를 출력  
		//변수
		String result = "3의 배수 : ";
		int cnt=0;
		//입력
		//처리
		//ver1
		//만약 1이 3의 배수라면 갯수 카운트
		//만약 2이 3의 배수라면 갯수 카운트
		//만약 3이 3의 배수라면 갯수 카운트
		//ver2
		//if(1이 3의 배수라면) { 갯수 카운트 }
//		if(1%3==0) { cnt++; } System.out.println(result+cnt==3?i:","+i
//		if(2%3==0) { cnt++; result += (cnt==1?"":",")+i; }
//		if(3%3==0) { cnt++; }
		for (int i=1; i<=10; i++) { if(i%3==0) { cnt++; result += (cnt==1?"":",")+i; } } 
		//출력
		System.out.println( result + "\n갯수 : " +cnt);
		
		
		
		//3의 배수 : 3, 6 ,9
		// 갯수 : 3개
		
	}

}
