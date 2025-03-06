package SelfTest2;

//Q15. 1) Object
//2) Object
//3) Parent() {}
//4) Parent (int i, int j) {this.i=i, this.j=j }



class Parent {
	int i,j;
	public Parent() {super();}
	public Parent(int i,int j) {
		super();
		this.i=i;
		this.j=j;
	}
}

class Child extends Parent {
	int k;
	public Child() {super();}
	public Child(int i,int j,int k) {
		super(i,j);
		this.k=k;
		
	}
}

public class Repeat04_Q15 {
	public static void main(String[] args) {
		Child c = new Child(10,20,30);
		
		System.out.println(c.i);
		System.out.println(c.j);
		System.out.println(c.k);
	}

}
