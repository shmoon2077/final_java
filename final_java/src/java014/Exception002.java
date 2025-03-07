package java014;

public class Exception002 {
	public static void main(String[] args) {
		//1. try {에러날듯} catch {에러내용} finally {무조건 처리/ 생략 가능}
		try { System.out.println(10/0);}
		//catch(ArithmeticException e) { System.out.println("관리자에게 문의하셈");  }
		catch(Exception e) { System.out.println("관리자에게 문의하셈");  }
		finally { System.out.println("무조건 실행");

			
		
		//2. throws 메서드
	}

}
}

/*Exception in thread "main" java.lang.ArithmeticException: / by zero
  at java014.Exception002.main(Exception002.java:6)*/
