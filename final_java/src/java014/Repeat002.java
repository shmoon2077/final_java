package java014;
/*
Q9. abstract란 클래스의 추상 클래스
    설계용 및 일반 클래스 성격을 가지고 있으며
    멤버 변수로 인스턴스 변수와 상수를 가질 수 있다
    멤버 함수로 인스턴스 함수와 추상 메서드를 가질 수 있다
    
    
Q10. interface란 설계용 클래스
    상수와 추상 메서드로만 이루어져 있다
    
Q11. interface가 추상도가 더 높으며
    interface는 여러가지 interface를 동시에 적용할 수 있다 (하나의 클래스에)
    추상 클래스는 하나밖에 상속 받지 못한디
    is A !
    can do this!    

*/

abstract class Fruit {
	@Override
	public String toString() {return "Fruit";}
	public abstract void myfruit();}

class Apple extends Fruit {

	@Override public void myfruit() {System.out.println("ㅅㄱ");   } }

class Banana extends Fruit {

	@Override public void myfruit() {System.out.println("ㅂㄴㄴ");  } }

class Coconut extends Fruit {

	@Override public void myfruit() {System.out.println("ㅋㅋㄴ");   } }


public class Repeat002 {
 public static void main(String[] args) {
	Fruit[] fruits = {new Apple(), new Banana(), new Coconut()};
	for (Fruit arr : fruits) { arr.myfruit();}}
}
