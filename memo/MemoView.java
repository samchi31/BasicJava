package memo;

import java.util.List;

public class MemoView {
	public void init() {
		System.out.println("1. 목록 | 2. 메모 | 3. 등록 | 4.수정 | 5. 삭제");
		System.out.println("메뉴입력");
	}
	public void viewMemos(MemoController controller) throws Exception {
		List<MemoVO> list = controller.getMemos();
		
		for (MemoVO vo : list) {
			System.out.println(vo);
		}
	}
}
