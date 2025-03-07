package java014;

interface Animal {
	String NAME="어흥이";
	void eat();}

class Human implements Animal {

	@Override public void eat() {
		// NAME="윈터"; NAME은 상수이기 때문에 재설정할 수 없다.
		System.out.println(NAME+" 가 냠냠");}
	}

public class Repeat003 {
	public static void main(String[] args) {
//		Aniaml ani = new Animal(); 인터페이스는 인스턴스화 할 수 없다
//		Animal ani = null;
		Human ani = new Human(); ani.eat();
	}

}
