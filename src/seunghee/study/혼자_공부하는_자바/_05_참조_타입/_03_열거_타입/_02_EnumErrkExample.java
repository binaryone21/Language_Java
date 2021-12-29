package seunghee.study.혼자_공부하는_자바._05_참조_타입._03_열거_타입;

import java.util.Calendar;

public class _02_EnumErrkExample {
	public static void main(String[] args) {
		_01_Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
			case 1 : today = _01_Week.SUNDAY; break;
			case 2 : today = _01_Week.MONDAY; break;
			case 3 : today = _01_Week.THUSDAY; break;
			case 4 : today = _01_Week.WEDNESDAY; break;
			case 5 : today = _01_Week.THURSDAY; break;
			case 6 : today = _01_Week.FRIDAY; break;
			case 7 : today = _01_Week.SATURDAY; break;
		}
		
		System.out.println("오늘 요일  : "+today);
		
		if(today == _01_Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}
	}
}
