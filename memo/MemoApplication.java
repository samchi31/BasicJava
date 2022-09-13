package memo;

import java.util.Scanner;

public class MemoApplication {
	public static void main(String[] args) throws Exception {
		MemoView view = new MemoView();
		view.init();
		Scanner scanner = new Scanner(System.in);
		int menu = Integer.parseInt(scanner.nextLine());
		
		switch (menu) {
		case 1:
			view.viewMemos(new MemoController());
			break;
		
		default:
			break;
		}
	}
}
