package java007_ex;

public class ArrEx008 {
	public static void main(String[] args) {
		
	String[] name = {"아이언맨","헐크","캡틴","토르","호크아이"};
	int[] kor = {100,20,90,70,35};
	int[] eng = {100,50,95,80,100};
	int[] mat = {100,30,90,60,100};
	int[] avg = new int[5];
	char[] r = new char[5];
	char[] g = new char[5];
	int [] le = new int[5];
	System.out.print(
	"======================================================\r\n"+
	"이름\t국어\t수학\t수학\t평균\t합불\t장학생\t등수\r\n"+
	"======================================================\r\n");
	//1 . 평균 구하기
	int i=0;
	for (i=0;i<name.length;i++) {avg[i] = (kor[i]+eng[i]+mat[i])/3;
	if (avg[i]>=60) { r[i] = 'P'; }
	else { r[i] = 'F';}
	if (avg[i]>=95) { g[i] = 'O'; }
	else { g[i] = 'X'; }

	
	
	
	
	System.out.print(String.format("%s\t %d\t %d\t %d\t %d\t %s\t %s\r\n",
			name[i],kor[i],eng[i],mat[i],avg[i],r[i],g[i]));		
	};		
			
			
			
			
			
			
	}
}
