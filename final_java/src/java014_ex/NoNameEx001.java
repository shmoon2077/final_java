package java014_ex;

interface Calc {
	public double exec(double num1, double num2);
}

public class NoNameEx001 {
	public static void main(String[] args) {
		Calc cal = new Calc() {

		@Override public double exec(double num1, double num2) { return num1+num2; }
			};
			
			System.out.println(cal.exec(10, 3));

			
}
}
