package memo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;


// unit test
class MemoTest {

//	@Test
//	void test() throws Exception {
//		MemoDAO dao = new MemoDAO();
//		List<MemoVO> list = dao.getMemos();
//		assertEquals(/*예측데이터*/ 0, /*실제데이터*/ list.size());
//		assertNotNull(list);	// null이면 error
//	}
//	
//	@Test
//	void selectTest() throws Exception {
//		MemoService service = new MemoService();
//		List<MemoVO> list = service.getMemos();
//		assertEquals(0, list.size());
//	}
	
	@Test
	void insertTest() throws Exception {
		MemoDAO dao = new MemoDAO();
		dao.insertMemo(new MemoVO(0,"두번째메모","안녕","sem",null,null));
		List<MemoVO> list = dao.getMemos();
		assertEquals(4,list.size());
	}
}
