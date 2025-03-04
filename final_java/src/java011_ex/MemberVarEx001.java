package java011_ex;

class Sawon3 {
	int pay = 10000; // 인스턴스 변수
	static int su = 10; // 클래스 변수
	
	static int basicPay = pay; // 클래스 변수 (클래스 변수/메서드엔 this, 인스턴스 사용 불가 ㅇㅇ)
	static int basicPay2; //클래스 변수
	
	public static void showSu() { System.out.println(su); } //클래스 메서드
	public static void showPay() { System.out.println(this.pay);} //클래스 메서드
	
	
	public void showAll001() { 
		System.out.println(su);
		System.out.println(this.pay);
	} //인스턴스 메서드
	public static void showAll002() {
		showAll001();
		System.out.println(this.pay);
	} //클래스 메서드
	
}  // 오류가 나는 이유 -> new를 통해 생성자로 인스턴스화 해야하는 메서드/변수가 static 클래스 변수/메서드 안에 들어가있어서?


public class MemberVarEx001 {
	public static void main(String[] args) {  //지역변수 : args , sola ***
		Sawon3 sola = new Sawon3();
		sola.showAll001();
	}
	

}
