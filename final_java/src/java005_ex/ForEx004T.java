package java005_ex;

public class ForEx004T {
	public static void main (String [] args) {
		//1~10까지 3의 배수 갯수를 출력  
		//변수
		int cnt=0;
		//입력
		//처리
		//ver1
		//만약 1이 3의 배수라면 갯수 카운트
		//만약 2이 3의 배수라면 갯수 카운트
		//만약 3이 3의 배수라면 갯수 카운트
		//ver2
		//if(1이 3의 배수라면) { 갯수 카운트 }
//		if(1%3==0) { cnt++; }
//		if(2%3==0) { cnt++; }
//		if(3%3==0) { cnt++; }
		for (int i=1; i<=10; i++) { if(i%3==0) { cnt++; } } 
		//출력
		System.out.println("1~10까지의 3의 배수 :" +cnt);
		
		
		
	}

}
