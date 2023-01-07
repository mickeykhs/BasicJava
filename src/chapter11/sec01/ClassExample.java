package chapter11.sec01;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassExample {
	public static void main(String[] args) throws Exception {
		//Reflection
		@SuppressWarnings({ "unused", "rawtypes" })
		Class class1 = Member.class;
		@SuppressWarnings({ "unused", "rawtypes" })
		Class class2 = Class.forName("chapter11.sec01.Member");
		
		Member member = new Member("a001", "±èÀº´ë", 100);
		@SuppressWarnings("rawtypes")
		Class class3 = member.getClass();
		
		Field[] fields = class3.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getName());
		}
		
		Method[] methods = class3.getDeclaredMethods();
		System.out.println(methods.length);
		methods[0].setAccessible(true);
		methods[0].invoke(member,"È«±æµ¿");
		
	}
}
