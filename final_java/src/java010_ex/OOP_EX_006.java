package java010_ex;

class Score {
	Score () {}
	String stdid; int kor,eng,math,total; float avg;
	Score (String stdid,int kor,int eng,int math) {
		this.stdid=stdid;this.kor=kor;this.eng=eng;this.math=math;total();avg();}
		void total() {total=kor+eng+math;}
		void avg() {avg=(float)total/3;}
		void info() {
			//total(); avg(); 메서드 안에서 메서드 호출 가능
			System.out.println("학번\tkor\teng\tmath\ttotal\tavg");
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f",stdid,kor,eng,math,total,avg);}
				   	
}

public class OOP_EX_006 {
	public static void main(String[] args) {
		Score s1= new Score("std1234",100,100,99);
		s1.info();
		
	}

}
