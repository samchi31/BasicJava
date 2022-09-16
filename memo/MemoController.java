package memo;

import java.util.List;

public class MemoController {
	MemoService service = new MemoService();
	public List<MemoVO> getMemos() throws Exception{
		return service.getMemos();
	}
	
	
	public int insertMemo(MemoVO vo) throws Exception {
		return service.insertMemo(vo);
	}
	
	public int updateMemo(MemoVO vo) throws Exception {
		return service.updateMemo(vo);
	}
	
	public int deleteMemo(int deleteIndex) throws Exception {
		return service.deleteMemo(deleteIndex);
	}
	
	public MemoVO getMemo(int index) throws Exception {
		return service.getMemo(index);
	}
}
