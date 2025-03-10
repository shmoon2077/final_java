package java015_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx001 {
	public static void main(String[] args) {
		Set<String> color = new HashSet<String>();
		color.add("red");
		color.add("green");
		color.add("blue");
		color.add("green");
		
		System.out.println(color.size());
		
		
		// enhanced for loop
		for ( String c : color ) {System.out.println(c);		}

		// iterator
		Iterator<String> iter =	color.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	
	
	
	
	
	}
}
