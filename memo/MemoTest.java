package memo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;


// unit test
class MemoTest {

	@Test
	void test() throws Exception {
		MemoDAO dao = new MemoDAO();
		List<MemoVO> list = dao.getMemos();
		assertEquals(/*예측데이터*/ 0, /*실제데이터*/ list.size());
		assertNotNull(list);	// null이면 error
	}
	
	@Test
	void serviceTest() throws Exception {
		MemoService service = new MemoService();
		List<MemoVO> list = service.getMemos();
		assertEquals(0, list.size());
	}

}
