package java014_ex;

interface Board {public void exec();}

class BoardIsert implements Board {

	@Override public void exec() {System.out.println("게시판 삽입 기능입니다."); }
	
}
class BoardDelete implements Board {

	@Override public void exec() {System.out.println("게시판 삭제 기능입니다.");   }
	
}
class BoardISelect implements Board {

	@Override public void exec() {System.out.println("게시판 선택 기능입니다.");   }
	
}
class BoardIUpdate implements Board {

	@Override public void exec() {System.out.println("게시판 수정 기능입니다.");   }
	
}


public class InterfaceEx001 {
	public static void main(String[] args) {
		Board board = null;
		board = new BoardIsert(); board.exec();
		board = new BoardDelete(); board.exec();
		board = new BoardISelect(); board.exec();
		board = new BoardIUpdate(); board.exec();

		
	}

	

}
