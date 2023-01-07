package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import chapter20.memo.MemoDAO;
import chapter20.memo.MemoVO;

class MyTest {
	MemoDAO dao = new MemoDAO();

//	@Test
	void memoSelectList() throws Exception {
		List<MemoVO> list = dao.selectList();
		assertEquals(10, list.size());
		
	}
	
	
//	@Test
	void memoSelectOne() throws Exception {
		 MemoVO vo = dao.selectOne(0);
		 assertNull(vo);
		 
	}
//	@Test
	void insert() throws Exception {
		MemoVO vo = new MemoVO();
		vo.setTitle("�ι�° �޸�");
		vo.setContents("�� ���ɽð��̴�");
		int insertMemo = dao.insertMemo(vo);
		assertEquals(1, insertMemo);
		assertEquals(11, dao.selectList().size());
		
	}
//	@Test
	void update() throws Exception {
		MemoVO vo = new MemoVO();
		vo.setId(4);
		vo.setTitle("������ ȭ����");
		vo.setContents("9�� 45���� ������.");
		
//		assertEquals(1, updateMemo); //�����ϸ� 1, �����ϸ� 0
		
		MemoVO memo = dao.selectOne(4);
		assertNull(memo.getModifyDate());
		
		dao.updateMemo(vo);
		
		memo = dao.selectOne(4);
		
		assertEquals(vo.getTitle(), memo.getTitle());
		assertNotNull(memo.getModifyDate());
		
	}
	@Test
	void delete() throws Exception{
		dao.deleteMemo(6);
		assertEquals(6, dao.selectList().size());  
	}
}
