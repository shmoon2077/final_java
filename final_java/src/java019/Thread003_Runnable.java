package java019;

//1. 프로세스 - 실행 중 프로그램
//2. 자원 + 쓰레드~ 작업수행 클래스
class Animal {} 
class Catnya extends Animal implements Runnable {

	@Override public void run() { 
		for(int i=0;i<5;i++) {
		try { Thread.sleep(30); } catch (InterruptedException e) {  e.printStackTrace(); }
		System.out.println("miyang~");
		try { Thread.sleep(1000); } catch (InterruptedException e) {  e.printStackTrace(); }}
	}	
}


public class Thread003_Runnable {
	public static void main(String[] args) {
		Thread mya = new Thread(new Catnya()); mya.start();
		
		Thread count = new Thread( new Runnable () {
			@Override public void run() {
				for(int i=1;i<=5;i++) {
					System.out.println(i+" 마리 ");
					try { Thread.sleep(1000); } catch (InterruptedException e) {  e.printStackTrace(); } }
			}
		}	
				); 	
				
		
		
		count.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("（ΦωΦ）");
			try { Thread.sleep(1000); } catch (InterruptedException e) {  e.printStackTrace(); }
		}
		
	}

}
