package memo;

import java.util.List;

public class MemoService {
	public List<MemoVO> getMemos() throws Exception{
		MemoDAO dao = new MemoDAO();
		return dao.getMemos();       
	}
}
