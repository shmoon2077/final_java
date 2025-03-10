package Array;

public class CharArray {
	public static void main(String[] args) {
		char[] alpha = new char[26];
		char ch = 'A';
		
		for (int i=0;i<alpha.length;i++,ch++) {
			alpha[i] = ch;		}
		
		
		for (int i = 0; i<alpha.length;i++) {
			System.out.println(alpha[i]+" , "+(int)alpha[i]);
		}
		
		
		
	}

}
