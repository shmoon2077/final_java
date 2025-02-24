package java006_Ex;

public class ArrEx004 {
	public static void main(String[] args) {
      	int num=0;	
		char[] ch = {'B','a','n','a','n','a'};
		for (int i=0;i<ch.length;i++) {if(ch[i]=='a') {num++;};}
		
		System.out.println("배열 안의 'a'의 갯수는"+num+"개");
	}
}
