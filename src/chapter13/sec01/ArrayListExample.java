package chapter13.sec01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
//		ArrayList<String> list = new ArrayList<>();	//초급자
//		List<String> list2 = new ArrayList<>();		//중급자
//		list2 = new LinkedList<>();
//		list2 = new Vector<>();
		
		List<String> list2 = Arrays.asList("Java","JDBC","Servlet/JSP");
		for (String string : list2) {
			System.out.println(string);
		}
		System.out.println();
		
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println();
		list.add(2,"Database");
		list.add("myBatis");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ": "+ list.get(i));
		}
		System.out.println();
		//get
		String skill = list.get(1);
		System.out.println(skill);
		
		//remove
		list.remove(0);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ": "+ list.get(i));
		}
		System.out.println();
		
		list.remove("myBatis");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ": "+ list.get(i));
		}
		System.out.println();
		
		list.clear();
		System.out.println(list.size());
	}
}

