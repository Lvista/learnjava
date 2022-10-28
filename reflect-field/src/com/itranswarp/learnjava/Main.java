package com.itranswarp.learnjava;

import java.lang.reflect.Field;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 * 
 * @modifier Lvista
 * 
 * @description
 * reflect是一种从外部访问Class内部的运算
 */
public class Main {

	public static void main(String[] amrgs) throws IllegalAccessException {
		String name = "Xiao Ming";
		int age = 20;
		Person p = new Person();
		// TODO: 利用反射给name和age字段赋值:
		Class c = p.getClass();
		Field[] f = c.getDeclaredFields();
		f[0].setAccessible(true);
		f[1].setAccessible(true);
		f[0].set(p, name);
		f[1].set(p, age);
		System.out.println(p.getName()); // "Xiao Ming"
		System.out.println(p.getAge()); // 20
	}
}
