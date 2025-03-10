package java015_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Score {
	private String name;
	private int kor,eng,mat;
	public Score(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	@Override
	public int hashCode() {
		return Objects.hash(eng, kor, mat, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score other = (Score) obj;
		return eng == other.eng && kor == other.kor && mat == other.mat && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
	}

	
	
	
	
	
	
	
	
}

public class SetEx004 {
	public static void main(String[] args) {
    Set<Score> scores = new HashSet<>();
    scores.add(new  Score("아이언맨",30,40,50)); 
    scores.add(new  Score("아이언맨",30,40,50)); 
    scores.add(new  Score("아이언맨",30,40,50)); 
    scores.add(new Score("헐크"   ,40,60,70)); 
    scores.add(new  Score("캡틴",80,90,100));
    
    System.out.println("학생 수 : "+scores.size());
    
    
    Iterator<Score> iter = scores.iterator(); // 1. set 모으기
    while (iter.hasNext()) { // 2. 처리대상 확인
    	Score temp = iter.next();
    	int total = temp.getEng()+temp.getKor()+temp.getMat(); 
    	double avg = total/3.0;
    	System.out.println(temp.getName()+"\t"+temp.getKor()+"\t"+temp.getEng()+"\t"+temp.getMat()+
    			"\t"+total+"\t"+avg);
    	
    }
    
		
		
		
		
		
		
	}
}
