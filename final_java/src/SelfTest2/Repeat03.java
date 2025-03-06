package SelfTest2;

class A {
	private String name;

	@Override
	public String toString() {
		return "A [name=" + name + "]";
	}
	
}

public class Repeat03 {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		
		
	   A[] arr = new A[3];
	   
	   for(int i=0;i<arr.length;i++)
	   {arr[i] = new A();}
	   
	   for(int i=0;i<arr.length;i++)
	   {System.out.println(arr[i]);}
	   
	}
	

}


//Q14. 오버라이딩?

