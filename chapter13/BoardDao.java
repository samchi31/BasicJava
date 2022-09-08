package chapter13;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	private List<BoardConfirm> list;
	

	public BoardDao() {
		list = new ArrayList<>();
		list.add(new BoardConfirm("제목1","내용1"));
		list.add(new BoardConfirm("제목2","내용2"));
		list.add(new BoardConfirm("제목3","내용3"));
	}



	public List<BoardConfirm> getBoardList(){
		return list;
	}
}
