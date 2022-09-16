package memo;

import java.util.Scanner;

public class MemoApplication {
	public static void main(String[] args) throws Exception {
		MemoView view = new MemoView();
		MemoController controller = new MemoController();
		while (true) {
			view.init();
			Scanner scanner = new Scanner(System.in);
			int menu = Integer.parseInt(scanner.nextLine());
			switch (menu) {
			case 1: //전체 메모
				view.viewMemos(controller);
				break;
			case 3: //등록
				view.insertMemo(controller, scanner);
				break;
			case 4: //수정
				view.updateMemo(controller, scanner);
				break;
			case 5: //삭제
				view.deleteMemo(controller, scanner);
				break;

			case 0:
				//System.exit(0);	//또는
				return;
				//break;		//switch break
			}
		}
	}
}
