package SelfTest;

public class SelfTest021_022 {
	public static void print(int a,int b) {
		int result = a+b;
		System.out.println(result);
	}
	
	public static void print(double a, double b) {
		double result = a+b;
		System.out.println(result);
	}

	public static void main(String[] args) {
		print(3,5);
		print(1.2,3.4);
		
	}
}



/*
 오버로딩이란 같은 이름의 메서드를 각각 다른 함수를 넣어 만드는 것을 의미함.
 들어가는 파라미터가 달라야하며 파라미터에 맞춰 메서드를 골라 이용
 
  
  오버라이딩이란 상속 관계에 있는 클래스에서 부모 클래스에 있는 메서드를
  자식 클래스가 상속 받아 그대로 이름 그대로 사용하는 것을 의미
 */
