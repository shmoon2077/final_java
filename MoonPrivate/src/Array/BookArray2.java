package Array;

public class BookArray2 {
	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		
				library[0] = new Book("데미안" , "헤르만헤세");
				library[1] = new Book("태백산맥" , "조정래");
				library[2] = new Book("엘더스크롤" , "베데스다");
				library[3] = new Book("스텔라블레이드", "시프트업");
				library[4] = new Book("공산당선언", "칼 마르크스");
				
				for (int i=0;i<library.length;i++) {
					library[i].showBookInfo();
				}
				
				
				for (int i=0;i<library.length;i++) {
					System.out.println(library[i]);
				}
		
	}

}
