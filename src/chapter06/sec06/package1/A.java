package chapter06.sec06.package1;

public class A {
	//�ʵ�
	public int field1;	    //public ���� ����
	int field2;			    //default ���� ����
	@SuppressWarnings("unused")
	private int field3;	    //private ���� ����
	
	//������
	public A() {
		field1 = 1;  //(o)
		field2 = 1;	 //(o)
		field3 = 1;  //(o)
		
		method1();  //(o)
		method2();  //(o)			Ŭ���� ������ ��� ���� ��������
		method3();  //(o)            ������ ���� ����
	}
	//�޼ҵ�
	public void method1() {}   //public ���� ����
	void method2() {}		   //default ���� ����
	private void method3() {}  //private ���� ����
}
