package java015_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx003 {
	public static void main(String[] args) {
		
	Set<Integer> lotto = new HashSet<>();
//	for(int i=1;i<=45;i++) {
//	lotto.add(i);}
//	
//	Iterator<Integer> iter = lotto.iterator(); 
	
	while (lotto.size()<6) {
		lotto.add((int)(Math.random()*45+1));
	}
	
	System.out.println(lotto);  //(int)Math.random() * 원하는 갯수+1
	
	

	

	
}
}
