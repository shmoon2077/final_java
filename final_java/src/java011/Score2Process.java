package java011;

public class Score2Process {
		
	public void process_avg (Score2[] std) { // 주소따라 데이터 수정
	    // std[0].avg = (std[0].kor + std[0].eng + std[0].math) / 3.0   private
	    for (int i = 0; i < std.length; i++) {
	        std[i].setAvg((std[i].getKor() + std[i].getEng() + std[i].getMath()) / 3.0);
	    }
	}

	public void process_pass (Score2[] std) {
	    for (int i = 0; i < std.length; i++) { 
	        std[i].setPass(std[i].getAvg() >= 60 ? "합격" : "불합격");
	    
}
}
}