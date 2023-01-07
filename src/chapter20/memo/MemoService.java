package chapter20.memo;

import java.util.List;

public class MemoService {
	private MemoDAO dao = new MemoDAO();
	
	public List<MemoVO> selectList() throws Exception{
		return dao.selectList();
	}
	public MemoVO selectOne(int serchId) throws Exception {
		return dao.selectOne(serchId);
	}
	public int insertMemo(MemoVO vo) throws Exception {		
		return dao.insertMemo(vo);
	}
	public int updateMemo(MemoVO vo) throws Exception {
		return dao.updateMemo(vo);
	}
	public int deleteMemo(int deleteId) throws Exception {
		return dao.deleteMemo(deleteId);
	}
	
}
//서비스는 DAO를 묶어주는 역활