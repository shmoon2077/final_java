package java009_ex;

import java.util.Arrays;
import java.util.Scanner;


public class MethodEx007 {
    public static void who_are_you(String [][] users)
    ///아이디를 확인하여 국적 확인해주기
    { Scanner scan = new Scanner(System.in);
      String id=" ";    
      System.out.print("아이디를 입력해주세요");
      id = scan.next();
      String result= " ";
      for (int i=0;i<users.length;i++)
      { if (id.equals(users[i][0])) {
    	result = users[i][0]+"은 "+users[i][2]+"사람입니다.";}
      else break;         
      System.out.println(result); }
    } //end who_are_you
    
    ///아이디랑 비밀번호 확인하여 맞으면 비밀번호 변경하기 
    public static void who_pass_change(String[][] users) {
    String id = " ";
    String pw = " ";
    String result = " "; 
    String temp_pw = " ";
    int row;
    int col;
    Scanner scan = new Scanner(System.in);
    System.out.print("아이디를 입력하세요");
    id = scan.next();
    System.out.print("비밀번호를 입력하세요");
    pw = scan.next();
    for (row=0;row<users.length;row++) {
    	for (col=0;col<users[row].length;col++) {
    		if (id.equals(users[row][0]) && pw.equals(users[0][col]))
    		{ System.out.print("변경하실 비밀번호를 입력하세요");
    		  temp_pw = scan.next();
    		  users[row][col] = temp_pw;
    		  System.out.print(Arrays.deepToString(users[row]));}
    		else {System.out.println("아이디와 비밀번호를 확인하세요");break;
    		    		}
    
    	}
    	}// end first for
	    }//end change
      
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	//변수
		String[][] users = { {"aaa","111","한국"},
							 {"bbb","222","호주"},
							 {"ccc","333","중국"}};
		
		
	
	//입력
		who_are_you(users);  
		who_pass_change(users); 
		  
		
		
//		System.out.print("아이디를 입력해주세요");
//		id = scan.next();
//		System.out.print("비밀번호를 입력해주세요");
//		pw = scan.next();
			
	//출력

		
		
		
	}//end main
}//end class
