package java013_ex;

class Score {
	private String name;
	private int kor,eng,math;
	private int total;
	private double avg; }

class ScoreDto extends Score {
	private String jang;
	private String star;
	private String pass; }

abstract class Process {
	abstract double exec(int kor, int eng, int math);
	abstract double exec(int total);
	abstract String exec(double avg);   }

class Total extends Process {
	@Override double exec(int kor, int eng, int math) { return kor+eng+math;}
	@Override double exec(int total) {  return 0; }
	@Override String exec(double avg) {  return null; }
	
}

class Avg extends Process {
	@Override double exec(int kor, int eng, int math) {  return 0; }
	@Override double exec(int total) {  return total/3.00; }
	@Override String exec(double avg) {  return null; }
	
}

class Jang extends Process {
	@Override double exec(int kor, int eng, int math) {  return 0; }
	@Override double exec(int total) {  return 0; }
	@Override String exec(double avg) {  return avg>=95? "장학생" : "비장학생"; }

}

class Pass extends Process {
	@Override double exec(int kor, int eng, int math) {  return 0; }
	@Override double exec(int total) {  return 0; }
	@Override String exec(double avg) {  return avg>=60? "합격" : "불합격"; }
	
}

class Star extends Process {
	@Override double exec(int kor, int eng, int math) {  return 0; }
	@Override double exec(int total) {  return 0; }
	@Override String exec(double avg) {  
		String result = null;
		int star=(int)avg/10;
		for (star=0;star<=10;star++) 
		
	
	    
		return result;
	} 
}








public class AbstractEx01 {
	public static void main(String[] args) {
		
		
	}

}
