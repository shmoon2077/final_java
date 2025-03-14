package java019;

import java.awt.Toolkit;

//1. process - 실행중인 프로그램 
//2. Resource(데이터,메모리) + Thread (자원으로 실제 작업을 수행)

public class Thread001 {
 public static void main(String[] args) {
	 System.out.println("001. Thread");
	 //1. 코어
	 int core = Runtime.getRuntime().availableProcessors();
	 System.out.println("1. Core "+ core);
	 
	 //2. 현재 쓰레드 (실행프로그램) 확인 - Thread 작업 수행 클래스
	 Thread current = Thread.currentThread();
	 System.out.println("2. 현재 Thread(실행프로그램) 이름" + current.getName() );
	 System.out.println("2. 현재 활성화된  쓰레드  " + Thread.activeCount()) ;
	 
	 
	 //#1. ˙Ꙫ˙
	 for (int i=0;i<5;i++) { System.out.print("˙Ꙫ˙");
	 try { Thread.sleep(1000); } catch (InterruptedException e) {e.printStackTrace();}
	 }
	
	 
	 //#.2 비프음
	 Toolkit toolkit = Toolkit.getDefaultToolkit();
	 toolkit.beep();
	 
	 
	 for(int i=0;i<5;i++) {System.out.println("꿀꿀");
	 try { Thread.sleep(950); } catch (InterruptedException e) {  e.printStackTrace(); }}
	 

	 System.out.println("2. 현재 Thread(실행프로그램) 이름" + current.getName() );
	 
}
}

