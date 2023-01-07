package chapter13.sec01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		//Map �÷��� ����
		Map<Student,Integer> map = new HashMap<>();
		
		//��ü ����
		map.put(new Student(1,"ȫ�浿"), 95);
		map.put(new Student(2,"�̼���"), 87);
		map.put(new Student(3,"�ſ��"), 100);
		map.put(new Student(4,"���ο�"), 63);
		map.put(new Student(3,"�ſ��"), 94);  
		map.put(new Student(5,"�ſ��"), 80);  
		
		System.out.println("�� ����:" +map.size());
		
		System.out.println("�ſ�� ����: " + map.get(new Student(3,"�ſ��")));
										//T���� ������ ���� 100�̾ƴ϶� 94�� ���´�
		map.remove(new Student(5,"�ſ��"));
		
		System.out.println("�� ����:" +map.size());
		
		//��ü�� �ϳ��� ó�� (��Ʈ���� ���)
		//1. ��Ʈ���� ���
		Set<Entry<Student,Integer>> entrySet = map.entrySet();
		for (Entry<Student, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println();
		//2. key�� �̿�
		Set<Student> keySet = map.keySet();
		for (Student student : keySet) {
			System.out.println(student + ":" + map.get(student));
		}
		System.out.println();
		//3. value�� �̿�: value�� �����´�.
		Collection<Integer> values = map.values();
		for (Integer integer : values) {
			System.out.println(integer);
		}
		
		//��ü �����
		map.clear(); // ��� ������ ����
	}
}
