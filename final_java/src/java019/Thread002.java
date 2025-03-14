package java019;

//1. process - 실행중인 하나의 프로그램
//2. 자원 Resoerce + Thread (자원으로 실제 작업을 수행)
//3. 작업수행 클래스 상속,Runnalble, run() 해야할일 start() 실행

class PigText extends Thread {

	@Override
	public void run() {  //할 일 
		try { Thread.sleep(100); } catch (InterruptedException e) {e.printStackTrace();};
		
			for(int i=0;i<5;i++) {
			System.out.println("꾸우우우우울!");
			try { Thread.sleep(1000); } catch (InterruptedException e1) {e1.printStackTrace();}	}
		}
	}

class PigCount extends Thread {

	@Override public void run() {	
		try { Thread.sleep(50); } catch (InterruptedException e) {e.printStackTrace();};
	for(int i=1;i<=5;i++) {
	   System.out.println(i + "마리");
	   try { Thread.sleep(1000); } catch (InterruptedException e) {  e.printStackTrace(); }
	}
	
	
	}
}




 
public class Thread002 {
	public static void main(String[] args) {
		Thread unit = new PigCount(); unit.start();
		Thread sound = new PigText(); sound.start();
		for(int i=0;i<5;i++) {
			System.out.println("˙Ꙫ˙");
			try { Thread.sleep(1000); } catch (InterruptedException e) {e.printStackTrace();} }
		
		
	}
}
