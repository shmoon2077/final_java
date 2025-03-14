package java019;


import javax.swing.JOptionPane;
//class QuestionCount implements Runnable
class QuestionCount extends Thread {

	@Override public void run() {
		for(int i=10;i>0;i--) {
			System.out.println(i);
			try { Thread.sleep(1000); } catch (InterruptedException e) {  break; } }
		
	}
}



public class ThreadEx001 {
public static void main(String[] args) {
	Thread qqq = new QuestionCount(); qqq.start();
//  Thread qqq= = new Thread ( new QuestionCount());
//	Thread qqq = new Runnalbe() { QuestionCount의 코드 내용 };
	String answer = JOptionPane.showInputDialog("사과 알파벳(소문자로만)을 입력하세요");
	if(answer.equals("apple")) {System.out.println("정답");
	qqq.interrupt();}
	else {System.out.println("땡");}
	System.out.println("main-end"); 




}
}
// 문제점
//1. 정답 제출시 count 멈추게 해야
//2. main이 끝났는데도 프로세스가 실행중
