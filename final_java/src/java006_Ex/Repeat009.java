package java006_Ex;

public class Repeat009 {
	public static void main (String [] args) {
		char ch = ' ';
		String str1="",str2="",str3="",str4="",str5 ="";
		for (ch='A' ; ch<='Z'; ch++) {
			if (ch >='A' && ch <='E') { str1 += ch;}
			else if (ch>='F' && ch<='J') {str2 +=ch;}
			else if (ch>='K' && ch<='O') {str3 +=ch;}
			else if (ch>='P' && ch<='T') {str4 +=ch;}
			else if (ch>='U' && ch<='Y') {str5 +=ch;}
		}
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println("Z");
	}

}
