package chapter13;

import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		
		List<BoardConfirm> list = dao.getBoardList();
		
		for(BoardConfirm board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}
}
