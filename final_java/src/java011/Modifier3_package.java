package java011;


public class Modifier3_package {
	public static void main(String[] args) {
		Cat2 cat = new Cat2();
		cat.public_=10;
//		cat.protected_=20; // Cat2 에서만 사용 가능
//		cat.default_=30;
//		cat.private_=40;
		//import 없이도 사용 가능 Cat2 class는 default;
		cat.show();
		
	}

}
