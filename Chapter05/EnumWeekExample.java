package Chapter05;

import java.util.Calendar;

enum Week {
	MONDAY(2,"월요일"), 
	TUESDAY(3,"화요일"), 
	WEDNESDAY(4,"수요일"), 
	THURSDAY(5,"목요일"), 
	FRIDAY(6,"금요일"), 
	SATERDAY(7,"토요일"), 
	SUNDAY(1,"일요일");		//ctrl shift x <-> y
	
	Week(int Code,String KoreanName){
		this.Code = Code;
		this.KoreanName = KoreanName;
	}
	int Code;
	String KoreanName;
}


//enum HttpErrorCode{
//	OK, NOT_FOUND
//}

public class EnumWeekExample{
	public static void main(String[] args) {
		// 날짜 및 시간을 가져오는 클래스: date, calendar
		
		Calendar calender = Calendar.getInstance();
		int week = calender.get(Calendar.DAY_OF_WEEK);
		
		Week today = null;
		
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATERDAY;
			break;
//		
//		default:
//			break;
		}
		
		System.out.println("오늘 요일 : "+today);
		
		if(today == Week.SUNDAY) {
			System.out.println("축구");
		} else {
			System.out.println("자바공부");
		}
	}
}
