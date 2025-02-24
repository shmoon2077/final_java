package java006_Ex;

public class ArrEx005 {
	public static void main(String[] args) {
		char[] ch = {'B','a','n','a','n','a'};
		int total=0,total1=0;
		for (int i=0;i<ch.length;i++) {if (ch[i]>='a') {total++;}
		else if (ch[i]<'a') {total1++;}
		}
		System.out.println("배열 안의 대문자 갯수는"+total1+"개");
		System.out.println("배열 안의 소문자 갯수는"+total+"개");
	}

}
