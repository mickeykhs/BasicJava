package chapter13.sec01.exam;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

		public List <Board> getBoardList(){
		List<Board> list = new ArrayList<Board>();
		// JDBC ���� ������ �������� (�� �ҰŴ�~~)
		
		list.add(new Board("����1","����1"));	
		list.add(new Board("����2","����2"));
		list.add(new Board("����3","����3"));
		return list;
	}
}
