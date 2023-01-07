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
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy�� MM�� dd�� E���� hh:mm:ss");
		System.out.println(format.format(date));
		
		//Calendar
		
		Calendar calendar = Calendar.getInstance(); // �̱��� ����
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int dayOfMonth = calendar.get(Calendar.DATE);
		System.out.println(year + "�� "+ month + "�� " + dayOfMonth + "��");
		
		//LocalDateTime���� ����
//		LocalDateTime now = LocalDateTime.now();
//		System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy�� MM�� dd�� E���� hh:mm:ss")));
		
//		method chaining ���
		String format2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy�� MM�� dd�� E���� hh:mm:ss"));
		System.out.println(format2);
	}
}
