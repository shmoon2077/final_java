package java008;

public class Method003 {
	public static String sign() { return "sally"; }
	public static int num() { return (int)
			(Math.random()*46);}
	public static double pi() { return 3.141592; }
	public static String hello(String name) { return "안녕!!! " +name; }

	
	public static void main(String[] args) {
		//	public static returnValue methodName(parameter) {argument}
		//  public static sally sign() { return "sally" }
		//  public static String sign() { return "sally" }
		System.out.println("당신의 이름은? " +sign());
		                                  //sally

		int yournum = num();
		System.out.println("랜덤 숫자 : " + yournum);
		
		System.out.println("파이값 ? "+pi());
		
		// public static "안녕 alpha" hello("alpha") {}
		System.out.println(hello("sally"));
		System.out.println(hello("alpha"));
	
	
	} // end main
} //end class
