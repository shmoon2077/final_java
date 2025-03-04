package java011;

import java011_ex.Cat;

public class Modifier1 {
	public static void main(String[] args) {
		
	Cat cat = new Cat();
	cat.public_=10;
//	cat.protected;
//	cat.default_;
//	cat.private_;
	cat.setPrivate_(100);
	System.out.println(cat.public_+"/"+cat.getPrivate_());
	
	
	}
}
