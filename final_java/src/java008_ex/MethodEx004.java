package java008_ex;

import java.util.Scanner;



public class MethodEx004 {

	public static int process_total(int k,int m, int e) { int hap=k+m+e; return hap; }
	public static float process_avg(int t) { float av=(t/3.0f) ; return av ; }
	public static String process_pass(float pyung, int h, int y, int s) {
		String result = "알 수 없음";
		if (h<40 || y<40 || s<40) { result="재시험"; }
		else if ((h<60 && h>=40)||(y<60 && y>=40)||(s<60 && s<=40)) { result="불합격";}
		else if (pyung>=60) { result= "합격"; }
		return result;
	}
	public static String process_scholar(float jang1) {if (jang1>=95) { return "장학생";}
	return "해당없음";
	}
	
	public static String process_star(float py) {
		String result = "";
		for(int i=0;i<(int)py/10;i++){ result+=("★");    }
		return result;   // repeat 쓰면 더 짧아짐
	}
	
	public static void process_show(String n,int kk,int ee,int mm,int tt,float pyu,String p,String j,String s) 
	{ System.out.println (":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"+"\n"+
	  "이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t랭킹\n"
			 +"-------------------------------------------------------------------------"+"\n");
	  System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\t%s\t%s",n,kk,ee,mm,tt,pyu,p,j,s);
	  System.out.println();
	  System.out.println("--------------------------------------------------------------------------");
	 
	}
	
	public static void main(String[] args) {
	      //변수
		  String name  = ""; 
	      int kor, eng, math, total ;
	      float avg = 0.0f; 
	      String pass = "";
	      String jang = "";
	      String star= ""; 
	      Scanner scanner = new Scanner(System.in);
	      //입력
	      System.out.print("이름을 입력하세요.");
	      name = scanner.next().toString();
	      System.out.print("국어 점수 입력하세요.");
	      kor = scanner.nextInt();
	      System.out.print("수학 점수 입력하세요.");
	      math = scanner.nextInt();
	      System.out.print("영어 점수 입력하세요.");
	      eng = scanner.nextInt();
	      //처리
	      total = process_total(kor , eng, math); 
	      avg = process_avg(total);
	      pass = process_pass(avg , kor, eng, math);  
	      jang = process_scholar(  avg  ); 
	      star = process_star(avg);
	      //출력
	      process_show(name, kor, eng, math, total, avg, pass, jang, star);
	      scanner.close();
	      
		
	} //end main
} //end class

/*
 * 
연습문제4)  method
패키지명 : com.company.java008_ex
클래스명 :  MethodEx004

public class MethodEx004{ 
   public static void main(String[] args) {
      /////////////////////(1)  변수
      String name  = ""; 
      int kor, eng, math, total ;
      float avg = 0.0f; 
      String pass = "";
      String jang = "";
      String star= ""; 
      String level_kor="" , level_eng="" , level_math="";
      String re = "";
      Scanner scanner = new Scanner(System.in);
      
      /////////////////////(2) 입력 : 이름, 국어, 영어, 수학점수를 입력받으시오.
   
      /////////////////////(3) 처리 : 
      total = process_total(kor , eng, math);    // 1. 총점처리
      
      avg = process_avg(total);    //2.  평균처리
      
      ////////3.  합격  평균이60이상이고, 각각 국어, 영어, 수학40이상/불합격/재시험-각각 40미만인게 있다면  
      pass = process_pass(avg , kor, eng, math);  
      
      //////// 4. 평균이 95점이상이면 장학생
      jang = process_scholar(  avg  ); 
      
      //////// 5. 평균점수대로 별표 붙이기 , 예) 70점대이면 별7개, 80점대이면 별8개, 90점대이면 별9개 , 100점이면 별10개 
      star = process_star(avg);  
      
      
      /////////////////////(4) 출력
      process_show(name, kor, eng, math, total, avg, pass, jang, star);
    
      
   }// end main
 
   
}// end class

 
      ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: 
      이름      국어   영어   수학   총점  평균    합격여부   장학생   랭킹
      --------------------------------------------------------------------------------------------
      아이언맨   100   100   100   300    100.0    합격      장학생   **********
      --------------------------------------------------------------------------------------------
 * 
 * 
 * */
