package java018;

public class Java_IO_006 {
	public static void main(String[] args) {
		//#1. String 문자열 누적
		String str = "ABC";
				System.out.println(""+System.identityHashCode(str));
				
		str +="D";
				System.out.println(""+System.identityHashCode(str));
				
				
				// 처음 문자열의 주소가 그대로 남아있고, 문자가 추가되면 다른 주소가 하나 더 나타남 
				// 메모리 비효율
				
		//#2. StringBuffer 문자열 누적	
		StringBuffer sb = new StringBuffer();
		sb.append("아 집에 가고 싶다");
		System.out.println(""+sb.toString()+"    "+System.identityHashCode(sb));
		sb.append("ㅜㅜ");
		System.out.println(sb.toString()+"    "+System.identityHashCode(sb));
		
		// 처음 문자열의 주소 그대로 가져다가 수정해도 새로운 주소가 생성되지 않음. 개꿀
		
		
		
		

		
		
	}
}
