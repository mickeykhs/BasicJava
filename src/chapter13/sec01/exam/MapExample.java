package chapter13.sec01.exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;		//�ְ� ������ ���� ���̵� ����
		int maxScore = 0;		//�ְ� ���� ����
		int totalScore = 0;		//���� �հ� ����
		
		//�ۼ���ġ
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			Integer score = entry.getValue();
			totalScore += score;
			if(maxScore< score) {
				maxScore = score;
				name = entry.getKey();
			}
		}
		System.out.println("�������: " + (totalScore/map.size()));
		System.out.println("�ְ�����: " + maxScore);
		System.out.println("�ְ������� ���� ���̵�: " + name);
		
//		Set<Object> set = map.keySet();
//		for (Object object : set) {
//			totalScore = set.addAll(set);
//			System.out.println("�������: " + totalScore/map.size());
//		}
	}
}
