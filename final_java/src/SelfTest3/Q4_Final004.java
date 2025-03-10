package SelfTest3;

class User004 {

	static final char divisionA = 'A';
	static final char divisionB = 'B';
	static final char divisionC = 'C';
	static final char divisionD = 'D';
	
	
	static final String jumin1 = "88111-111558";
	static final String jumin2 = "89111-111558";
	static final String jumin3 = "90111-111558";
	static final String jumin4 = "91111-111558";
	
			
	public User004() {	}
	
	public User004(char division, String string) {
		this.divisionA=division;
	}

	@Override
	public String toString() {
		return "User004 []";
	}
	
	
	
}

public class Q4_Final004 {
	public static void main(String[] args) {
		User004 c1 = new User004('B',"881111-111558"); 
		User004 c2 = new User004(); 
		System.out.println(c1);
		System.out.println(c2);
	}

}
