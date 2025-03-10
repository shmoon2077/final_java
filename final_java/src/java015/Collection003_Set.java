package java015;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//1. Collection Framework - [배열]의 단점을 개선한 [객체]만 저장 가능 (동적배열)



public class Collection003_Set {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("one"); 
		list.add("one"); 
		list.add("two"); 
		list.add(new String("three")); // 객체 방식으로 데이터 입력 가능 
		
		System.out.println(list.size()+"/"+list);
		
		Set<String> set = new HashSet<>();
		set.add("one");
		set.add("one");
		set.add("two");
		set.add(new String("three"));
		System.out.println(set.size()+"/"+set);
		
		Set<Integer> set2 = new HashSet<>(); // int 숫자 자료형 , 객체만 저장
		// int → integer, float → Float , double → Double, byte → Byte
		// Wrapper Class
		set2.add(1); // Integer e = 1
		set2.add(new Integer(2));
		
		int a = 1; // 기초값 
		Integer e = 1; // 부품객체 wrapper  - boxed
		System.out.println(a+"/"+e);
		
		System.out.println(e.byteValue()); // 이런 것이 가능... a는 불가...
		// 1) 부품객체(클래스) = 기초값 boxed
		// 2) 클래스가 만들어놓은 기능들 사용 가능 
		// 3) Integer.parseInt , Double.parseDouble , String.valueof
		
		for (Integer e1 : set2) {System.out.println(e1);}
		System.out.println("1.add  2.size");
		System.out.println("3.remove -" +set2.remove(2));
		System.out.println("4.contains "+set2.contains(1));
		System.out.println(set2);
		
		
		Iterator <Integer> iter = set2.iterator(); //Returns an iterator over the elements in this set.
		while(iter.hasNext()) {   }  // 처리 대상 확인
		System.out.println(iter.next()); //3. 꺼내오기
		
		
	}

}
