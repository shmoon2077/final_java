package java011;
import java011_ex.Cat;

class Cat2 extends Cat {
	public void show() {
		public_=10;
		protected_=20; // extends 사용 가능
		//default_=30; // 같은 폴더에서 사용 가능
		//private_=40; // CAT 클래스에서만 사용 - getter / setter
		
		System.out.println(public_+ "/" + protected_);
	}
	
	
}

public class Modifier2 {
	public static void main(String[] args) {
		Cat2 cat2 = new Cat2();
		cat2.show();
		
		cat2.public_=100;
//		cat2.protected_=200; // extends 키워드를 받은적 없어서 값 수정 불가능
		
	}
}
