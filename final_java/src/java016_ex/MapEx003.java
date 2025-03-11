package java016_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MapEx003 {
	public static void main(String[] args) {
		String[] data = { "A","D","B","D","B","D","B","C","E","C","B" };
		HashMap<String, Integer> map = new HashMap<>();
		int cntA=0;
		int cntB=0;
		int cntC=0;
		int cntD=0;
		int cntE=0;
		for (int i=0;i<data.length;i++) {
			if (data[i].equals("A")) {cntA++; } }
		for (int i=0;i<data.length;i++) {
			if (data[i].equals("B")) {cntB++; } }
		for (int i=0;i<data.length;i++) {
			if (data[i].equals("C")) {cntC++; } }
		for (int i=0;i<data.length;i++) {
			if (data[i].equals("D")) {cntD++; } }
		for (int i=0;i<data.length;i++) {
			if (data[i].equals("E")) {cntE++; } }
		
		map.put("A",cntA);
		map.put("B",cntB);
		map.put("C",cntC);
		map.put("D",cntD);
		map.put("E",cntE);
		
		Iterator<Entry<String,Integer>> iter = map.entrySet().iterator();
		Iterator<String> iterk = map.keySet().iterator();
		Iterator<Integer> iterv = map.values().iterator();
		
		
		while (iter.hasNext()) {
			System.out.print(iter.next()+"\t");}
		
		System.out.println();
		  
		for ( String a : map.keySet() ) {
			System.out.println(map.keySet());
		}
		

		
		
		
		
		
		
	} // end main
} //end class
