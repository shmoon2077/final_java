package java015_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx002 {
	public static void main(String[] args) {
		List<String> numbers = new ArrayList<>();
				numbers.add("one");
				numbers.add("two");
				numbers.add("three");
				
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.print("1~3 숫자 입력하시오");
		num = scan.nextInt();
		System.out.println(numbers.get(num-1));
		
		

			
	}

}
