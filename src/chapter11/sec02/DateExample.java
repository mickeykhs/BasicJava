package chapter11.sec02;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date date = new Date();
		// 2022-07-05
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh:mm:ss");
		System.out.println(format.format(date));
		
		//Calendar
		
		Calendar calendar = Calendar.getInstance(); // 싱글톤 형식
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int dayOfMonth = calendar.get(Calendar.DATE);
		System.out.println(year + "년 "+ month + "월 " + dayOfMonth + "일");
		
		//LocalDateTime으로 변경
//		LocalDateTime now = LocalDateTime.now();
//		System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 hh:mm:ss")));
		
//		method chaining 방식
		String format2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 hh:mm:ss"));
		System.out.println(format2);
	}
}
