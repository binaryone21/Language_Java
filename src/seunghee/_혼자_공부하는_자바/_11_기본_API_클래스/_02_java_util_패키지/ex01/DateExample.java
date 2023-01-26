package seunghee._혼자_공부하는_자바._11_기본_API_클래스._02_java_util_패키지.ex01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new  SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
}
