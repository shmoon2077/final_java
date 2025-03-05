package java012;

class Color {
	private String name;
	public String getName() {return name;}
	public void setName (String name) {this.name=name;} 


}
 	


class Green extends Color {
	
	private int num;
	
	public int getNum() {return num;}

	public void setNum(int num) {this.num = num;}

	void show() {
		System.out.println(getName()+"\n"+getNum());
	}
}

public class Extends002 extends Green {
	public static void main(String[] args) {
	Green mygreen = new Green();
	mygreen.setName("Light Green");
	mygreen.setNum(5);
	mygreen.show();
	 

	}
}
