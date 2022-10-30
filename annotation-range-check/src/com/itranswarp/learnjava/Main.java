package com.itranswarp.learnjava;

import java.lang.reflect.Field;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 * 
 * @modifier Lvista
 * 
 * @description 注解可用于检查，可以是开发阶段，也可以是编译阶段，也可以是运行阶段
 * 
 */
public class Main {

	public static void main(String[] args) throws Exception {
		Person p1 = new Person("Bob", "Beijing", 20);
		Person p2 = new Person("", "Shanghai", 20);
		Person p3 = new Person("Alice", "Shanghai", 199);
		for (Person p : new Person[] { p1, p2, p3 }) {
			try {
				check(p);
//				System.out.println("Person " + p + " checked ok.");
			} catch (IllegalArgumentException e) {
//				System.out.println("Person " + p + " checked failed: " + e);
			}
		}
	}

	static void check(Person person) throws IllegalArgumentException, ReflectiveOperationException {
		for (Field field : person.getClass().getFields()) {// 获取字段信息
			Range range = field.getAnnotation(Range.class);// 获取Annotation
			if (range != null) {//如果不是空，证明存在Annotation
				Object value = field.get(person);//获取字段
				// TODO:
				if (value instanceof String) {
					String s = (String) value;
					if (s.length() < range.max() || s.length() > range.min()) {
						throw new IllegalArgumentException("Invalid field:" + field.getName());
					}
				}
			}
		}
	}
}
