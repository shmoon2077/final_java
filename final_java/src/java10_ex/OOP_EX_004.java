package java10_ex;

import java.util.Scanner;

class TV {

	Scanner scan = new Scanner(System.in);
	String channel; int volume;
	 
	public TV(String channel, int volume) {this.channel=channel; this.volume=volume;}
	public TV () { } // input 과 output 이라는 멤버 변수가 입력을 받기 때문에 중괄호 안을 비워놓는다 (기본생성자!)
	String input() {
		String result = "Error";
		System.out.print("채널을 입력하세여");
		this.channel = scan.next();
		System.out.print("볼륨을 입력하세용");
		this.volume = scan.nextInt();
		return result;		
	}
	void show() { System.out.println("채널 : "+this.channel+"\n"+"볼륨 : "+this.volume); }
}
/*
------------------------------- runtime 
[method] TV.class / OPP_EX_004.class
---------------------------------------------
[heap]               | [stack]
TV()			     < 41		 	
TV(String , volume)  < t2						
				     | main
---------------------------------------------
*/



//class TV2_ai extends TV{
//
//	public TV2_ai(String channel, int volume) {
//		super(channel, volume);
		// TODO Auto-generated constructor stub
	

public class OOP_EX_004 {
	public static void main(String[] args) {
		TV t1 = new TV("MBC" , 8);
		t1.show();
		TV t2 = new TV();
		t2.input();
		t2.show();

	System.out.println(t1);
	System.out.println(t2);
	
	}
}
