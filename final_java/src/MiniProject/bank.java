package MiniProject;
import java.util.Scanner;
/**
 * 1. 추가
 * 2. 조회
 * 3. 입금
 * 4. 출금
 * 5. 삭제
 * 9. 종료
 *  
 */
public class bank {
	public static void main (String [] args) {
		//변수
		Scanner scan = new Scanner(System.in);
		int menu=0;
		int total=0;
		int id=0;
		int pw=0;
        System.out.println(
        "======================================="		
        +"1. 로그인"
        +"2. 조회"
        +"3. 입금"
        +"4. 출금"
        +"5. 삭제"
        +"9. 종료"		
        +"=======================================");
        
		
		//입력
		System.out.println("메뉴를 선택하세요.");
		menu = scan.nextInt();
		if (menu==1) { while(id!=2077) {
			     System.out.println("아이디를 입력하세요");
		         id = scan.nextInt();}
		         while(pw!=2077) { 	
		         System.out.println("비밀번호를 입력하세요.");	
		         pw = scan.nextInt();}
		         
		         
		         
		         
		
		

		}
		
		
		
		
		//처리
//		switch(menu) {
//		case 1 : System.out.println("추가기능입니다.);");
//		case 2 : System.out.println("조회기능입니다.);");
//		case 3 : System.out.println("입금기능입니다.);");	
//		case 4 : System.out.println("출금기능입니다.);");			
//		case 5 : System.out.println("추가기능입니다.);");	
//		case 9 : {break;}			
//		}
	
		
		
		//출력
		
		
		
		
		
		
		
		
		
	}// end main
}// end class


