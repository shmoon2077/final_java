package SelfTest;


import java.util.Scanner;

public class SelfTest011 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        for (; i <= 0 || i > 100;) {
            System.out.print("1~100 중 숫자를 입력하세요: ");
            i = scan.nextInt();
        }
    }
}