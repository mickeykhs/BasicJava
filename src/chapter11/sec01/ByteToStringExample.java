package chapter11.sec01;

public class ByteToStringExample {
	public static void main(String[] args) {
		//�����
		//plain text
		@SuppressWarnings("unused")
		String txt = "�ѱ�";
		//��ȣȭ �˰������� ��ȣȭ
		
		String securedTxt = "asdfasdf";
		
		//byte �迭�� ��ȯ
		byte[] securedBytes = securedTxt.getBytes();
		
		//����
		
		//���� �����͸� ��ȣȭ
		byte[] bytes = securedBytes;
		
		//����Ʈ �迭�� ���ڿ��� ��ȯ
		String receivedTxt = new String(bytes);
		System.out.println(receivedTxt);
	}
}
