package java013;

abstract class Shape002 {
	abstract void showArea(int w,int h);
	abstract void showArea(double r);
}

class Rectangle002 extends Shape002 {

	@Override void showArea(int w, int h) {System.out.println("사각형의 넓이 : "+w*h);}
	@Override void showArea(double r) {   } 

}

class Circle002 extends Shape002 {

	@Override void showArea(int w, int h) {  }
	@Override void showArea(double r) {System.out.printf("원의 넓이 :"+"%.2f",(r*r*3.1415926));   }
	
}

class Triangle002 extends Shape002 {

	@Override void showArea(int w, int h) {System.out.println("삼각형의 넓이 : "+(w*h)/2);}
	@Override void showArea(double r) {   } 
}


public class Abstarct002 {
	public static void main(String[] args) {
		Rectangle002 rec = new Rectangle002();
		rec.showArea(10,10);
		Triangle002 tri = new Triangle002();
		tri.showArea(10,10);
		Circle002 cir = new Circle002();
		cir.showArea(10);
	}

}
