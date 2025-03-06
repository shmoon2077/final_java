package java013;

//1. 클래스는 부품객체
//2. 인터페이스는 특수한 형태의 클래스로 상태와 행위로 나눠짐

interface Animal1 { 
	String COMPANY="(주)동물농장 ";  // static final - method area = new X
	void eat(); // abstract - { } 구현부 없어 new X
}

class Saram implements Animal1 {
	@Override public void eat() { System.out.println("사람밥");  } 
	Saram () {}
}

class Pig implements Animal1 {
	@Override public void eat() { System.err.println("돼지 밥");   }
	
}




public class Interface001  {
	public static void main(String[] args) {
//		Amimal1 ani = new Animal1();  인스턴스화 못함 
		System.out.println(Animal1.COMPANY);
		//하나의 자료형으로 여러개의 타입을 관리하려고 사용
		Animal1[] anis = {new Saram(), new Saram(), new Pig(), new Pig()};
		for (Animal1 a : anis) {a.eat();}
		
		
		
}
	public void eat() {   }

}
