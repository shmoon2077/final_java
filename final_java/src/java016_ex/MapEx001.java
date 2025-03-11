package java016_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MapEx001 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("피구왕", "통키");
		map.put("제빵왕", "김탁구");
		map.put("요리왕", "비룡");

	Iterator<Entry<String, String>> iter = map.entrySet().iterator();
	System.out.println(
			"=========================="+"\n"+
			"KING"+"\t"+"Name"+"\n"+
			"==========================");
	while(iter.hasNext()) {
		
		Entry<String,String> king=iter.next();
		System.out.println(king.getKey()+"\t"+king.getValue());	}
	
	Scanner scan = new Scanner(System.in);
	System.out.println("KING의 정보를 제공중입니다.");
	String kingn = scan.next();
	iter = map.entrySet().iterator();
	for ( Entry<String,String> e : map.entrySet() ) {
		if(e.getKey().equals(kingn)) {
			System.out.println(e.getKey()+"/"+e.getValue());
		}
	}

	
	
	
	
	}
	}

