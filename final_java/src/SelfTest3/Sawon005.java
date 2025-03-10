package SelfTest3;

public class Sawon005 {
	int pay=10000;
	
	static int su=10;
	static int basicpay=pay; // 클래스 변수에 인스턴스 변수를 담으려 해서 오류
	static int basicpay2;
	static { basicpay2=20000; }

	public static void showSu() {System.out.println(su);} 
	public static void showPay() {System.out.println(this.pay);} //클래스 함수에 지역 변수 사용
	
		
}
