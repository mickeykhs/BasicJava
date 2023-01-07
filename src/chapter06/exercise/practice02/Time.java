package chapter06.exercise.practice02;

public class Time {
	// 필드
	private int hour;
	private int minute;
	private int second;

	// 생성자
	public Time() {
		
	}
	// if(hour> 0 && hour<24){
	// this.hour = hour;
	// }              요런식으로~~
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		if (hour > 24) {

				this.hour = 0;
		} else {
				this.hour = hour;
		if (minute > 60) {

				this.minute = 0;
		} else {
				this.minute = minute;
		}

		if (second > 60) {

				this.second = 0;
		} else {
				this.second = second;
			}
		}
	}

	// 매소드
	// 인스턴스의 필드가 어떤 값을 갖고 있는지 확인할 수 있는 메소드
	// return hour + ":" + minute + ":" +...이런식으로도 가능
	// String.format 은 System.out.printf랑 같다
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

}
