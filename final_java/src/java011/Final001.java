package java011;

class FinalEx extends Object {  //object - 자바팀이 객체틀 만들어놓음 2. extends 상속 (앞의 객체를 그대로 사용)
	final static String tree = "4/5"; 
	String name;
	void show() {System.out.println(FinalEx.tree+ " / "+name );
}
	
class Mydate extends FinalEx{

	@Override // 자식 클래스에서 메서드 재수정
	void show() {
		// TODO Auto-generated method stub
		super.show();
	}
	
	
}
	
	
	
	
	public class Final001 {
		public static void main(String[] args) {
//			FinalEx.tree="4.6";     // final 변경 안됨 - cannot be assigned
			System.out.println("식목일 - 나무 심는 날 , 변경불가값 >  "+FinalEx.tree);
		}
	}
}

