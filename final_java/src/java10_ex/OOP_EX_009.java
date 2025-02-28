package java10_ex;

class Mobile2 {
	String serialNo;  // 인스턴스 변수 - heap area - new O - this (각각)
	static int count=0;  // 클래스 변수 - method 영역 - new X - 바로사용 가능 (공용)
	public Mobile2() { this.serialNo = "2030-" +  ++count;}
		
}

public class OOP_EX_009 {
	   public static void main(String[] args) {
		
	   Mobile2 m1 = new Mobile2(); //1. new 공간빌리기  2. 생성자()  3. 번지
	   Mobile2 m2 = new Mobile2(); 
	   Mobile2 m3 = new Mobile2();  
	   Mobile2 m4 = new Mobile2();  

	   System.out.println("모바일 갯수는 모두 "+ Mobile2.count +"개 입니다."); //4개   
	   System.out.println("m1의 제품번호 " + m1.serialNo);  //1 2030-1
	   System.out.println("m2의 제품번호 " + m2.serialNo);  //2 2030-2
	   System.out.println("m3의 제품번호 " + m3.serialNo);  //3 2030-3
	   System.out.println("m4의 제품번호 " + m4.serialNo);  //4 2030-4

  }
}

