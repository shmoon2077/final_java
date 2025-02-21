package MiniProject;

import java.util.Scanner;

public class Bank_v1_control {
	public static void main (String [] args) {
	//변수
	String temp_id = null , id = null;
	int num,pw = 0,temp_pw,bal = 0;
	Scanner scan = new Scanner(System.in);
	
	for (;;) { //무한 반복
		System.out.print("\n\n========KBANK========\r\n"+"1.추가\r\n"+"2.조회\r\n"+"3.입금\r\n"
	                     +"4.출금\r\n"+"5.삭제\r\n"+"9.종료\r\n"+"메뉴를 선택하세요 >>  ");
		num = scan.nextInt();
		if (num==9) {System.out.println("종료합니다."); break;}
		switch(num) {
			case 1 : System.out.println("추가 기능입니다.");
			
					 System.out.println("아이디를 입력하세요");
					 scan.nextLine();
					 id = scan.nextLine();
					 
					 System.out.println("비밀번호를 입력하세요");
					 pw = scan.nextInt();
					 
					 System.out.println("잔액을 입력하세요");
					 bal = scan.nextInt();			 	
				// step3
				// id _입력받기 first
				// pw _입력받기 1111
				// balance : _입력받기 10000
			    break; //end case 1
			case 2 : System.out.println("조회 기능입니다.");
			
				     System.out.println("아이디를 입력하세요.");
				     scan.nextLine();
				     temp_id = scan.nextLine();
				     while (temp_id!=id) {
				     System.out.println("아이디를 확인하세요");
				     scan.nextLine();
				     temp_id = scan.nextLine();}
				     
				     System.out.println("비밀번호를 입력하세요.");
				     temp_pw = scan.nextInt();
				     while (temp_pw!=pw) {
				     System.out.println("비밀번호를 확인하세요.");
				     temp_pw = scan.nextInt();};
				   
				     System.out.println("잔액은 : "+bal);
				  
				  			
			
				break; //end case 2			
			case 3 : System.out.println("입금 기능입니다.");
				break; //end case 3
			case 4 : System.out.println("출금 기능입니다.");
				break; //end case 4
			case 5 : System.out.println("삭제합니다.");
				break; //end case 5
		
		
				     }
	
	
				     
				     
			}
		}		
}
	
	
	

