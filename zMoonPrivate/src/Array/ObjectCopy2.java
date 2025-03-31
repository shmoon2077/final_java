package Array;

public class ObjectCopy2 {
	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("엘더스크롤" , "베데스다");
		bookArray1[1] = new Book("스텔라블레이드", "시프트업");
		bookArray1[2] = new Book("공산당선언", "칼 마르크스");
		
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		
		for (int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookName("위쳐3");
		bookArray1[0].setAuthor("씨디프로젝트");
		
		System.out.println("=====bookArray1=======");
		for (int i=0;i<bookArray1.length;i++) {
			bookArray1[i].showBookInfo();
		}
		
		
		System.out.println("=====bookArray2=======");
		for (int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookInfo();
		}
		
		
		
		
		
	}

}
