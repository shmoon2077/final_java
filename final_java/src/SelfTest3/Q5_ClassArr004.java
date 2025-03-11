package SelfTest3;


class Score { 
	private String name;
	private int kor, eng, mat;
	private double avg;
	private String pass;
	public Score() {	}
	public Score(String name, int kor, int eng, int mat) {  this.name = name; this.kor = kor; this.eng = eng; this.mat = mat; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getKor() { return kor; }
	public void setKor(int kor) { this.kor = kor; }
	public int getEng() { return eng; }
	public void setEng(int eng) { this.eng = eng; }
	public int getMat() { return mat; }
	public void setMat(int mat) { this.mat = mat; }
	public double getAvg() { return avg; }
	public void setAvg(double avg) { this.avg = avg; }
	public String getPass() { return pass; }
	public void setPass(String pass) { this.pass = pass; }
	@Override public String toString() { return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]"; }
		
}

class ScoreProcess {

	


	public void process_avg(Score[] std) {
		 for (int i = 0; i < std.length; i++) {
		        std[i].setAvg((std[i].getKor() + std[i].getEng() + std[i].getMat()) / 3.0);}
			}



	public void process_pass(Score[] std) {
		for (int i = 0; i < std.length; i++) { 
	        std[i].setPass(
    		std[i].getKor() <40 ||std[i].getEng() <40 ||std[i].getMat()<40 ?
			"불합격" : std[i].getAvg()<60 ? "불합격" : "합격"); }		
	}
	}



class ScorePrint {
	public void show(Score[] std) {
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("이름\t   국어\t   영어\t   수학\t   평균\t\t   합격여부");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            for (Score student : std) {
            System.out.printf("%s\t   %d\t   %d\t   %d\t   %.2f\t   %s\n",
                    student.getName(), student.getKor(), student.getEng(), student.getMat(),
                    student.getAvg(), student.getPass());} 
		}
}


public class Q5_ClassArr004 {
	public static void main(String[] args) {
		
		Score[] std = new Score[3];
		std[0] = new Score("아이언맨",100,100,100);
		std[1] = new Score("헐크",90,60,80);
		std[2] = new Score("블랙팬서",20,60,90);
		
		
		ScoreProcess process = new ScoreProcess();
		process.process_avg(std);
		process.process_pass(std);
		
		ScorePrint print = new ScorePrint();
		print.show(std);
 	} // end main
} // end class

