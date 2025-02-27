package java009;

import java.util.Scanner;

public class Repeat002 {
public static void main(String[] args) {
	char ver=' ';
	Scanner scan = new Scanner(System.in);
	ver = scan.next().charAt(0);
	switch(ver) {
	case 'j' : {System.out.println("JAVA");}break;
	case 'h' : {System.out.println("HTML");}break;
	case 'c' : {System.out.println("CSS");}
	}
	
	

}
}