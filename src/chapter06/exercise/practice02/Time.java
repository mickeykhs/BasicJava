package chapter06.exercise.practice02;

public class Time {
	// �ʵ�
	private int hour;
	private int minute;
	private int second;

	// ������
	public Time() {
		
	}
	// if(hour> 0 && hour<24){
	// this.hour = hour;
	// }              �䷱������~~
	
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

	// �żҵ�
	// �ν��Ͻ��� �ʵ尡 � ���� ���� �ִ��� Ȯ���� �� �ִ� �޼ҵ�
	// return hour + ":" + minute + ":" +...�̷������ε� ����
	// String.format �� System.out.printf�� ����
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

}
