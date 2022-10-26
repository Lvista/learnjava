package com.itranswarp.learnjava;

import java.util.StringJoiner;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 * 
 * @modify Lvista
 * 
 * @title 核心类——StringJoiner
 * 
 * @description 
 * 格式1: StringJoiner(",");
 * 说明：使用“,”作为间隔，配合for循环和.add(stringarrays)来添加
 * 
 * 格式2：StringJoiner("separator","title","end");
 * 说明：第一个参数：分隔符
 * 		第二个参数：首
 * 		第二个参数：尾
 * 
 * 格式3：var s = String.join(", ", names);
 * 说明：不指定开头和结尾时使用
 * 
 */
public class Main {

	public static void main(String[] args) {
		String[] fields = { "name", "position", "salary" };
		String table = "employee";
		String select = buildSelectSql(table, fields);
		System.out.println(select);
		System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "测试成功" : "测试失败");
	}

	static String buildSelectSql(String table, String[] fields) {
		// TODO:
		String s1=" FROM "+table;
		var s = new StringJoiner(", ","SELECT ",s1);
		for(String name:fields) {
			s.add(name);
		}
		return s.toString();
	}

}
