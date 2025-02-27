package java009;

public class Method006 {
	public static void main(String[] args) {
		String str1 = "apple";
		String str2 = "apple";
		
		String str3 = new String("apple");
		
		System.out.println("step1. 값 출력 :   "+str1+",\t"+str2+",\t"+str3);
		
		System.out.println("step2. 같은지 확인 :"+(str1==str2)+",\t"+(str1==str3));
		
		System.out.println("step3. 주소값 확인 " +System.identityHashCode(str1)+"\n"+
		System.identityHashCode(str2)+"\n"+System.identityHashCode(str3));
		
		System.out.println("step4. 문자열의 값 비교 - equals : "+
		str1.equals(str2)+"\t"+str1.equals(str3));
	}

}
