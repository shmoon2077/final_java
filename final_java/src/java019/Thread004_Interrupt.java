package java019;

import java.util.Scanner;

class Count extends Thread {

	@Override public void run() {
		for(int i=10;i>0;i--) {
			System.out.println(i);
			try { Thread.sleep(1000); } catch (InterruptedException e) {  break; } }
		
	}
}

public class Thread004_Interrupt {
	public static void main(String[] args) {
		Thread count = new Count(); count.start();
		Scanner scan= new Scanner(System.in);
		System.out.println("카운터 끌래? y/n");
		if (scan.next().equals("y")) {
			
			count.interrupt();
		}
		System.out.println(">main end");
	}

}
