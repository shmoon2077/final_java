package java013;

abstract class Animal {   //일반 클래스 + 설계
	String name;
	int age;
	abstract void eat();  // 추상 클래스에서만 추상 메서드를 쓸 수 있음.
	abstract void sleep(); // 추상화 = 일반화 = 설계 : 공통의 속성과 행동
	abstract void poo();
	}

class Cat extends Animal { // abstract을 상속 받으면 안에 있는 추상 메서드들을 써야만 한다.
	@Override void eat() { System.out.println(super.name+"고양이 먹먹");}
	@Override void sleep() { System.out.println(super.name+"고양이 쳐잠");	}
	@Override void poo() { System.out.println(super.name+"고양이 뿌직");}
}

class Dog extends Animal {
	@Override void eat() { System.out.println(super.name+"개 먹먹");}
	@Override void sleep() { System.out.println(super.name+"개 쳐잠");	}
	@Override void poo() { System.out.println(super.name+"개 뿌직");}
	
}

public class Abstract001 {
	public static void main(String[] args) {
		Animal ani = new Cat(); // 부모 = 자식 , 업캐스팅, 타입캐스팅 필요없음.
		ani.name="sally";
		ani.eat();
		
		ani = new Dog();
		ani.name="Alpha";
		ani.eat();
		
		
		//2. 사용목적
		
		Animal[] arr = { new Cat(), new Cat(), new Dog(), new Dog() };
		int cnt=0;
		for(Animal a : arr) { a.name="ani"+ ++cnt; a.eat(); }
		
	}

}
