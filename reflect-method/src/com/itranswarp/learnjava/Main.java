package com.itranswarp.learnjava;

import java.lang.reflect.Method;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 * 
 * @modifier Lvista
 * 
 * @description
 * 利用reflect.Method，通过class.getMethod()来构造一个Method对象，可
 * 访问和调用某一方法。调用Method.invoke()来调用该方法
 */
public class Main {

	public static void main(String[] args) throws Exception {
		String name = "Xiao Ming";
		int age = 20;
		Person p = new Person();
		// TODO: 利用反射调用setName和setAge方法:
		Method psnsetname = p.getClass().getMethod("setName", String.class);
		Method psnsetage = p.getClass().getMethod("setAge", int.class);
		psnsetname.invoke(p, name);
		psnsetage.invoke(p, age);

		System.out.println(p.getName()); // "Xiao Ming"
		System.out.println(p.getAge()); // 20
	}
}
