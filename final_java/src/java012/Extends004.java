package java012;

class Grand {
	public void one() { System.out.println("grand : one");}
	public void two() { System.out.println("grand : two");}
}

class Father extends Grand {
	public void three () {System.out.println("father : threee");}
}

class Uncle extends Grand {
	public void four() {System.out.println("uncle : four");}
	@Override
	public void two() {System.out.println("uncle : two");}
	@Override
	public void one() {System.out.println("uncle : one");}
	}

class Aunt extends Object {
	String name="MiMi";
	public String toString() {return name+"옆집이모클래스";}
}


public class Extends004 {
	public static void main(String[] args) {
		Father father = new Father();
		father.three();
		father.two();
		father.one();
		Uncle uncle = new Uncle();
		uncle.four();
		uncle.one();
		uncle.two();
		Aunt aunt = new Aunt();
		System.out.println(aunt.toString());
		System.out.println(aunt);
	}

}
