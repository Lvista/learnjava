package com.itranswarp.learnjava;

import java.util.*;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 * 
 * @modifier Lvista
 * 
 * @description
 * 在调用list.contains或者list.indexof这样的方法时，传递一个自定义
 * class实例参数会被判断为false，这是因为官方库的equals只提供了
 * 自建库的equals方法，但是对于自定义class无法判断，这就需要在class内部
 * 进行equals覆写，这样才能使用上面所说的方法。
 * 注意这里使用的是instanceof来判断是否是相同类，因为instanceof能判断
 * 子类的继承关系，这对于面向对象编程是更好的，而通过getclass()只能获取
 * 精确的类的信息而无法判断继承关系.
 */
public class Main {
	public static void main(String[] args) {
		List<Person> list = List.of(new Person("Xiao", "Ming", 18), new Person("Xiao", "Hong", 25),
				new Person("Bob", "Smith", 20));
		boolean exist = list.contains(new Person("Bob", "Smith", 20));
		System.out.println(exist ? "测试成功!" : "测试失败!");
	}
}

class Person {
	String firstName;
	String lastName;
	int age;

	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	/**
	 * TODO: 覆写equals方法
	 */
	@Override
	public boolean equals(Object o) {
		if (o instanceof Person) {//使用instanceof而不是getclass
			Person p = (Person) o;
			return Objects.equals(
					this.firstName, p.firstName) 
					&& Objects.equals(this.lastName, p.lastName)
					&& this.age == p.age;
		}
		return false;
	}
}
