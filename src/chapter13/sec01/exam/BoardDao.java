package chapter13.sec01.exam;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

		public List <Board> getBoardList(){
		List<Board> list = new ArrayList<Board>();
		// JDBC 연동 데이터 가져오기 (곧 할거다~~)
		
		list.add(new Board("제목1","내용1"));	
		list.add(new Board("제목2","내용2"));
		list.add(new Board("제목3","내용3"));
		return list;
	}
}
