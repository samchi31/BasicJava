package memo;

import java.util.List;

public class MemoService {
	MemoDAO dao = new MemoDAO();
	public List<MemoVO> getMemos() throws Exception{
		return dao.getMemos();       
	}
	
	public int insertMemo(MemoVO vo) throws Exception {
		return dao.insertMemo(vo);
	}
	
	public int updateMemo(MemoVO vo) throws Exception {
		return dao.updateMemo(vo);
	}
	
	public int deleteMemo(int deleteIndex) throws Exception {
		return dao.deleteMemo(deleteIndex);
	}
	
	public MemoVO getMemo(int index) throws Exception {
		return dao.getMemo(index);
	}
}
