package java015;
//1. Collection Framework는 동적배열
//2. 배열의 단점 개선 - 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Collection001_List {
	public static void main(String[] args) {
		//Step1. Array
		String[] arr= new String[3];
		arr[0]="헐크";
	    System.out.println(Arrays.toString(arr));
		
		
		//Step2. 동적배열 - List (add get size remove contains)
	    List list = new ArrayList(); // 여러 자료형 - 공간은 내가 원하는 만큼
	    list.add("으아아악");
	    list.add(1);
	    list.add(3.14);
	    System.out.println(list);
		
	    
	    //Step3. <> Generic
//	    List<String> list2 = new Vector<String>();
	    List<String> list2 = new Vector<>(); // 생략 가능
	    list2.add("two");
	    list2.add("2");
	    list2.add("빵야빵야");
	    
	    System.out.println("갯수 >"+ list2.size());
	    System.out.println("꺼내오기 >"+list2.get(1));
	    System.out.println("포함여부 >"+list2.contains("two"));
	    System.out.println("삭제 > "+list2.remove(2));
	    System.out.println(list2);
	    //Step4.  add get size remove contains
	    		
		
		
		
		
		
		
		
	} // end main
}// end class
