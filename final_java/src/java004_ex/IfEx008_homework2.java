package java004_ex;

import java.util.Scanner;
/*
1. 총점 구하기
2. 평균 구하기
3. 평균이 60점이상이고  각과목이 40점 미만이면 아니라면 합격/ 아니면 불합격
4. 평균이 95점이상이면 장학생
5. 평균이  90점이상이면 수, 80점이상이면 우, 70점이상이면 미, 60점이상이면 양, 아니라면 가 

학번 입력 > std111
국어점수 입력 > 100
수학점수 입력 > 100
영어점수 입력 > 99
=================================================================================== 
학번   국어   영어   수학   총점   평균   합격여부   레벨   장학생
=================================================================================== 
std111   100   100   99   299   99.67   합격   수   장학생
 * */

public class IfEx008_homework2 {
	public static void main (String [] args) {
		//1 변수
		String stn,pf,lev,uber;
		int kor,eng,mat,total;
		double avg;
		
		//2 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("학번을 입력하세요");
		stn = scan.next();
		System.out.print("국어 점수를 입력하세요");
		kor = scan.nextInt();
		System.out.print("영어 점수를 입력하세요");
		eng = scan.nextInt();
		System.out.print("수학 점수를 입력하세요");
		mat = scan.nextInt();
		
		//3 처리
		total = kor+eng+mat;
		avg = total/3.0;
					
		if (avg>=60 && kor>=40 && eng>=40 && mat>=40) {pf="합격";}
		else {pf="불합격";};
		
		lev = avg>=90? "수":
			  avg>=80? "우":
			  avg>=70? "미":
			  avg>=60? "양":"가";	  	   
	
		if (avg>=95) {uber="장학생";}
		else {uber="비장학생";}
		
		//4출력
		System.out.println("========================================================================\n"
			  + "학번\t국어\t영어\t수학\t총점\t평균\t합격여부\t레벨\t장학생\r\n"+"========================================================================\n");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\t%s\t%s\t",stn,kor,eng,mat,total,avg,pf,lev,uber);
		//굳이 printf로 할 필요가 있었나. 오히려 더 복잡해진듯
		scan.close();
	} //end main

}//end class
