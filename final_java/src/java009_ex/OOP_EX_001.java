package java009_ex;


class Student001 {
	String name; int no, kor, eng, math;
	
	void info() {
		System.out.println("이름 : "+name+"\n"
	                      +"총점 : "+(kor+eng+math));
		System.out.println("평균 : "+(kor+eng+math)/3);
		
	}
	
}

public class OOP_EX_001 {
	public static void main(String[] args) {
		Student001 s1 = new Student001();
		s1.name="first";
		s1.no=11;
		s1.kor=100;
		s1.eng=100;
		s1.math=99;
		
		s1.info();
		
	} //end main 
} //end class 
/* 10행 : A1 a = new A1();
---------------------------------------- [run time data area]
[method: 정보, static, final: 공용정보 ] A1.class , Class001.class
----------------------------------------
[heap: 동적 영역]    |   [stack:잠깐 빌리는]
A1 {}              <- a (호출? 1번지?) 
       			   |    main 
----------------------------------------


*/