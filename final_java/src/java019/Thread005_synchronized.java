package java019;

//1. 프로세스 - 실행중인 프로그램
//2. 프로세스 - 자원 + Thread(실제작업)
//synchronized

//#1 공유자원
class Rank{
	int num=0;
	public synchronized void plusnum() {// 등수올리기
		int rank=num;
		try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
		num=rank+1; 
	}
}
//#2. 실행클래스
class User extends Thread{
	Rank rank;  // 각유저마다 몇등이야.
	public User(Rank rank) {  this.rank=rank; }
	@Override  public void run() {
		rank.plusnum();  // 등수올리기
		System.out.println(rank.num + "등 >> " + super.getName());
	}
}
public class Thread005_synchronized {
	public static void main(String[] args) {
		Rank rank = new Rank(); // 공유 자원
		
		Thread user1 = new User(rank); user1.setName("sally"); user1.start(); // 몇번째
		
		Thread user2 = new User(rank); user2.setName("alpha"); user2.start();
		
		Thread user3 = new User(rank); user3.setName("beta"); user3.start();
		 
	}
}
//Thread005_synchronized

/*   synchronized  before)   
 * 				  공용 공간      
    user1   #1 →  [Rank : num    ]  ←#2  user2
    first                                second
    		#3 출력  				 #출력
    
  
   synchronized  after)         
   user1 #1   →  [Rank : num    ]  ← #3  user2
   first #2                          #4 second
*/
