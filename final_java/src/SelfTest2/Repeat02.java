package SelfTest2;

//Q6	
//1. 클래스 변수에 지역 변수값을 넣어서
//2. 클래스 함수에서 지역 변수를 출력하고자 해서
//3. 하나의 메서드에 클래스 변수와 지역변수를 둘 다 출력하려고 해서?
//4. 클래스 함수 안에 멤버 함수를 넣어서
//5. 멤버 함수 안에 클래스 함수를 넣어서	
	

//Q7. public -> protected -> package - private
	
//Q8 8-1 get / set
//   8-2 setColor
	
//Q9	
	


class Car4 {
	private String color;
	
	public String getColor(String string) {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Car4() { super(); }
	@Override
	public String toString() {
		return "Car4 [color=" + color + "]";
	}
	
	
   

}

public class Repeat02 {
	public static void main(String[] args) {
		Car4 c1 = new Car4();
		c1.setColor("red");
		System.out.println(c1); 
	}
}


//Q10. 메서드 재활용 
//Q11. :) ?


