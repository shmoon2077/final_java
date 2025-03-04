package java010_ex;

import java.util.Scanner;

class Card {
	Scanner scan = new Scanner(System.in);
	int cardNum; boolean isMembership;
	Card () { }
	
	
	
//	Card (int cardNum,boolean isMembership) { this.cardNum=cardNum ; this.isMembership=isMembership; }
	void input() {
		System.out.print("멤버십 넘버를 입력해주세요.");
		this.cardNum = scan.nextInt();
		if (this.cardNum!=0) {this.isMembership=true;}
		else {this.isMembership=false;}		
	}
	void show() {
		System.out.println(this.isMembership);
	}
}

public class OOP_Ex_005 {
	public static void main(String
			[] args) {
		Card c1 = new Card();
		System.out.println(c1);
		c1. input();
		c1. show();
	
}
}
