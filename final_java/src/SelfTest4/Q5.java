package SelfTest4;

class TestA2{
	int  a = 10;
	public TestA2() { super();  }
	@Override public String toString() { return "TestA2 [a=" + a + "]"; }
}
class TestB2 extends  TestA2{ 
	int b=20;
	public TestB2() { super();  }
	@Override public String toString() { return "TestB2 [b=" + b + "]"; }
}
public class Q5 {
	public static void main(String[] args) {        
		TestA2   ta = new TestA2();    // [ ta   [a]  ]
		TestB2   tb = ta;                   // [ tb   [b]-[a]  ]
		// 오류나는 이유는?  >>> 부모는 자식을 담을 수 있지만 자식은 부모를 담을 수 없다. 다운캐스팅 필요 ! ! 
	}
 }