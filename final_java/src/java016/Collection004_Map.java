package java016;
//Q2. ##5 인덱스 o 중첩 o  add get(index) size remove contains
//##6 인덱스 x 중첩 x  add get, enhanced for loop, Iterator, size remove contains
//##7 Map 사전 [키;값] - 쌍 (Entry) put (add x) get(key) size remove contains

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Collection004_Map {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("으아아아아아아아","집에 가고 싶다");
		map.put("one","하나");
		map.put("two","둘");
		map.put("three","셋");
		map.put("one","넷"); // 키 값이 같으면 덮어 씌움
		
		System.out.println(map);
		System.out.println(map.get("one"));
		System.out.println(map.size());
		
		
		System.out.println(map.remove("으아아아아아아아","집에 가고 싶다")); // 삭제
		System.out.println(map.containsKey("one"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet()); //Set <Entry <String, String>>
		
		// 출력 enhanced for loop
		
		for ( java.util.Map.Entry<String, String> e  : map.entrySet() ) { System.out.println(e.getKey()+e.getValue()); }
		
		//iter - ver1
		// 1. key 모으기   2. 처리대상 확인  3. 값 꺼내오기
		Iterator <String> iter = map.keySet().iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		};
		
		
		//iter - ver2
		//1. Entry 모으기  2. 처리대상 확인  3. 값 꺼내오기
		Iterator<Entry<String, String>> entry = map.entrySet().iterator();
		while(entry.hasNext()) {
			Entry<String, String> ent = entry.next();
			System.out.println(ent.getKey()+"/"+ent.getValue());
		}
		
		
		
		
		
	}

}
