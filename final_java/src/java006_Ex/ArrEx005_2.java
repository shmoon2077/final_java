package java006_Ex;

public class ArrEx005_2 {
	public static void main(String[] args) {
		char[] ch = {'B','a','n','a','n','a'};
		
		for (int i=0;i<ch.length;i++) 
		{
		if (ch[i]<'a') {ch[i]+=32;}
		else if (ch[i]>='a') {ch[i]-=32;};
		}
		System.out.println(ch);
		
	}
}
